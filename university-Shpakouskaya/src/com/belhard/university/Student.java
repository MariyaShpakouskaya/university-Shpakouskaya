package com.belhard.university;

public class Student extends Person {
	private static long counter = 0;
	private long id;
	private int yearOfStudy;
	private boolean isBudget;
	private Address address;
	private double gradePointAverage;

	public Student(String firstName, String lastName, double gradePointAverage) {
		super(firstName, lastName);
		id = ++counter;
		this.gradePointAverage = gradePointAverage;
	}

	public long getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public boolean getIsBudget() {
		return isBudget;
	}

	public void setBudget(boolean isBudget) {
		this.isBudget = isBudget;
	}

	public double getGradePointAverage() {
		return gradePointAverage;
	}

	public void setGradePointAverage(double gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}
}
