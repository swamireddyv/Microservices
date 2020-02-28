package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Device;
import com.example.demo.service.DockerDemoService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DockerController {

	
	
	@Autowired 
	DockerDemoService dockerDemoService;
	
    	
	 @GetMapping("/device")
	    private List<Device> getAllDevices() {
	        return dockerDemoService.getAllDevices();    
	    } 
	
	
	@PostMapping("/SaveDevice") 
	 private void  saveDevice(@RequestBody Device device) { 
		
		dockerDemoService.saveOrUpdate(device); 
	 
	     
	 
	 
	 }

}



	
	
	
	
	


