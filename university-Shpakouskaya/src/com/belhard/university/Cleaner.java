package com.belhard.university;

public class Cleaner extends Employee {

	private String parlor;

	public Cleaner(String firstName, String lastName, int yearOfExperience, String parlor) {
		super(firstName, lastName, yearOfExperience);
		this.parlor = parlor;
	}

	public String getParlor() {
		return parlor;
	}

	public void setParlor(String parlor) {
		this.parlor = parlor;
	}

}
