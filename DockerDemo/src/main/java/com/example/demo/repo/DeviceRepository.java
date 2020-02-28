package com.example.demo.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.demo.entity.*;

public interface DeviceRepository extends CassandraRepository<Device, Integer> {

	

}
