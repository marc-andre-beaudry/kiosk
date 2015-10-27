package com.maillets.kiosk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable = false)
	private String address;

	@Column(nullable = false)
	private int latitudeDeg;

	@Column(nullable = false)
	private int latitudeMin;

	@Column(nullable = false)
	private int longitudeDeg;

	@Column(nullable = false)
	private int longitudeMin;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getLatitudeDeg() {
		return latitudeDeg;
	}

	public void setLatitudeDeg(int latitudeDeg) {
		this.latitudeDeg = latitudeDeg;
	}

	public int getLatitudeMin() {
		return latitudeMin;
	}

	public void setLatitudeMin(int latitudeMin) {
		this.latitudeMin = latitudeMin;
	}

	public int getLongitudeDeg() {
		return longitudeDeg;
	}

	public void setLongitudeDeg(int longitudeDeg) {
		this.longitudeDeg = longitudeDeg;
	}

	public int getLongitudeMin() {
		return longitudeMin;
	}

	public void setLongitudeMin(int longitudeMin) {
		this.longitudeMin = longitudeMin;
	}
}
