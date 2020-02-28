package com.java.dashboard.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ReleaseJsonPojo {
	 ArrayList < Object > links = new ArrayList < Object > ();
	 public ArrayList<Object> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<Object> links) {
		this.links = links;
	}

	public ArrayList<Object> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<Object> properties) {
		this.properties = properties;
	}

	private float id;
	 private String name;
	 @Override
	public String toString() {
		return "ReleaseJsonPojo [links=" + links + ", id=" + id + ", name=" + name + ", order=" + order + ", pid=" + pid
				+ ", created_date=" + created_date + ", last_modified_date=" + last_modified_date + ", properties="
				+ properties + ", web_url=" + web_url + ", description=" + description + ", start_date=" + start_date
				+ ", end_date=" + end_date + "]";
	}

	private float order;
	 private String pid;
	 private String created_date;
	 private String last_modified_date;
	 ArrayList < Object > properties = new ArrayList < Object > ();
	 private String web_url;
	 private String description;
	 private String start_date;
	 private String end_date;


	 // Getter Methods 

	 public float getId() {
	  return id;
	 }

	 public String getName() {
	  return name;
	 }

	 public float getOrder() {
	  return order;
	 }

	 public String getPid() {
	  return pid;
	 }

	 public String getCreated_date() {
	  return created_date;
	 }

	 public String getLast_modified_date() {
	  return last_modified_date;
	 }

	 public String getWeb_url() {
	  return web_url;
	 }

	 public String getDescription() {
	  return description;
	 }

	 public String getStart_date() {
	  return start_date;
	 }

	 public String getEnd_date() {
	  return end_date;
	 }

	 // Setter Methods 

	 public void setId(float id) {
	  this.id = id;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setOrder(float order) {
	  this.order = order;
	 }

	 public void setPid(String pid) {
	  this.pid = pid;
	 }

	 public void setCreated_date(String created_date) {
	  this.created_date = created_date;
	 }

	 public void setLast_modified_date(String last_modified_date) {
	  this.last_modified_date = last_modified_date;
	 }

	 public void setWeb_url(String web_url) {
	  this.web_url = web_url;
	 }

	 public void setDescription(String description) {
	  this.description = description;
	 }

	 public void setStart_date(String start_date) {
	  this.start_date = start_date;
	 }

	 public void setEnd_date(String end_date) {
	  this.end_date = end_date;
	 }
	}
