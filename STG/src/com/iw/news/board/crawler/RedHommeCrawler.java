package com.iw.news.board.crawler;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class RedHommeCrawler implements IExcute{
	String bestUrl = "http://redhomme.com/category/best-seller/387/";
	String newProductUrl = "http://redhomme.com/category/new-in/111/";
	
	@Override
	public ArrayList<String> excute() throws IOException {
		// TODO Auto-generated method stub
		Document best = Jsoup.connect(bestUrl).get();
		Document newIn = Jsoup.connect(newProductUrl).get();
 
		Elements bestEls = best.select(""); 
		
		return null;
	}
	
	
}
