package com.xworkz.inheritence;

public class Institute {
 public Institute() {
	System.out.println("learnnig");
}
  String name;
  String area;
  double fees;
  double open;
  double close;
  
 public Institute(String name,String area,double fees, double open,double close) {
	 
	 this.name=name;
	 this.area=area;
	 this.fees=fees;
	 this.open=open;
	 this.close=close;
 } 
  public void torisu() {
	  System.out.println( this.name);
	  System.out.println( this.area);
	  System.out.println( this.fees);
	  System.out.println( this.open);
	  System.out.println( this.close);
	  
	  
  }
 
}
