import java.sql.Connection;
import java.sql.DriverManager;

public class Port {
	
public static void main(String args[]) throws Exception{
		
		//데이터베이스 커넥션 객체
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = null;
		
		conn = DriverManager.getConnection(
				"jdbc:mysql://javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com :3306/shdnjs7104_db",
				"shdnjs7104",
				"shdnjs71041234");
		if(conn == null) {
			System.out.println("연결이 안됐어요");
		} else {
			System.out.println("연결이 됐어요");
		}
		
}

}
