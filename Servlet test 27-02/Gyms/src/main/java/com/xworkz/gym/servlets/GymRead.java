package com.xworkz.gym.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.gym.dto.GymDto;
import com.xworkz.gym.service.GymService;
import com.xworkz.gym.service.GymServiceImpl;

@WebServlet(value = "/read")
public class GymRead extends HttpServlet {
	
	GymService service = new GymServiceImpl();
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		PrintWriter write = res.getWriter();
		
		List<GymDto> data = service.readAll();
		write.print("<html> "
				+ "    <head> "
				+ " "
				+ "        <title> "
				+ " "
				+ "        </title> "
				+ "        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\"> "
				+ "        <style>\r\n"
				+ "            th, td{\r\n"
				+ "				height: 40px; \r\n"
				+ "				margin: 10px;\r\n"
				+ "                text-align: center;\r\n"
				+ "            }\r\n"
				+ "            table{\r\n"
				+ "                width: 800px;\r\n"
				+ "                \r\n"
				+ "            }\r\n"
				+ "            \r\n"
				+ "        </style> "
				+ "    </head> "
				+ "    <body> "
				+ "        <table class=\"table-bordered\"> "
				+ "            <thead> "
				+ " "
				+ "                <tr> "
				+ "                    <th>Id</th> "
				+ "                    <th>Gym Name</th> "
				+ "                    <th>Address</th> "
				+ "                    <th>Trainer name</th> "
				+ "                    <th>Mobile Number</th> "
				+ "                    <th>Pin Code</th> "
				+ "                </tr> "
				+ "            </thead> ");
		
		write.print("<tbody>");
		for (GymDto dto : data) {
			
			write.print("<tr>");
			write.print("<td>");
			write.print(dto.getId());
			write.print("</td>");
			
			write.print("<td>");
			write.print(dto.getGym());
			write.print("</td>");
	
			write.print("<td>");
			write.print(dto.getAddress());
			write.print("</td>");
		
			write.print("<td>");
			write.print(dto.getName());
			write.print("</td>");
			
			write.print("<td>");
			write.print(dto.getNumber());
			write.print("</td>");
			
			write.print("<td>");
			write.print(dto.getPinCode());
			write.print("</td>");
			write.print("</tr>");
			
			
		}
		
		write.print("</tbody>");
		write.print("</table>");
		write.print("</body>");
		write.print("</html>");
	}
	
}
