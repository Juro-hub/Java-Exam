package kr.co.job.ms;

import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupExam01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		String s;
		String url = "https://www.dhlottery.co.kr/common.do?method=main";
		Document doc = Jsoup.connect(url).get();
		//System.out.println(doc);
		try {
			doc = Jsoup.connect(url).get();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		Elements element = doc.select("div.content");
		System.out.println("===========================");
		Iterator<Element> ie1 = element.select("p.num").iterator();
		System.out.println(ie1);
		while(ie1.hasNext()) {
			System.out.println(ie1.next().text()+"\t");
		}
		
		System.out.println("ㅎㅇ");
	}

}
