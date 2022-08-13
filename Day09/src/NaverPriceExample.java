import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverPriceExample {

	public static void main(String[] args) throws Exception{
		
	
		//--txt
		
		while (true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("검색어를 입력해 주세요 :");
			String search_text = sc.nextLine();
				
			String url = "https://search.shopping.naver.com/search/all?where=all&frm=NVSCTAB&query=%s";
			url = String.format(url, search_text);
			
			
			//1.연걸
			Connection conn = Jsoup.connect((url));
			//url = "https://daum.net";
			
			//2.HTML 가져오기
			Document html = conn.get();
			//System.out.println(html.toString());
			
			//3. HTML에서 내가 원하는 목록
			Elements ele = html.select(".list_basis > div > div"); //list_basis라는 html 클래스명 (style sheet)을 찝는다.
									   //자바스크립트에서는 이런방법을 Selector
								       //document.getElementByld() Name()
			
			//System.out.println(ele.toString());
			
			
			//4. 상품목록 HTML 만 가져와보기
	//		for(Element val : ele) {
	//			
	//			String goodsName = val.select(".basicList_link__1MaTN").text();
	//			String price = val.select (".price_num__2WUXn").text();
	//			String link = val.select(".basicList_link__1MaTN").attr("href");
	//			
	//			System.out.println(goodsName);
	//			System.out.println(price);
	//			System.out.println(link);
	//			//System.out.println(val.toString());
	//			System.out.println("----------------------------------------------");
	//		}
			
			writeExcelFile(search_text + ".csv", ele);
			System.out.println("CSV를 저장하였습니다.");
			
			//프로그램 종료 여부
			System.out.println("프로그램을 종료 하시겠습니까? (Y,N) : ");
			String command = sc.nextLine();
			if(command.toUpperCase().equals("Y")) {
				break;
			}
		}
		
	}


	//--Excel (CSV - comma split verstion)
	public static void writeExcelFile(String fileName, Elements list) throws Exception {
		String title = "상품명, 가격, 상품링크\r\n";
		String lineFormat = "%s,%s,%s\r\n";
		
		File file = new File(fileName); //fileName = "d:\naverPrice.csv";
		BufferedWriter writer = null;
		
		String result = title;
		int rank = 1;
		for(Element item : list) {
			String goodsName = item.select(".basicList_link__1MaTN").text();
			String price = item.select (".price_num__2WUXn").text();
			String link = item.select(".basicList_link__1MaTN").attr("href");
			result += String.format(lineFormat, rank++, goodsName, price, link );
		}
	
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(result);
		} catch(Exception ex) {
			System.out.println("CSV작성중 에외가 발생하였습니다.");
		} finally {
			if(writer != null) writer.close();
		}

	}
	
}
