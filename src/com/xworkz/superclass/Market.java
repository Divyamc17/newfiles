package com.xworkz.superclass;

public class Market {
	public String name;
	public String place;
	public String type;
	
	public Market(){
    System.out.println("Default construter market");
	}

  public void torisu1() {
	 System.out.println(this.name); 
	 System.out.println(this.place);
	 System.out.println(this.type);
  }
}