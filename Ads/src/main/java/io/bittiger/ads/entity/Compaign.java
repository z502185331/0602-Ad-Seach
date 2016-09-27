package io.bittiger.ads.entity;

public class Compaign {

	private String id;
	private String name;
	private double budget;
	
	public Compaign() {
		this.id = "";
		this.name = "";
		this.budget = 0;
	}
	
	public Compaign(String id, String name, double budget) {
		super();
		this.id = id;
		this.name = name;
		this.budget = budget;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void modifyBudget(double budget) {
		this.budget += budget;
	}
	
	
	
}
