package com.belhard.university;

import java.math.BigDecimal;

import com.belhard.university.Money.Currency;

public class AccauntantUtil {

	public static Money countTotalSalary(Employee[] employees) {
		BigDecimal total = BigDecimal.ZERO;
		for (int i = 0; i < employees.length; i++) {
			Employee employee = employees[i];
			Money emplSalary = employee.getSalary();
			BigDecimal amount = emplSalary.getAmount();
			double premiumPercent = employee.getYearOfExperience() * 0.01;
			BigDecimal award = BigDecimal.valueOf(premiumPercent).multiply(amount);
			BigDecimal totalSalary = amount.add(award);
			total = total.add(totalSalary);
		}
		return new Money(Currency.BLR, total);
	}

	public static Money countTotalHolidayPay(Employee[] employees, int vacationDays) {
		BigDecimal total = BigDecimal.ZERO;
		for (int i = 0; i < employees.length; i++) {
			Employee employee = employees[i];
			Money emplSalary = employee.getSalary();
			BigDecimal amount = emplSalary.getAmount();
			double costDayOfHoliday = vacationDays * 0.1;
			BigDecimal holidayPay = BigDecimal.valueOf(costDayOfHoliday).multiply(amount);
			total = total.add(holidayPay);
		}
		return new Money(Currency.BLR, total);
	}

}
