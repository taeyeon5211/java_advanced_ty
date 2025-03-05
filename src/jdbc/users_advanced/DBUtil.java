package jdbc.users_advanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * packageName   : jdbc.advanced.users
 * fileName      : DBUtil
 * author        : a
 * date          : 2025-02-28
 * description   : 데이터베이스 연결 작업 클래스
 * =================================================
 * DATE             AUTHOR             NOTE
 * -------------------------------------------------
 * 2025-02-28        a
 */
public class DBUtil {
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok! " + connection);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg");
            System.out.println("Connection Ok " + connection);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  connection;
    }
}
