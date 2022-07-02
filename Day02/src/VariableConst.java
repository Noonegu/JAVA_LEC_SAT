/**
 * 상수와 변수의 차이
 * @author TJ
 *
 */
public class VariableConst {
	
	public static void main(String[] args) {
		
		//--변수선언
		int var_age = 50;
		var_age = 100; //--변수는 '변'할수 있는 값(수)
		var_age = -100; //-- 따라서 값이 변하더라도 오류가 발생하지 않습니다.
		
		//-- 상수는
		final int MAX_AGE = 1000; //-- 상수는 final 이라는 키워드를 사용합니다.
		//max_age = 100; //--상수는 변경이 불가능합니다.
		
		final int MAX_HEIGHT;
		MAX_HEIGHT = 180;  // 사용하면 개맞음
		
		System.out.println(MAX_HEIGHT);
		
		final double PI = 3.1412333333333333333333333333;
		
	}

}
