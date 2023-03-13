package com.xworkz.dog.service;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.dog.dto.DogDto;
import com.xworkz.dog.entity.DogEntity;

public interface DogService {
	
	public boolean save(DogDto dto, Model model);
	
	public DogEntity findById(int id);
	
	public List<DogEntity> readAll();

}
