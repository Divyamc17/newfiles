package com.xworkz.Invite;

import com.xworkz.subclass.SuperMarket;
import com.xworkz.superclass.Market;

public class MarketInvite {
	public static void main(String[] args) {
		 
		OnlineSuperMarket osm=new OnlineSuperMarket();
		osm.torisu3();
		
		Market market=new OnlineSuperMarket("Market","BTM","Veg");
		market.torisu1();
		OnlineSuperMarket mart=(OnlineSuperMarket)market;    //Casting
		Market market1=new Market();
		market1.torisu1();
		
		Market market2=new SuperMarket(10,20,"Available");
		market2.torisu1();
		SuperMarket mart2=(SuperMarket)market2;
		mart2.torisu2();
		
		SuperMarket sup=new SuperMarket(25,45,"NA");
		sup.torisu2();
		
		SuperMarket supermarket1=new OnlineSuperMarket(20,50,true);
		supermarket1.torisu2();
		
		SuperMarket sup1=new SuperMarket(9.00,5.00,"A");
		sup1.torisu2();
	}
}
