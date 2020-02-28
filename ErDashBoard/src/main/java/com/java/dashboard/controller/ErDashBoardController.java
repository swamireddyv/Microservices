package com.java.dashboard.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import com.java.dashboard.model.ReleaseJsonPojo;
import com.java.dashboard.service.ErDashService;

import org.springframework.web.client.RestClientException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpEntity;

@RestController
public class ErDashBoardController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	ErDashService erDashService; 
	
	
	
	private String baseURL;

	@Autowired
	ReleaseJsonPojo releaseJsonPojo; 

	@GetMapping("/getRelease")
	public void getRelease() {

		baseURL = "http://localhost:8088/";

		baseURL = baseURL + "/Releases/";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ReleaseJsonPojo> response = null;

		// EmployeeListVO result = restTemplate.getForObject(uri, EmployeeListVO.class);

		try {
			releaseJsonPojo = restTemplate.getForObject(baseURL, ReleaseJsonPojo.class);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println("Output= " +releaseJsonPojo);

	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}


	/*
	 * @GetMapping("/device") private List<Device> getAllDevices() { return
	 * dockerDemoService.getAllDevices(); }
	 */
	
	
	@PostMapping("/SaveReleaseJson") 
	 private void  saveDevice(@RequestBody ReleaseJsonPojo releaseJsonPojo) { 
		
		erDashService.saveOrUpdate(releaseJsonPojo); 
	 
	}
	
}








