package jdbc.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsert {

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // 1. jdbc 드라이버 등록 : mysql db 접근하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok! " + connection);

            // 2. mysql db 에 연결 객체 얻어오기
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg");
            System.out.println("Connection Ok " + connection);

            //3. 매개변수화된 sql 문 작성
            String query = "" +
                    "Insert into users (userid, username, userpassword, userage, useremail)" +
                    "values (?, ?, ? ,? ,?)";

            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, "mycaptain622");
            pstmt.setString(2, "서유미");
            pstmt.setString(3, "1234");
            pstmt.setInt(4, 30);
            pstmt.setString(5, "mycaptain622@gmail.com");

            //4. sql 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println(rows + "rows inserted");
            //5. PreparedStatement 객체 닫기
            pstmt.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try{
                    connection.close();
                    System.out.println("Connection closed");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
