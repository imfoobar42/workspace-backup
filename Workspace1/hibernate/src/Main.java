package com.capgemini.hibernate.main;

import com.capgemini.hibernate.test.*;
import com.capgemini.hibernate.dao.impl.*;
import com.capgemini.hibernate.dao.*;

public class Main{
	public static void main(String[] args) {
		PersonDao person = new PersonDaoImpl();
		person.addNew(new Person(101,"John"));
		System.out.println("Hello from the other side");
	}
}

