package com.belhard.university;

import java.math.BigDecimal;

import com.belhard.university.Money.Currency;

public abstract class Employee extends Person implements Identifiable {
	private int yearOfExperience;
	private Money salary = new Money(Currency.BLR, BigDecimal.ZERO);
	private int hoursOfWork;
	private int vacationDays;

	public Employee(String firstName, String lastName, int yearOfExperience) {
		super(firstName, lastName);
		this.yearOfExperience = yearOfExperience;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public Money getSalary() {
		return salary;
	}

	public void setSalary(Money salary) {
		this.salary = salary;
	}

	public int getHoursOfWork() {
		return hoursOfWork;
	}

	public void setHoursOfWork(int hoursOfWork) {
		this.hoursOfWork = hoursOfWork;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Employee employee = (Employee) obj;
		return super.equals(obj) && yearOfExperience == employee.yearOfExperience;
	}

	@Override
	public int hashCode() {
		int hash = super.hashCode();
		hash += yearOfExperience;
		return hash;
	}

}
