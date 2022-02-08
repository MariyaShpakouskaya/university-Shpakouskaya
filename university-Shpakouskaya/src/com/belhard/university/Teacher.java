package com.belhard.university;

public class Teacher extends Employee {
	private String position;
	private String subject;
	private String academicDegree;

	public Teacher(String firstName, String lastName, int yearOfExperience) {
		super(firstName, lastName, yearOfExperience);
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

}
