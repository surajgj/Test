package com.xworkz.gym.repo;

import java.util.List;

import com.xworkz.gym.dto.GymDto;

public interface GymRepo {

	public boolean save(GymDto dto);
	
	public List<GymDto> readAll();
	
}
