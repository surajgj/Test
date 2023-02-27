package com.xworkz.gym.service;

import java.util.List;

import com.xworkz.gym.dto.GymDto;
import com.xworkz.gym.repo.GymRepo;
import com.xworkz.gym.repo.GymRepoImpl;

public class GymServiceImpl implements GymService {

	GymRepo repo = new GymRepoImpl();
	
	@Override
	public boolean save(GymDto dto) {
		if(dto.getNumber().length() == 10) {
			if(dto.getPinCode().length() == 6) {
				return repo.save(dto);
			}
			return false;
		}
		return false;
	}

	@Override
	public List<GymDto> readAll() {
		return repo.readAll();
	}

}
