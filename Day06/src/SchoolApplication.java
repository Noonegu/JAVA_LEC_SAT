
public class SchoolApplication {
	
	public static void main(String[] args) {
		
		//상속을 통한 is a 관계
		// is a 란 뭐냐?
		//A is a B (A는 B이다.)
		//인간은 동물이다, 남학생은 학생이다
		//여학생은 학생이다, 학생은 인간이다, 인간은 동물이다.
		
		Student std1 = new BoyStudent("박노원",45,6,10);
		// Student 데이터 타입에 BoyStudent 값을 넣을 수 있느냐? 참
		// BoyStudent is a Student ->남학생은 학생이다. ->
		// 학생클래스의 상속을 받는다.
		
		BoyStudent bStd = new BoyStudent("고양이",10,1,10);
		//GirlStudent gStd = new BoyStudent("고양이2", 10,2,10); 
		//GirlStudent 데이터 타입에 BoyStudent 값을 넣을수 있느냐? 거짓
		//BoyStudent is not a GirlStudent (남학생은 여학생이 아니다.->)
		//BoyStudent 와 GirlStudent 는 상속관계가 아니다.
		
	  Student[] classRoom = new Student[10];
	  classRoom[0] = new BoyStudent("박노원",25,1,10);
	
	
	for(Object std : classRoom) {
		if(std == null) break;
		Student tmp = (Student)std;
		tmp.sayGender();
	}

	}
}
