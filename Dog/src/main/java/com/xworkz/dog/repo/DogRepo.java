package com.xworkz.dog.repo;

import java.util.List;

import com.xworkz.dog.entity.DogEntity;

public interface DogRepo {

	public boolean save(DogEntity entity);

	public DogEntity findById(int id);

	public List<DogEntity> readAll();

}
