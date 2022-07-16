import java.util.Arrays;

/**
 * 배열복사
 * @author TJ
 * 배열을 복사하는 이유
 * 1.방을 넓히거나 줄일 목적이 있는 경우
 * 2.참조변수이기 때문에, 다른 프로세스(작업)에 영향을 받을 수 있기 때문에
 * 그 영향도를 없애고 독립적으로 사용하고 싶은 경우
 *
 */
public class ArrayCopyExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		//1번 목적
		//for문으로 하나씩 복사시키는 방법
		//학생이 5명인 학교
		//5명의 학생의 점수를 입력
		
		int stdScores[] = {90,80,70,60,70};
		
		for (int i = 0; i<stdScores.length; i++) {
			System.out.println(i+"번째 학생 점수 " + stdScores[i] + "점");
		}
		
		//--오늘 한명 전학옴, 그놈이 시험을 봄
		//--80점받음
		//stdScores <-- 학생 방이 5개 밖에 없음
		//--앞으로 늘어날수도 있으니, stdScores2 라는 10개의 방에 있는 집을 만들어서 이사가자.
		
		int stdScores2[] = new int [10];
		
		int i = 0;
		for(; i<stdScores.length; i++) {
			stdScores2[i] = stdScores[i];
		}
		
		stdScores2[i] = 80;
		
		
		for(int x=0; x<stdScores2.length; x++) {
			if(stdScores2[x] == 0) break;
			System.out.println(x + "번째 학생 점수" + stdScores2[x] +"점");
			
				
		}
		
		
		//2.System.arrayCopy()
		//학생 3명이 있는 학교schholA에 학생 D가 전학을 왔어요.
		
		//--Src (Source)
		String[] schoolAStds = {"A","B","C"};
		
		//--Dest 복하살 대상
		String[] schoolBStds = new String[10];
		
		System.arraycopy(schoolAStds, 0, schoolBStds, 5, schoolAStds.length);
		//arraycopy(src, src시작인덱스, dest, dest 시작인덱스, 복사할 대상의 길이)
		schoolBStds[3] = "D";
		
		for(int x = 0; x < schoolBStds.length; x++) {
			System.out.println(x + "번째 학생" + schoolBStds[x]);
			
		}
		
		
		//3.Arrays.copyOf
		
		 String[] schoolCStds = Arrays.copyOf(schoolAStds, 20);
		
		 //대상배열 변수 = Arrays.copyOf(src원본배열, 새로생길 배열의 총길이)
		 for(int x = 0; x < schoolCStds.length; x++) {
				System.out.println(x + "번째 학생" + schoolCStds[x]);
		 }
		schoolCStds[5] = "F";
		 for(int x = 0; x < schoolCStds.length; x++) {
				System.out.println(x + "번째 학생" + schoolCStds[x]);
		 }
		
		

		
		
		
		
	}

}
