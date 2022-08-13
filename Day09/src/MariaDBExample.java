import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



//--DATABASE 연결
//--필요한 정보가 뭐뭐?
//--주소(데이타베스가 어디있냐?) --Host
//--계정: 아이디/패스워드
//--사용할 데이터베이스 명

//--JDBC
//--SQL문을 날리기위한 작업에 5가지
//-- 1.드라이버 로딩( mysql driver, oracle driver, mssql driver...)
//--2.연결 (DriverManager.getConnection())
//--   + 주소(Host),아이디,패스워드,tkdyd Database명)
//--3.DB - 프로그램상 질의문dmf 전달하고, 결과를 받을 수 있는 고속도로 만들기
//   + Statement 객체 생성
//   + conn.createStament();
//--4.SQL문 작성
//--  String sql = "select * from student";
//--5.쿼리전송 후 처리
// 	stmt.execute()..executeQuery...등등
//--6.Select 의 계열의 경우 Recordset으로 처리
//	RecordSet rs = stmt.executeQuery(sql);
//--- + Select 외 다른 쿼리들 (Insert, delete, Update)는 ResultSet이 없음
//		stmt,execute(sql)
//-- !)자원반납을 해줘야한다. (프로그램이 끝날때)
//-- a) DB연결 닫기 conn.close();
//-- b) Statement 닫기 stmt.close();

//-- Query (SQL)문 날리고

//--결과물 확인


public class MariaDBExample {
	
	public static void main(String args[]) throws Exception{
		
		//데이터베이스 커넥션 객체
		Connection conn = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:7306/javadb",
				"root",
				"MusicqrT1@");
		
		if(conn == null) {
			System.out.println("연결이 안됐어요");
		} else {
			System.out.println("연결이 됐어요");
		}
		
		//--자바에서 DB에 있는 students 테이블의 데이터를 전부 끌어와 봅시다
		String sql = "Select * from students";
		
		//--자바에서 DB에 쿼리를 날릴때
		//--1.Statement
		//--2.Select (Read)의 경우는 이 결과값을 ResultSet(RecordSet)
		Statement stmt = conn.createStatement(); 
		//Statement 역할은 연결된 RDBMS에 SQL구문을 전달하는 객체
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getString(2));
			System.out.println(rs.getString("student_name"));
		}
		
		//--데이터넣기
		//sql = "insert into students (student_id,student_name)"
				//+"values (3,'하악이');";
		
		boolean isAffected = stmt.execute(sql);
		if(!isAffected)System.out.println("입력성공");
		else System.out.println("입력실패");
	
	//--데이터 삭제
	sql = "delete from students where student_name = '하악이'";
	stmt.execute(sql);
	
	//--데이터 변경
	sql = "update students set student_name = '변태' where student_id=1";
	stmt.execute(sql);
	
	//--자원반납.
	stmt.close();
	conn.close();
	}
}
