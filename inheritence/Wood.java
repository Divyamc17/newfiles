package com.xworkz.inheritence;

public class Wood {
	
	Wood(){
		System.out.println("wood");
	}
	 String type;
	 String old;
	 double rate;
	 
public Wood(String type, String old,double rate) {
	
	this.type=type;
	this.old=old;
	this.rate=rate;
}

public void torisu(){
	
	System.out.println(this.type);
	System.out.println(this.old);
	System.out.println(this.rate);
	
	
}
}
