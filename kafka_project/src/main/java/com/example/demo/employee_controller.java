package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class employee_controller{
@Autowired
private KafkaTemplate<String,employee_model> emptemplate;
@PostMapping("/kafka/producer")
public employee_model getMethodName(@RequestBody employee_model message) {
	emptemplate.send("ktopic1",message);
	return message;
}
	
}

