/**
 * 반보문 For
 * 
 * for (초기화식; 조건식; 증감식){
 *  ...실행부
 *  }
 * @author TJ
 *
 */
public class ForLoopExample {
	
	public static void main(String[] args) {
		
		for(int x1 = 2; x1 <=9; x1 ++) { //x축
			
			System.out.println("=======" + x1+ "단========");
			for(int y1 = 1; y1 <= 9; y1++) {
				System.out.println(x1 + " x " + y1 + "=" + (x1* y1));
				
				if ( y1 == 5 ) break;
			}
		}
		
		
	}
}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		


