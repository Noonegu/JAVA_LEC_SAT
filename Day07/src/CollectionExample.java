//Collection API
//가변 배열이다.
//배열과 다르게, 길이가 고정되지 않고, 유동적이다.
import java.util.*;
public class CollectionExample {
	
	public static void main(String[] args) {
		
		
		int arrA[] = new int[3];
		arrA[0] = 1;
		arrA[0] = 2;
		arrA[0] = 3;
		
		//배열은 길이가 고정되어 있습니다.
		//Collection -> 2개의 인터페이스가 있습니다.
		//List, Set
		//List 중복허용, 데이터는 차례대로 쌓인다.
		//Set 중복불허용, 데이터는 지 맘데로 쌓인다.
		
		List list = new ArrayList();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		//list.get(0) == arrA[0]
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}
	}

}

//--Student Value Object
class StudentA {
	
	public void prtinName() {
		System.out.println("하악하악");
	}
}


























