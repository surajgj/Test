package com.xworkz.gym.service;

import java.util.List;

import com.xworkz.gym.dto.GymDto;

public interface GymService {

	public boolean save(GymDto dto);
	
	public List<GymDto> readAll();
	
}
