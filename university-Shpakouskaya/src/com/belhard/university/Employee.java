package com.belhard.university;

import java.math.BigDecimal;

import com.belhard.university.Money.Currency;

public class Employee extends Person {
	private static long counter = 0;
	private long id;
	private int yearOfExperience;
	private Money salary = new Money(Currency.BLR, BigDecimal.ZERO);
	private String department;
	private int hoursOfWork;
	private int vacationDays;

	public Employee(String firstName, String lastName, int yearOfExperience) {
		super(firstName, lastName);
		this.yearOfExperience = yearOfExperience;
		id = ++counter;
	}

	public long getId() {
		return id;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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
}
