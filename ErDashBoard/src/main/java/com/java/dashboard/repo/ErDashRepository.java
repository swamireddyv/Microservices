package com.java.dashboard.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.java.dashboard.model.ReleaseJsonPojo;


public interface ErDashRepository extends CassandraRepository<ReleaseJsonPojo, Integer> {


	
	




}
