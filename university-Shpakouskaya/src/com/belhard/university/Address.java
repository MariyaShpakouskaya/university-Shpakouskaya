package com.belhard.university;

public class Address {
	private String country;
	private String city;
	private String street;
	private String house;
	private int flat;

	public Address(String country, String city, String street, String house) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.house = house;
	}

	public Address(String country, String city, String street, String house, int flat) {
		this(country, city, street, house);
		this.flat = flat;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public int getFlat() {
		return flat;
	}

	public void setFlat(int flat) {
		this.flat = flat;
	}
}
