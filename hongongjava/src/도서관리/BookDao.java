package 도서관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	// field
	String url = "jdbc:Oracle:thin:@localhost:1521:xe";
	String id = "java";
	String pass = "1234";
	
	Connection conn = null;
	
	int rows;
	String sql = null;
	
	// constructor
	
	// method
	// 1. 연결 설정 메소드(void)
	public void getOpen() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(url, id, pass);
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
	} // End Open
	
	// 2. 연결 끊기 메소드(void)
	public void getClose() {
		if(conn != null) {
			try {
				conn.close();
				System.out.println("연결끊기");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} // End if
	} // End Close
	
	// 3. insert 메소드(int)
	public int insert(Book book) {
		getOpen();
		
		try {
			sql = "INSERT INTO book (bnum, title, writer, price) "
					+ "VALUES (?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBnum());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getWriter());
			pstmt.setInt(4, book.getPrice());
				
			rows = pstmt.executeUpdate();
			
			return rows;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		getClose();
		return 0;
		
	} // End insert
	
	// 4. select : 조건에 따른 검색(책제목) 메소드(String)
	public Book selectOne(String title) {
		getOpen();
		
		sql = "SELECT *"
			+ "FROM   book"
			+ "WHERE  title = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Book bk = new Book();
				
				bk.setBnum(rs.getString(1));
				bk.setTitle(rs.getString(2));
				bk.setWriter(rs.getString(3));
				bk.setPrice(rs.getInt(4));
				getClose();
				return bk;
			}
			
		} catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	} // End SelectOne
	
	// 5. select : 목록전체 조회 메소드
	// 6. delete메소드 (북번호 이용)
	// 7. update메소드 (책 제목의 가격과 책번호 수정)
}
