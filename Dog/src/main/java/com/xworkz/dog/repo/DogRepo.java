package com.xworkz.dog.repo;

import java.util.List;

import com.xworkz.dog.entity.DogEntity;

public interface DogRepo {

	public boolean save(DogEntity entity);

	public DogEntity findById(int id);

	public List<DogEntity> readAll();

	public boolean updateTypebyID(String breadType, int id);

	public boolean deleteByColorAndAge(String color, int age);

}
