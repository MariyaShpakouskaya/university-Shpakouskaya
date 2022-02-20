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

	@Override
	public void introduceYourself() {
		System.out.println("My name is " + getFirstName() + ". I work as a cleaner for " + getYearOfExperience()
				+ " years. I love my work.\n");
	}

	@Override
	public String toString() {
		return super.toString() + ". " + getParlor();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Cleaner cleaner = (Cleaner) obj;
		return super.equals(obj)
				&& (parlor == cleaner.parlor || (parlor != null && parlor.equals(cleaner.getParlor())));
	}

	@Override
	public int hashCode() {
		int hash = super.hashCode();
		hash += ((parlor == null) ? 0 : parlor.hashCode());
		return hash;
	}

}
