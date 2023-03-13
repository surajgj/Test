package com.xworkz.dog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dog.dto.DogDto;
import com.xworkz.dog.entity.DogEntity;
import com.xworkz.dog.service.DogService;

@Component
@RequestMapping("/")
public class DogController {

	@Autowired
	private DogService service;
	
	@RequestMapping("/save")
	public String onSave(DogDto dto, Model model) {
		System.out.println(dto);
		boolean status = service.save(dto, model);
		if(status) {
			model.addAttribute("Result", "Data Saved Sucessfully to Database");
			return "Second";
		}
		model.addAttribute("Result", "Data is not Saved, Please Check your Data");
		return "First";
	}
	
	@RequestMapping("/find")
	public String onFind(int id, Model model) {
		DogEntity data = service.findById(id);
		if(data != null) {
			model.addAttribute("Result", "Here is Your Data");
			model.addAttribute("Data", data);
			return "Third";
		}
		model.addAttribute("Result", "Please Check Your Input");
		return "Second";	
	}
	
	@RequestMapping("/read")
	public String onRead(Model model) {
		List<DogEntity> entity = service.readAll();
		if(entity != null) {
			model.addAttribute("AllData", entity);
			return "Fourth";
		}
		model.addAttribute("Error", "Your Data is Null");
		return "Fourth";
	}
	
}
