package com.xworkz.inheritence;

public class Programming {
 public Programming () {
	 System.out.println("program");
 }
  String Program1;
  String Program2;
  String Program3;
  String Program4;
  String Program5;
  
  
 Programming(String Program1,String Program2,String Program3,String Program4,String Program5){
	 this.Program1=Program1;
	 this.Program2=Program2;
	 this.Program3=Program3;
	 this.Program4=Program4;
	 this.Program5=Program5;
 }
 public void torisu() {
	 System.out.println(this.Program1);
	 System.out.println(this.Program2);
	 System.out.println(this.Program3);
	 System.out.println(this.Program4);
	 System.out.println(this.Program5);
 }
}
