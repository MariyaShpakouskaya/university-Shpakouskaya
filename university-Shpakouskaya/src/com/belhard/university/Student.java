package com.belhard.university;

import java.util.Date;

public class Student {
	private static long counter = 1;
	private long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private int yearOfStudy;
	private boolean isBudget;
	private Address address;
	private double averageGradePoint;

	public Student(String firstName, String lastName, double averageGradePoint) {
		id = counter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.averageGradePoint = averageGradePoint;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public double getAverageGradePoint() {
		return averageGradePoint;
	}

	public void setAverageGradePoint(double averageGradePoint) {
		this.averageGradePoint = averageGradePoint;
	}
}
