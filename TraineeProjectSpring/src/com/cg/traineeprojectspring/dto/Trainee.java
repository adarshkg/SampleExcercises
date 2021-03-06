package com.cg.traineeprojectspring.dto;


public class Trainee {

	private Integer id;
	private String name;
	private String location;
	private String domain;
	
	public Trainee() {
	}

	public Trainee(Integer id, String name, String location, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.domain = domain;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", location=" + location + ", domain=" + domain + "]";
	}
	
	
}
