package com.belhard.university;

public class Student extends Person implements Identifiable {
	private int yearOfStudy;
	private boolean isBudget;
	private Address address;
	private double gradePointAverage;

	public Student(String firstName, String lastName, double gradePointAverage) {
		super(firstName, lastName);
		this.gradePointAverage = gradePointAverage;
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

	@Override
	public void introduceYourself() {
		System.out.println("My name is " + getFirstName() + ". I'm a student of university.\n");
	}

	@Override
	public String toString() {
		return super.toString() + " /average grade point: " + getGradePointAverage() + "/\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Student student = (Student) obj;
		return super.equals(obj) && gradePointAverage == student.gradePointAverage;
	}

	@Override
	public int hashCode() {
		int hash = super.hashCode();
		hash += gradePointAverage;
		return hash;
	}
}
