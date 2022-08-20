package com.xworkz.Invite;

import com.xworkz.subclass.SuperMarket;

public class OnlineSuperMarket extends SuperMarket {
    public double charge;
    public double offer;
    public boolean exchange;
    
   public OnlineSuperMarket(){
    	System.out.println("default const OnlineSuperMarket");
    }
  public OnlineSuperMarket(double charge,double offer,boolean exchange){
	 
	   this.charge=charge;
	   this.offer=offer;
	   this.exchange=exchange;
	   System.out.println("double,doube,boolean");
	   
   }
  public OnlineSuperMarket(double openTime,double closeTime,String allType) {
	  super(openTime,closeTime,allType);
	  System.out.println("double,double,string");
  
  }
  
  public OnlineSuperMarket(String name,String place,String type) {
	  super.name=name;
	  super.place=place;
	  super.type=type;
	  System.out.println("string,string,string");
	  
  }
  
    public void torisu3() {
    	System.out.println(this.charge);
    	System.out.println(this.offer);
    	System.out.println(this.exchange);
    }
    
}
