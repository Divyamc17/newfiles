package com.xworkz.inheritence;

public class Plane {
 public Plane() {
	 System.out.println("plane");
 }
	 
	 double departueTime;
	 double arrivalTime;
	 String airportName;
	 int noOfLane;
	 boolean passport;
	 
	 public void setPlane(double departueTime,double arrivalTime,String airportName, int noOfLane,boolean passport) {
		 
		 this.departueTime=departueTime;
		 this.arrivalTime=arrivalTime;
		 this.airportName=airportName;
		 this.noOfLane=noOfLane;
		 this.departueTime=departueTime;
	 }
	 
	 public void torisu() {
		 
		 System.out.println( this.departueTime);
		 System.out.println( this.arrivalTime);
		 System.out.println( this.airportName);
		 System.out.println( this.noOfLane);
		 System.out.println( this.departueTime);
	 }
 }

