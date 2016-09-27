package io.bittiger.ads.entity;

import java.util.List;

/**
 * Created by ChenCheng on 9/25/2016.
 */
public class Ads {

    private String adId;
    private String campaignId;
    private List<String> keywords;
    private int clickCount;
    private int displayCount;
    private double bid;
    private String url;
    private String intro;

	public Ads(String adId, String campaignId, List<String> keywords, int clickCount, int displayCount, double bid, String url,
			String intro) {
		super();
		this.adId = adId;
		this.campaignId = campaignId;
		this.keywords = keywords;
		this.clickCount = clickCount;
		this.displayCount = displayCount;
		this.bid = bid;
		this.url = url;
		this.intro = intro;
	}
    
	
	public String getAdId() {
		return adId;
	}

	
	public String getCampaignId() {
		return campaignId;
	}
	
	
	public List<String> getKeywords() {
		return keywords;
	}


	public void addKeywords(String keyword) {
		this.keywords.add(keyword);
	}


	public double getpClick() {
		return (double) this.clickCount / this.displayCount;
	}
	
	public void addDisplayCount() {
		this.displayCount += 1;
	}
	
	public void addClickCount() {
		this.clickCount += 1;
	}

	public double getBid() {
		return bid;
	}

	public void setBid(double bid) {
		this.bid = bid;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getIntro() {
		return intro;
	}


	public void setIntro(String intro) {
		this.intro = intro;
	}
    

}
