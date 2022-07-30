/**
 * 
 * Overloading/ Overrideing
 * @author TJ
 * 
 * 오버로딩은 같은 이름의 다른 리턴타입/ 다른 인자로 정의하는 메서드들의 집합
 * 메서드 중첩( 같은 이름의 메소드를 자원에 따라 확장한다.)
 * 리턴타입이 틀리거나, 인자의수 혹은 인자의 데이터 타입이 틀리거나
 * 
 * -Overriding
 * 상속관계에서 같은 메서드를 재정의하는거
 * ex) 내 할아버지의 전화걸때 쓰는 리소스와 내가 전화걸때 쓰는 리소스는 다르다.
 * 따라서 같은 전화를 걸더라도 구현부는 다를 수 있다.
 */ 
class P{
	
	int add() {
		return 0;
	}
	int add(int x, int y) {
		System.out.println("add(int x,int y) 호출");
		"박노원".getBytes();
		return x+y;
	}
	
	float add(float x, float y) {
		System.out.println("add(float x,float y) 호출");
		return x+y;
	}
}

class C extends P{
	
	int add(int x) {
	    System.out.println("C.add(int x) 호출");
		return x + 10;
	}
	
	@Override
	int add (int x, int y) {
		System.out.println("C.add(int x, int y)호출");
				return x - y;
	}
	
	
	

	
}

public class OverloadingExample {
	
	public static void main(String[] args) {
		C c = new C();
		c.add(10,20); //각 인자수와 타입에 맞는 메서드가 실행된다.
		c.add(1.0f, 2.0f);
		c.add(100);
		
		P p = new P();
		p.add(10,20);
		((P)p).add(10,20);
		p.add(1.0f,2.0f);
		
		//--객체의 캐스팅은 예외발생시, 컴파일에러가 발생하지 않습니다.
		//런타임때 발생합니다.
		//상위객체를 하위객체로 형변환읋 했다.
		//((C)p).add(10,20); 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
