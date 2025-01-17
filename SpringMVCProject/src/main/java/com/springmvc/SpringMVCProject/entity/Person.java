package com.springmvc.SpringMVCProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String email_id;
	String mob_no;
	
	public Person() {
		super();
	}

	public Person(String name, String email_id, String mob_no) {
		super();
		this.name = name;
		this.email_id = email_id;
		this.mob_no = mob_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getMob_no() {
		return mob_no;
	}

	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email_id=" + email_id + ", mob_no=" + mob_no + "]";
	}
}
