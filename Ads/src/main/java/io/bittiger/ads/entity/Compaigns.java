package io.bittiger.ads.entity;

public class Compaigns {

	private String id;
	private String name;
	private double budget;
	
	public Compaigns(String id, String name, double budget) {
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
