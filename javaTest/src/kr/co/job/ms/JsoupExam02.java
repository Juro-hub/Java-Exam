package kr.co.job.ms;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupExam02 {
	public static void main(String[] args) throws IOException {
	
		String url = "http://www.cgv.co.kr/movies/";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		Elements element = doc.select("div.sect-movie-chart");
		System.out.println(element);
		System.out.println("============================");
		
		Iterator<Element> ie1 = element.select("strong.rank").iterator();
		Iterator<Element> ie2 = element.select("strong.title").iterator();
		
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text()+"\t"+ie2.next().text());
		}
		
	}
	
}
