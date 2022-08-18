package com.xworkz.inheritence;

public class Browser {
	 public Browser()
	 {
		 System.out.println("brose");
	 }
	String name;
	double storage;
	int year;
	String developer;
	boolean status;
	
	public Browser(String name,double storage,int year,String developer,boolean status)
	{
		this.name=name;
		this.storage=storage;
		this.year=year;
		this.developer=developer;
		this.status=status;
	}

	public void torisu()
	{
	System.out.println(this.name);
	System.out.println(this.storage);
	System.out.println(this.year);
	System.out.println(this.developer);
	System.out.println(this.status);
	}
  }
