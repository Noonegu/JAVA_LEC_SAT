/**
 * << 좌측 Shift
 * 1<< 3 ->0000 0001
 * 		 ->0000 1XXX
 *       ->0000 1000
 * 		 ->좌측 시프트는		 추가된 우측비트에 모두 0을 채운다.
 * 
 * @author TJ
 *
 */


public class ShifrExample {
	
	public static void main(String[] args) {
		
		//-- Left Shift
		int x = 2;
		x = x << 2;
		System.out.println("x << 2 = "+ x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 2;
		//x = <<3;
		
		System.out.println("x << 3 = "+ x);
		System.out.println(Integer.toBinaryString(x));
		
		//-- Right Shift
		//-->>
		x = -1;
		System.out.println(Integer.toBinaryString(x));
		
		x = x >> 10;
		System.out.println("x >> 10 = "+ x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 100;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 3;
		System.out.println("x > 3 = "+ x);
		System.out.println(Integer.toBinaryString(x));
		
		//상위비트를 무조건 0으로 채워줍니다.
		
		System.out.println("==============");
		x = -1;
		System.out.println(Integer.toBinaryString(x));
		x = x >>> 3;
		System.out.println(" x >>> 3 = " + x);
		System.out.println(Integer.toBinaryString(x));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
