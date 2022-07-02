/**
 * Type Casting (형변환)
 * @author TJ
 *
 */
public class VariableCasting {
	
	//-- Java Application Starting Point (Entry Point)
	public static void main(String[] args){
		//-- 묵시적 형변환
		byte a = 127;
		short b = a; // short(2) > byte(1)
		
		long c = 1000;
		float d = c;
		
		System.out.println("long to float : " + d);
		
		//--명시적 형변환 = 큰데에서 작은데로 갈때
		
		short aa = 127;
		byte bb = (byte)aa;
		
		System.out.println("short to byte(명시적) : " + bb);
		
		aa = 128;
		bb = (byte)aa;
		
		System.out.println(bb);
		
		String tel = "010-3333-3333";
		String tel2 = "01022223333";
		
		System.out.println(tel2);
		
		//--- 실수 -> 정수로 형변환을 하는경우는
		//--- 소숫점 이하 버림.
		double aaa = 3.141562;
		int bbb = (int)aaa;
		System.out.println(bbb);
		
		long regNo = 8888881234567L;
	
		
	}
	
}
