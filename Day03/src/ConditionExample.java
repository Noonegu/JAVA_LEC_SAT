/*
 * 조건문(Condition)
 * ->1. if, 2. switch
 * 
 * if(조건식){
 * ... 실행문
 * }
 * --> 조건문이 참일 경우에만 ... 실행문이 실행됩니다.
 * 
 */

public class ConditionExample {
	public static void main(String[] args) {
		
		int gainedPoint = 89; //Integer.parseInt(args[0]);
		
		
		System.out.println("당신이 얻은 점수는 " + gainedPoint + "점 입니다.");
		if(gainedPoint >= 90) {//gainPoint >= 90이 참 일때만 실행
			System.out.println("입사하세요.");
		}else if ( gainedPoint >= 80) {
			System.out.println("인턴 3개월");
		} else {
			System.out.println("집에가세요.");
		}
		//---------------------------------------------------------------
		//1.나이가 6세이상
		//2.키가 120이상
		//3.심장병이 없을때
		
		int age = 5;
		int height = 120;
		boolean heartAttacted = false;
		
		if( age >= 6 && height >= 120 && !heartAttacted) {
			System.out.println("타라");
		}else {
			System.out.println("못타");
		}
		
		
		if ( age >= 6) {
			
			if (height >= 120) {
				
				if(!heartAttacted) {
					System.out.println("타라");
					
				}else {
				  System.out.println("병원부터");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		}
	}


