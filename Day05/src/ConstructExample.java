
class Student{
	
	String name; //= "박노원";
	int grade;
	String gender;
	
	//-- 생성자 선언
	public Student() {
		name = "박노원";
		grade = 6;
		gender = "남성";
	}
	
	public Student(String p_name,int p_grade, String p_gender) {
		name = name;
		grade = grade;
		gender = gender;
	}
	
	//-------------------------------------------------------------------
	
	void sayName() {
		System.out.println("이름은 " + name + "입니다. ");
	}
	
	void sayGrade() {
		System.out.println("저는 " + grade + "학년 이에요. ");
	}
	
	
}
public class ConstructExample {

	public static void main(String args []) {
		
		Student std = new Student();
		std.sayName();
		std.sayGrade();
		
		Student std2 = new Student("뭔데", 2, "남성");
		std2.sayName();
		std2.sayGrade();
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	}
}
