package com.xworkz.inheritence;

public class Cycle {
	Cycle(){
		System.out.println("Cycle constructer");
	}
	String brand;
	int noWheel;
	double cost;
	int seat;
	int noOfPedal;
	
	
 public  Cycle (String brand,int noWheel,double cost,int seat,int noOfPedal){
	this.brand=brand;
	this.noWheel=noWheel;
	this.cost=cost;
	this.seat=seat;
	this.noOfPedal=noOfPedal;
}
  public void torisu() {
	  System.out.println(this.brand);
	  System.out.println(this.noWheel);
	 System.out.println(this.cost);
	 System.out.println(this.seat);
	 System.out.println(this.noOfPedal);
  }
  
}
