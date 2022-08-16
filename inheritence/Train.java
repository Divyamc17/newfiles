package com.xworkz.inheritence;

 public class Train {
	Train(){
		System.out.println("Train");
	}
	String name;
	int noOfStops;
	int noOfTrack;
	int noOfCmopartment;
	double arrival;
	double departure;
	
  public Train(String name,int noOfStops,int noOfTrack,
		  int noOfCmopartment,double arrival,double departure){
	  
	  this.name=name;
	  this.noOfStops=noOfStops ;
	  this.noOfTrack= noOfTrack;
	  this.noOfCmopartment= noOfCmopartment;
	  this.arrival =arrival;
	  this.departure=departure;
	  
  }
  
  public void torisu() {
	System.out.println(this.name);
	System.out.println(this.noOfStops);
	System.out.println(this.noOfTrack);
	System.out.println(this.noOfCmopartment);
	System.out.println(this.arrival);
	System.out.println(this.departure);
  }
  
  
  
}
