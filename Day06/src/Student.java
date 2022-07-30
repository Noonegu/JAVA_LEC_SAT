
public class Student {
	
	String name;
	int age;
	int grade;
	int score;
	int schoolTime; // 등교시간
	String gender; //성별
	
	//생성자
	Student(){
		schoolTime = 9; //9시까지 들어와야 지각이 아닙니다.
	}
	
	public void sayNamew() {
		System.out.println("이름은 "+ name + "입니다.");
		}
	
	public void sayGreade() {
		System.out.println("학년은 " + grade + "입니다.");
	}
	
	public void sayGender() {
		System.out.println(gender + "학생이에요.");
	}
	
	public void sayScore() {
		System.out.println(score + "점 입니다.");
	}
	
	public void play() {
		System.out.println("어디로 놀러가자.");
	}
	
	public void gotoCR() {
		System.out.println("화장실 갑니다.");
	}
	
	//지각 여부
	public void printIsLateness(int inTime) {
		if( inTime > this.schoolTime) {
			System.out.println("지각");
		} else {
			System.out.println("세이프");
	}
	}
	}
