package com.xworkz.subclass;

import com.xworkz.superclass.Market;

public class SuperMarket extends Market {
	
	public double openTime;
	public double closeTime;
	public String allType;
	
	public SuperMarket() {
		
		System.out.println("default constructor supermarket");
	}
	public SuperMarket( double openTime,double closeTime,String allType) {
        this.openTime=openTime;
        this.closeTime=closeTime;
        this.allType=allType;
	}
	public void torisu2(){
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
		System.out.println(this.allType);
		
	}

}
