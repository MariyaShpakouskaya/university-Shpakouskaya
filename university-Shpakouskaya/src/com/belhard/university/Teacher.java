package com.belhard.university;

public class Teacher extends Employee {
	private String position;
	private Subject subject;
	private String academicDegree;
	private NameOfDepartment name;

	public Teacher(String firstName, String lastName, int yearOfExperience) {
		super(firstName, lastName, yearOfExperience);
	}

	public enum Subject {
		HIGHER_MATH, PHYSICS, PROGRAM_TECHNOLOGY, BASICS_OF_COMPUTER_SCIENCE, PHILOSOPHY
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public NameOfDepartment getName() {
		return name;
	}

	public void setName(NameOfDepartment name) {
		this.name = name;
	}

	@Override
	public void introduceYourself() {
		System.out.println(
				"My name is " + getFirstName() + " " + getLastName() + ". I'm a teacher of " + getName() + ".\n");
	}

	@Override
	public String toString() {
		return super.toString() + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Teacher teacher = (Teacher) obj;
		return super.equals(obj)
				&& (subject == teacher.subject || (subject != null && subject.equals(teacher.getSubject())));
	}

	@Override
	public int hashCode() {
		int hash = super.hashCode();
		hash += ((subject == null) ? 0 : subject.hashCode());
		return hash;
	}

}
