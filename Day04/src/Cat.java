/**
 * Cat 클래스
 * @author TJ
 *
 *Cat은 "동물"
 */
public class Cat extends Animal{
	
	public Cat() {//생성자
		super.name ="냥이";
	}
	
	public Cat(String name) {
		super.name = name;
	}
	
	//CAT의 특정 행위 (method)
	public void grrrrr() {
		System.out.println("grgr");	
	}
	public void bark() {
		System.out.println("야옹야옹");
	}
	
}
/**
 * Dog 클래스
 * @author TJ
 *
 *개도 동물(Animal)
 */
class Dog extends Animal {
	
	public Dog(String name) {
		super.name = name;
	}
	
	public Dog() {
		super.name ="멍멍이";
	}
	//Dog의 특정 행위
	public void sick() {
		System.out.println("sick");
	}
}
