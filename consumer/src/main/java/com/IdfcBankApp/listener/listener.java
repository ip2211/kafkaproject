package com.IdfcBankApp.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.IdfcBankApp.model.Employee;

@Component
public class listener {
	@KafkaListener(topics = "ktopic1", groupId = "EmployeeGroup")
	public void consumes(String emp) {
		System.out.println(emp);
	}
	
}
