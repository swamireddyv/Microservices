package com.java.dashboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dashboard.model.ReleaseJsonPojo;
//import com.example.demo.entity.Device;
//import com.example.demo.repo.DeviceRepository;
import com.java.dashboard.repo.ErDashRepository;

@Service
public class ErDashService {

	@Autowired
	ErDashRepository erDashRepository;

	@Autowired
	ReleaseJsonPojo releaseJsonPojo;

	public ReleaseJsonPojo getDeviceById(int id) {
		return erDashRepository.findById(id).get();
	}

	public void saveOrUpdate(ReleaseJsonPojo releaseJsonPojo) {
		erDashRepository.save(releaseJsonPojo);
	}

}
