package com.example.Hopper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
public class Hopper {
	@RequestMapping("/")
	public String index(Model model) {
		   String name = "Grace Hopper";
	        String itemName = "Copper wire";
	        double price = 5.25;
	        String description = "Metal strips, also an illustration of nanoseconds.";
	        String vendor = "Little Things Corner Store";
	        
		model.addAttribute("Name",name);
		model.addAttribute("ItemName",itemName);
		model.addAttribute("Price",price);
		model.addAttribute("Description",description);
		model.addAttribute("Vender",vendor);
		
		
		return "NewFile.jsp";
	}
	

}
