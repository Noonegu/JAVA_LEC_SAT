/**
 * 
 * 접근제한자
 * 
 * public / protected / default / private
 * 
 * 접근제한자는 아래와 같은 곳에 붙을 수 있습니다.
 * 1. 클래스  (클래스는 publoc / default 만 가능)
 * 2. 메서드
 * 3. 클래스 전역 변수
 * @author TJ
 *
 */

class Class01 { //나를 호출할 수 있는건 내 방에 있는 나를 아는 사람들
	 			//같은폴더(같은 패키지)내에 있는 사람들(프로그램/클래스)
	
	private int money = 100; //--내가 가진돈은 너밖에 접근할 수 없어 (private)
	String name = "박노원"; //--내 이름을 바꿀수 있는 사람은, 내방에있는 나를 아는 사람들 (default)
	public int getMoney(int m) { //나한테 돈을 가져갈수 있는 사람은
								 //나랑 아는 (다른 방에 있어도) 사람들 (pretected)
		money -= m;
		return m;
	}
	
	public void sayName() {//--내 이름을 물어볼 수 있는 사람은, 전셰게 모두 (public)
		System.out.println(name);
	}
}
public class AcessExample {
	
	public static void main(String args) {
		
		Class01 cs = new Class01();
		//cs.money=1000; //private 직접 접근 불가
		cs.name = "하아기";
		int money = cs.getMoney(50);
		System.out.println("빌린돈 " + money + "원진짜 ");
	}
	
}
