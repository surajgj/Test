package com.xworkz.dog.service;
 
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.dog.dto.DogDto;
import com.xworkz.dog.entity.DogEntity;
import com.xworkz.dog.repo.DogRepo;

@Service
public class DogServiceImpl implements DogService {

	@Autowired
	private DogRepo repo;
	
	@Override
	public boolean save(DogDto dto, Model model) {
		if(dto != null && dto.getAge() >1) {
			DogEntity entity = new DogEntity();
			BeanUtils.copyProperties(dto, entity);
			
			System.out.println(dto);
			System.out.println(entity);
			boolean status = repo.save(entity);
			if(status) {
				return true;
			}
		}
		return false;
	}

	@Override
	public DogEntity findById(int id) {
		if(id > 0) {
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public List<DogEntity> readAll() {
		return repo.readAll();
	}

}
