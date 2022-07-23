/**
 * 변수의 사용 범위(Scope)
 * 
 * 변수는 어디까지 사용할 수 있는것인가?
 * 
 * @author TJ
 *
 */
public class ScopeExample {
	
	//클래스 전역 변수
	static String name = "노원구";
	
	public static int add(int x, int y) {
		int z = x + y; //지역변수
		System.out.println(name);
		return z;
	}
	
	public static void scopeTest(int a) {
		a++;
		System.out.println(name);
	}
	
	public static void printName() {
		String name = "호호호";
		System.out.println(name);
	}
	
	public static void changeClassVarValue() {
		name = "관악구";
		System.out.println(name);
	}
	
	public static void main(String args[]) {
		
		System.out.println(name);
		changeClassVarValue();
		printName();
		int a = 10;
		scopeTest(a);
		System.out.println(a);
		
		//changeClassVarValue()사용전
	//	printName();
	//	printName();
	//	printName();
		
	//	changeClassVarValue();
	//	printName();
	//	printName();
	//	printName();
		
	}

}
