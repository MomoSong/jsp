import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class Crawler {
	public static void main(String[] args) throws Exception {

		ArrayList<String> titleAr = new ArrayList<>();
		ArrayList<String> offererAr = new ArrayList<>();
		ArrayList<String> dateTimeAr = new ArrayList<>();
		ArrayList<String> articleAr = new ArrayList<>();
		ArrayList<String> imageAr = new ArrayList<>();

		
		
		for (int idx = 0; idx <= 1; idx++) {
			Document doc = Jsoup.connect(
					"http://finance.daum.net/news/news_list.daum?type=stock&section=&limit=30&page=" + (idx + 1)).get();

			// 제목
			Elements title = doc.select("ul.newsList li b");
			for (Element es : title) {
				titleAr.add(es.text());
			}

			// 신문사이름
			Elements offerer = doc.select("ul.newsList li span.offerer");
			for (Element es : offerer) {
				offererAr.add(es.text());
			}

			// 기사 작성 시간
			 Elements datetime = doc.select("ul.newsList li span.datetime");
			 for(Element es : datetime) {
				dateTimeAr.add(es.text());
			 }
			 
			 
			// a태그를 얻어 아래의 for 문에서 절대주소 얻기위한 준비 재료
			Elements els = doc.select(".newsList li a");

			for (Element es : els) {
				 System.out.println(es.text());
				// 각 링크의 절대주소
				// System.out.println(es.attr("abs:href"));
				String url = es.attr("abs:href");
				Document docArticle = Jsoup.connect(url).get();

				Elements docEls = docArticle.select("div#dmcfContents");
				Elements imageEls = docArticle.select("div#dmcfContents img");

				for (Element docEs : docEls) {
					articleAr.add(docEs.text());
				}
				for (Element imageEs : imageEls) {
					imageAr.add(imageEs.attr("abs:src"));
				}
			}
		}
		
		for(int i = 0; i < titleAr.size(); i++) {
			System.out.println(i+1);
			System.out.println(titleAr.get(i));
			System.out.println(offererAr.get(i));
			System.out.println(dateTimeAr.get(i));
			System.out.println(articleAr.get(i));
			if(imageAr.size() > 0) {
				System.out.println(imageAr.get(i));				
			}
			System.out.println("==============================================================");
		}
		
	}
}
