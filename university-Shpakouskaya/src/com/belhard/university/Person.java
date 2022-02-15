package com.belhard.university;

import java.util.Date;

public abstract class Person implements Identifiable {

	private static long counter = 0;
	private long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;

	public Person(String firstName, String lastName) {
		id = ++counter;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public abstract void introduceYourself();

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

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[id:" + getId() + "] " + getFirstName() + " " + getLastName();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Person person = (Person) obj;
		return id == person.id
				&& (firstName == person.firstName || (firstName != null && firstName.equals(person.getFirstName())))
				&& (lastName == person.lastName || (lastName != null && lastName.equals(person.getLastName())));
	}

	@Override
	public int hashCode() {
		final int code = 31;
		int hash = 1;
		hash = code * hash + ((firstName == null) ? 0 : firstName.hashCode());
		hash = code * hash + (int) id;
		hash = code * hash + ((lastName == null) ? 0 : lastName.hashCode());
		return hash;
	}
}
