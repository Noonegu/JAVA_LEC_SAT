import javax.sound.midi.SysexMessage;

interface PersonAction{
	
	int giveMoney();
	void sayName();
	
}

interface DogAction {
	
	void bark();
}

class Person implements PersonAction, DogAction {
	
	@Override
	public int giveMoney() {
		return 1000;
	}
	
	@Override
	public void sayName() {
		System.out.println("하악");
	}
	
	@Override
	public void bark() {
		System.out.println("술 먹으면 왈왈");
	}
}

public class InterfaceExample {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.sayName();
		
		PersonAction action = new Person();
		DogAction dAction = new Person();
		
		action.sayName();
		dAction.bark();
		((PersonAction)dAction).sayName();
		
		((Person)dAction).sayName();
		((Person)dAction).bark();
		((Person)dAction).giveMoney();
		((Person)dAction).sayName();
		
		System.out.println("action instance of PersonAction :" + (action instanceof PersonAction));
		System.out.println("action instance of DogAction :" + (action instanceof DogAction));
		
		
	}

}
