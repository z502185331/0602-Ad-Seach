package io.bittiger.ads.entity;

import java.util.List;

/**
 * Created by ChenCheng on 9/25/2016.
 */
public class Ad {

    private String adId;
    private String campaignId;
    private List<String> keywords;
    private int clickCount;
    private int displayCount;
    private double bid;
    private String url;
    private String content;

    
    
	public Ad() {
		super();
	}


	public Ad(String adId, String campaignId, List<String> keywords, int clickCount, int displayCount, double bid, String url,
			String content) {
		super();
		this.adId = adId;
		this.campaignId = campaignId;
		this.keywords = keywords;
		this.clickCount = clickCount;
		this.displayCount = displayCount;
		this.bid = bid;
		this.url = url;
		this.content = content;
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


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
    

}
