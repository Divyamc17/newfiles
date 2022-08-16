package com.xworkz.inheritence;

public class Glass {
    public Glass() {
     System.out.println("glass");
	}
    
    String type;
    double length;
    double width;
    double thikness;
    double price;
    
   public Glass(String type, double length,double width,double thikness,double price) {
		   
    this.type=type;
    this.length=length;
    this.width=width;
    this.thikness=thikness;
    this.price=price;
   }
   
   public void torisu() {
	   System.out.println(this.type);
	   System.out.println(this.length);
	   System.out.println(this.width);
	   System.out.println(this.thikness);
	   System.out.println(this.price);
   }
}


