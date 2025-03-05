package jdbc.board;

import java.sql.*;

public class BoardSelectOne {
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

            //매개변수화된 SQL문 작성
            String query = new StringBuilder()
                    .append(" select * from boards ")
                    .append(" where bno = ?")
                    .toString();

            PreparedStatement pstmt = connection.prepareStatement(query , Statement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, 2);

            //4. sql 문 실행
            rs = pstmt.executeQuery();

            if (rs.next()) {
                Board board = new Board();
                board.setBno(rs.getInt("bno"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.setBdate(rs.getDate("bdate"));
                board.setBfilename(rs.getString("bfilename"));
                board.setBfiledata(rs.getBlob("bfiledata"));
                System.out.println(board);
            } else {
                System.out.println("찾을 수 없습니다.");
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
