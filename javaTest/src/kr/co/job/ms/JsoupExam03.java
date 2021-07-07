package kr.co.job.ms;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.op.gg/ranking/ladder/";
		Document doc = null;
		String[] name = new String[5];
		String a;
		
		try {
			doc = Jsoup.connect(url).get();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		Elements element = doc.select("div.Content");
		System.out.println(element);
		System.out.println("===========================");
		Iterator<Element> ie1 = element.select("div.ranking-highest").iterator();
		a = element.select("div.ranking-highest__rank").text();
		for(int i = 0; i<5; i++) {
			name[i] = a;
		}
		for(int i = 0; i<5; i++) {
			System.out.println(name[i]);
		}
//		while(ie1.hasNext()) {
//			System.out.println(ie1.next().text()+"\t");
//		}
//		
		System.out.println("ㅎㅇ");
		
	}

}
