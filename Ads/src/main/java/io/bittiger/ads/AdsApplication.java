package io.bittiger.ads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.bittiger.ads.api.DBConnector;

@SpringBootApplication
public class AdsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AdsApplication.class, args);
		
		DBConnector connector = new DBConnector();
//		System.out.println(connector.createAd("57ec53942a78a1d8d636f03d", "adidas,soccer,shoes", 2.5, "", "This is ad for soccer shoes"));
		for (String id : connector.getAdsByKeyword("nike")) {
			System.out.println(connector.getAdsById(id));
		}
	}
}
