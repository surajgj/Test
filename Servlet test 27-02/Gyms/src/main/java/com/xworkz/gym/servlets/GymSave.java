package com.xworkz.gym.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.gym.dto.GymDto;
import com.xworkz.gym.service.GymService;
import com.xworkz.gym.service.GymServiceImpl;

@WebServlet(value = "/save")
public class GymSave extends HttpServlet{

	GymService service = new GymServiceImpl();
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String gym = req.getParameter("gym");
		String address = req.getParameter("address");
		String name = req.getParameter("name");
		String number = req.getParameter("number");
		String pinCode = req.getParameter("pinCode");
		
		GymDto dto = new GymDto(gym, address, name, number, pinCode);
		
		boolean status = service.save(dto);
		
		if(status) {
			req.getRequestDispatcher("read.jsp").forward(req, res);
		}
	}
	
}
