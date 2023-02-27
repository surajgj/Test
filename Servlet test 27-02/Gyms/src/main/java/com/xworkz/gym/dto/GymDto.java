package com.xworkz.gym.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "gym_info")
@NamedQuery(name = "readAll", query = "Select read from GymDto read")
public class GymDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String gym;
	private String address;
	private String name;
	private String number;
	private String pinCode;
	
	public GymDto(String gym, String address, String name, String number, String pinCode) {
		super();
		this.gym = gym;
		this.address = address;
		this.name = name;
		this.number = number;
		this.pinCode = pinCode;
	}

	public GymDto() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGym() {
		return gym;
	}

	public void setGym(String gym) {
		this.gym = gym;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "GymDto [id=" + id + ", gym=" + gym + ", address=" + address + ", name=" + name + ", number=" + number
				+ ", pinCode=" + pinCode + "]";
	}
	
}
