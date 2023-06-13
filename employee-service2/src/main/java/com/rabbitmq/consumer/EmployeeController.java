package com.rabbitmq.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public String getEmployee() {
		return "Employee - nishith 2";
	}
	
}
