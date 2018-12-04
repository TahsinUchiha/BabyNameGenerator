package com.infosys.domain;

import javax.persistence.Id;

import org.bson.types.ObjectId;

public class Babies {
	
	@Id
	public ObjectId _id;
	private String baby;
	private String date;

	public Babies() {

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}



	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getBaby() {
		return baby;
	}

	public void setBaby(String baby) {
		this.baby = baby;
	}

	@Override
	public String toString() {
		return "Babies [baby=" + baby + ", date=" + date + "]";
	}


}
