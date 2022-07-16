/**
 * 학생 성적 출력(배열이용)
 * @author TJ
 *
 */
public class ArrayString {
	
	public static void main(String[] args) {
		
		String[] stds = {"이종석","박은진","이지우"};
		int[] stdScores = {90,100,98};
		int totalScore = 0;
		//1. 점수를 출력한다
		
		
		for(int i = 0; i< stds.length; i++) {
			System.out.print(stds[i] + ":" + stdScores[i] + "\n");
			totalScore += stdScores[i]; 
		}
		//2. 평균을 구한다.
		System.out.println("평균 총합 : " + (totalScore / stds.length) + "점");
		//3. 총합을 구한다.
		
		
		
		
	}

}
