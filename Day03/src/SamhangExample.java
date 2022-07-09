/**
 * 3항 연산자
 * 조건식 ? 값1 : 값2
 * @author TJ
 *
 */
public class SamhangExample {
	
	public static void main(String[] args) {
		
		int point = 90; //커트라인
		int gainedPoint = 80; //얻은 점수
		
	    String isPassedString = "";
		
		isPassedString = point > gainedPoint  ? "불합격" : "합격";
		
		System.out.println("선생님은 " + isPassedString + "하셨습니다.");
		
		
		
	}

}
