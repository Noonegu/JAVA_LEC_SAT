
public class StirngFormatExample {
	
	public static void main(String[] args) {
		
		//이종석, 만세 점수는 a점입니다.
		int a = 100;
		String message = "이종석, 만세 점수는 " + a + "점 입니다.";
		System.out.println(message);
		
		String message2 = "%s, 만세 점수는 %d점 입니다.";
		message2 = String.format(message2,"하악하악", a);
		System.out.println(message2);
		
		//StringBuffer
		//String 같은 문자열 클래스
		//String 불변객체 "이종석" + "만세" -> "이종석" , "만세" , "이종석 만세"
		
		StringBuffer sb = new StringBuffer("이종석");
		sb.append("만세");
		System.out.println(sb);
		
		String msg = " 꺄꺄꺄꺄 ";
		System.out.println("문자열 msg는 " + msg.length()+ "자 입니다.");
		
		//원칙적으로 중간 공백을 제거하는 메서드는 없다.
		"까까 꾸꾸".trim();
		
		String trimVal = "까까 꾸꾸 꼬꼬";
		trimVal = trimALLBlankChar(trimVal);
	}
	
	private static String trimALLBlankChar(String trimVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public String trimMiddleEmptyChar(String src) {
		
		int len = src.length(); // 문자열의 길이를 구합니다.
		char dest[] = new char[len];
		src.getChars(0,  len, dest, 0);
		
		String result = "";
		for(char var : dest) {
			if(var == ' ') {
				continue;
			}
			result += var;
		}
		return result;
	}

}












