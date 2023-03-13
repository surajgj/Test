package com.xworkz.dog.dto;

public class DogDto {

	private String breadName;
	private String color;
	private String gender;
	private int age;
	private String breadType;

	public DogDto() {
		super();
	}

	public DogDto(String breadName, String color, String gender, int age, String breadType) {
		super();
		this.breadName = breadName;
		this.color = color;
		this.gender = gender;
		this.age = age;
		this.breadType = breadType;
	}


	public String getBreadName() {
		return breadName;
	}

	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreadType() {
		return breadType;
	}

	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}

	@Override
	public String toString() {
		return "DogDto [breadName=" + breadName + ", color=" + color + ", gender=" + gender + ", age=" + age
				+ ", breadType=" + breadType + "]";
	}

	
}
