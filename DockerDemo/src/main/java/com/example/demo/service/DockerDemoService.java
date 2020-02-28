package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Device;
import com.example.demo.repo.DeviceRepository;

@Service 
public class DockerDemoService {


  
	@Autowired 
 	DeviceRepository deviceRepository;
 	
  	
 	 public List<Device> getAllDevices() {
         List<Device> devices = new ArrayList<Device>();
         deviceRepository.findAll().forEach(device -> devices.add(device));
         return devices;
     }

     public Device getDeviceById(int id) {
         return deviceRepository.findById(id).get();
     }

     public void saveOrUpdate(Device device) {
    	 deviceRepository.save(device);
     }

     public void delete(int id) {
    	 deviceRepository.deleteById(id);
     }
	   
	   
	   
   }
   



