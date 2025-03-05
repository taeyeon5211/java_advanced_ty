package jdbc.board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BoardInsert {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // 1. jdbc 드라이버 등록 : mysql db 접근하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok! " + connection);

            // 2. mysql db 에 연결 객체 얻어오기
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg");
            System.out.println("Connection Ok " + connection);

            String query = "" +
                    "INSERT INTO boards (btitle,bcontent,bwriter,bdate,bfilename,bfiledata) " +
                    "VALUES (?,?,?,now(),?,?); ";

            //매개변수화된 SQL문 작성
            PreparedStatement pstmt = connection.prepareStatement(query , Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1,"봄이로구나");
            pstmt.setString(2,"봄이 오는데 꽃구경은 못하고 강의실에 잡혀서 jdbc 프로그래밍을 하는 나!");
            pstmt.setString(3,"sym");
            pstmt.setString(4,"spring.jpg");

            try {
                pstmt.setBlob(5, new FileInputStream("src/jdbc/images/spring.jpg"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }


            //4. sql 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println(rows + "rows inserted");

            //bno 값 얻어오기
            if(rows == 1) {
                  ResultSet rs = pstmt.getGeneratedKeys();
                  if(rs.next()){
                      int bno = rs.getInt(1);
                      System.out.println(bno);
                  }
                  rs.close();

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
