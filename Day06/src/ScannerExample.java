import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
	//1	System.out.println("입력값은 " + input + " 입니다.");
		
		
		int width, height;
		
		while(true) {
		System.out.println("가로 길이를 입력하세요 :");
		width = Integer.parseInt(sc.nextLine());
		System.out.println("세로길이를 입력하세요 :");
		height = Integer.parseInt(sc.nextLine());
		
		Circle rc = new Circle(width);
		
		System.out.println("Shape is " + rc.type);
		System.out.println("원의 길이는 " + width);
		System.out.println("원의 면적은 " + rc.area());
		System.out.println("원의 길이는 " + rc.length()); 
		System.out.println("프로그램을 종료하시겠습니까? ( Y / N )");
		String command = sc.nextLine();
		if ( command.equals ("Y")) {break;}
		}
	}

}
