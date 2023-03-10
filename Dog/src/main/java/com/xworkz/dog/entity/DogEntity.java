package com.xworkz.dog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "dog_data")
@NamedQuery(name = "findById", query = "Select entity from DogEntity entity where entity.id =: id ")
@NamedQuery(name = "readAll", query = "Select entity from DogEntity entity")
@NamedQuery(name = "updateTypeById", query = "update DogEntity ent set ent.breadType=:type Where ent.id=:id")
@NamedQuery(name = "deleteByColorAndAge", query = "Delete from DogEntity ent where ent.color=:color and ent.age=:age")
public class DogEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "breadName")
	private String breadName;
	@Column(name = "color")
	private String color;
	@Column(name = "gender")
	private String gender;
	@Column(name = "age")
	private int age;
	@Column(name = "breadType")
	private String breadType;

	public DogEntity() {
		super();
	}

	public DogEntity(String breadName, String color, String gender, int age, String breadType) {
		super();
		this.breadName = breadName;
		this.color = color;
		this.gender = gender;
		this.age = age;
		this.breadType = breadType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "DogDto [id=" + id + ", breadName=" + breadName + ", color=" + color + ", gender=" + gender + ", age="
				+ age + ", breadType=" + breadType + "]";
	}

}