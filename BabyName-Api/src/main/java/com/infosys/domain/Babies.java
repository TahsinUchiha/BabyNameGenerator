package com.infosys.domain;

public class Babies {

	private String baby;
	private String date;

	public Babies() {

	}

	@Override
	public String toString() {
		return "Babies [baby=" + baby + ", date=" + date + "]";
	}

	public String getBaby() {
		return baby;
	}

	public void setBaby(String baby) {
		this.baby = baby;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
