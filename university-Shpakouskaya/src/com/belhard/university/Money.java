package com.belhard.university;

import java.math.BigDecimal;

public class Money {

	private Currency currency;
	private BigDecimal amount;

	public enum Currency {
		BLR, USD, EURO
	}

	public Money(Currency currency, BigDecimal amount) {
		this.currency = currency;
		this.amount = amount;
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
