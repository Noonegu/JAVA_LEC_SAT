/**
 * 배열
 * 
 * @author TJ
 *
 *-배열의 선언방법
 *1. 데이터타입 [] 변수명 (int[]arrInt;)
 *2. 데이터타입 변수명[] (int arrInt[];)
 */
public class ArrayExample {
	
	public static void main(String[] args) {
		
		
		//A. 방을 만들고, 각 호실에 데이터를 따로 입력
		int[] arrInt = new int[5]; //방을 만듭니다. 5개의 방
		arrInt[0]=1; //2.각 호실에 값을 집어넣습니다.
		arrInt[1]=2; 
		arrInt[2]=3;
		arrInt[3]=4;
		arrInt[4]=5;
		
		// 호실(Index)은 배열길이 -1
		
		//B.선언과 동시에, 각 호실에 데이터를 한번에 입력하는 방식
		
		for(int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
		}
		
		int arrInt2[]= {11,22,33,44,55};
		System.out.println(arrInt);
		
		System.out.println("arrInt[0] =" +arrInt[0] );
		System.out.println("arrInt[1] =" +arrInt2[1]);
		
		//System.out.println("arrInt[5] =" + arrInt[5]); //방이없어도 에러는안남. 출력할 때 에러가 남.
		
		
		//--A붜 Z까지 char[]에 넣어라
		
		char[] alpha = new char[26];
		for(int i = 0; i <alpha.length; i++) {
			alpha[i] = (char)(i + 65);
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.println((char)alpha[i]);
		}
		
		//--배열이 없는 경우
		//--5명의 학생 점수 평균을 내라
		int stuA = 90;
		int stuB = 100;
		int stuC = 30;
		
		System.out.println((stuA+stuB+stuC) / 3);
		
		//--배열을 사용
		int stuScore[] = {90,100,30};
		int totalScore = 0;
		for( int i = 0; i <stuScore.length; i++) {
			totalScore += stuScore[i];
		}
		System.out.println(totalScore / 3);
		
		 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
