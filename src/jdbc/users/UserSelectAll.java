package jdbc.users;

import java.sql.*;

public class UserSelectAll {

    public static void main(String[] args) {
        Connection connection = null;
        ResultSet rs = null;

        try {
            // 1. jdbc 드라이버 등록 : mysql db 접근하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok! " + connection);

            // 2. mysql db 에 연결 객체 얻어오기
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg");
            System.out.println("Connection Ok " + connection);

            //3. 매개변수화된 sql 문 작성
            String query = new StringBuilder()
                    .append(" select * from users")
                    .toString();

            PreparedStatement pstmt = connection.prepareStatement(query);

            //4. sql 문 실행
            rs = pstmt.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setUserid(rs.getString("userid"));
                user.setUsername(rs.getString("username"));
                user.setUserpassword(rs.getString("userpassword"));
                user.setUserage(rs.getInt("userage"));
                user.setUseremail(rs.getString("useremail"));
                System.out.println(user);
            }

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
