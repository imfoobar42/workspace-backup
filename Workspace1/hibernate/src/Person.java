package com.capgemini.hibernate.test;

import com.capgemini.hibernate.dao.*;
import javax.persistence.*;

@Entity
public class Person{
	@Id 
	private int personId;
	private String personName;

	public Person(int id, String Name){
		personId = id;
		personName = Name;
	}

	public String toString(){
		return " Id = "+personId+"\n Name = "+personName;
	}




}