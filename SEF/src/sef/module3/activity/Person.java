package sef.module3.activity;

public class Person {

	//Attributes
	String name;
	 final int counter = 100 ;
	
	
	//Behavior
	public Person(String name){
		
		System.out.println("Welcome to new class");
		this.name = name;
	}
	public Person(){
		
		System.out.println("Welcome to new class and I don't have any basic value of Name");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String introduce(){
		return "My name is " + name;
	}
	
}
