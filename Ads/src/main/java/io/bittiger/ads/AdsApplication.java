package io.bittiger.ads;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.bittiger.ads.api.DBConnector;
import io.bittiger.ads.entity.Ad;
import io.bittiger.core.AdFilter;
import io.bittiger.core.AdRanker;


@SpringBootApplication
public class AdsApplication {
	

	public static void main(String[] args) {
//		SpringApplication.run(AdsApplication.class, args);
		
		DBConnector connector = new DBConnector();
//		connector.createCampaign("Sports Clothes", 1000);
//		System.out.println(connector.createAd("57f2eabc2a78a148ae40aa7c", "nike,basketball,running,t-shirt", 2.8, "", "This is ad for soccer shoes"));
//		for (String id : connector.getAdsByKeyword("shoes")) {
//			System.out.println(connector.getAdsById(id));
//		}
		
		AdRanker adRanker = new AdRanker();
		AdFilter adFilter = new AdFilter(3);
		List<String> keywords = new ArrayList<>();
		keywords.add("nike");
		keywords.add("soccer");
		for (Ad ad : adFilter.execute(adRanker.execute(keywords))) {
			System.out.println(ad);
		}

		
	}
}
