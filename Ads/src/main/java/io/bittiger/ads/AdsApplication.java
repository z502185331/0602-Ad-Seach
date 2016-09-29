package io.bittiger.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.bittiger.ads.api.DBConnector;
import io.bittiger.ads.entity.Ad;
import io.bittiger.core.AdRanker;

@SpringBootApplication
public class AdsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AdsApplication.class, args);
		
		DBConnector connector = new DBConnector();
//		System.out.println(connector.createAd("57ec53942a78a1d8d636f03d", "adidas,basketball,shoes", 2.4, "", "This is ad for soccer shoes"));
//		for (String id : connector.getAdsByKeyword("shoes")) {
//			System.out.println(connector.getAdsById(id));
//		}
		
		AdRanker adRanker = new AdRanker();
		List<String> keywords = new ArrayList<>();
		keywords.add("nike");
		for (Ad ad : adRanker.execute(keywords)) {
			System.out.println(ad.getRankScore());
		}
	}
}
