package com.example.demo.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("TestDB")
public class Device {

	
    @PrimaryKey
   	private Integer ID;
	

	private String Name ;
    
    private Integer salary; 


    public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
    @Override
	public String toString() {
		return "Device [ID=" + ID + ", Name=" + Name + ", salary=" + salary + "]";
	}
	


}



