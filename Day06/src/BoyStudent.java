
public class BoyStudent extends Student{
	
	BoyStudent(String name,
			   int age,
			   int grade,
			   int score){
		
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.score = score;
		this.gender = "남";
		}
	
	@Override
	public void gotoCR() {
		System.out.println("여자 화장실을 갑니다.");
		
		
	}
}
