import java.util.*;

public class ExceptionHandleExample {
	
	public static void main(String[] args) throws Exception{
		
		Program p = new Program();
		
		int result = 0;
		
		try {
			result = p.getPoint();
		} catch(InputMismatchException ex) {
			System.out.println("숫자만 입력 가능합니다.");
		} catch(Exception ex) {
			System.out.println("알수없는 예외가 발생하였습니다.");
		} finally {
			System.out.println("pink");
		}
		
		System.out.println("점수는 :" + result + "점 입니다.");
	}

}


class Program{
	
	public int getPoint() throws InputMismatchException,Exception{
		
		System.out.println("점수를 입력해 주세여: ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		return point;
	}
}
