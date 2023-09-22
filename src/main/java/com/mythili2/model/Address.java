package com.mythili2.model;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="address")

public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address")
    private int id;
	
	@Column(name="street_name")
    private String name;
	
	@OneToMany(mappedBy="address",cascade=CascadeType.ALL)
	private List<Person> persons=new ArrayList<Person>();
	public Address(int id, String name, List<Person> persons) {
		super();
		this.id = id;
		this.name = name;
		this.persons = persons;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
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

	public List<Person> getPerson() {
		return persons;
	}

	public void setPerson(List<Person> persons) {
		this.persons = persons;
	}
	

}





