package com.dell.dellHardware.DellLaptop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LaptopController {
	
	//1.Create a new API call it should allow all HTTP methods
	
	@RequestMapping(path="/dellLaptop/2023")
	@ResponseBody
	public String getLaptopDetails() {
		return "This is Dell 3450 Model,and launch in 2023"; 
	}
	
	//2. Create a new API call it should allow only HTTP methods POST, PUT
	@RequestMapping(path="/dellLapto/serialNo", method= {RequestMethod.PUT,RequestMethod.POST})
	@ResponseBody
	public String getLaptopSerialNo() {
		
		return "laptop serial no. is : " + 23456789;
	}
	
	//3. Create new API services, it should allow only HTTP method POST
    // @PostMapping
    // @RequestMapping
	
//	@RequestMapping(path="/dell/print", method=RequestMethod.POST)
	@PostMapping("/dell/print")
	@ResponseBody
	public String print() {
		System.out.println("this is print method");
		return "this is print Method , it will work only with HTTP POST";
	}

}
