package com.belhard.university;

import java.math.BigDecimal;
import com.belhard.university.exceptions.*;

public class Money {

	private Currency currency;
	private BigDecimal amount;

	public enum Currency {
		BLR, USD, EURO
	}

	public Money(Currency currency, BigDecimal amount) {
		this.currency = currency;
		this.amount = amount;
		if (amount.doubleValue() < 0)
			throw new NegativeNumberException(
					"Salary is not be negative. Set positive salary employee.The programm is stopped.");
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

}
