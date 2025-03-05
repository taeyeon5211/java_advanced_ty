package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // 1. jdbc 드라이버 등록 : mysql db 접근하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok! " + connection);

            // 2. mysql db 에 연결 객체 얻어오기
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg");
            System.out.println("Connection Ok " + connection);
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
