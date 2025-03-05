package jdbc.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdate {

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
/*
            String query = "" +
                    "update users set userpassword = ? where userid = ?";

            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, "12345");
            pstmt.setString(2, "mycaptain622");
*/
            String query = new StringBuilder()
                    .append(" update users set ")
                    .append(" userpassword = ?")
                    .append(" where userid = ?").toString();

            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, "1234578910");
            pstmt.setString(2, "mycaptain622");

            //4. sql 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " rows update completed");
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
