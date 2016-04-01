package fr.istic.dudcl.tp2Servlet;

import java.util.ArrayList;

import model.Person;

import java.util.List;

public class MyService {
	
	List<Person> pers = new ArrayList<Person>();
	
	private static MyService instance = null;
	
	public static MyService getInstance() {
		if (instance == null)
			instance =new MyService();
		return instance;
	}

	private MyService() {
		
		Person p = new Person("Dupont","Jean","1 rude Rose Rennes",null, null);
		Person p1 = new Person("Dupont","Jack","1 rude Rose Rennes",null, null);
		Person p2 = new Person("Dupont","Henri","1 rude Rose Rennes",null, null);
		Person p3 = new Person("Dupont","Paul","1 rude Rose Rennes",null, null);
			
		pers.add(p);
		pers.add(p1);
		pers.add(p2);
		pers.add(p3);
		
		

	
	}
	
	public List<Person> getAllPersons(){
		
		
		
		return pers;
		
	}
	public void addPerson( Person p){
		
		
		
		pers.add(p);
		
	}


}
