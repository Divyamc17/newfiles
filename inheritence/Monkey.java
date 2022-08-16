package com.xworkz.inheritence;

public class Monkey {
 public Monkey() {
    System.out.println("monkey");
}
 String order;
 String animalia;
 String phylum;
 String simiiformes;
 int lifeSpan;
 
 public Monkey(String order,String animalia,String phylum,String simiiformes,int lifeSpan) {
 
 this.order=order;
 this.animalia=animalia;
 this.phylum=phylum;
 this.simiiformes=simiiformes;
 this.lifeSpan=lifeSpan;
 }
 public void torisu() {
	 System.out.println(this.order);
	 System.out.println(this.animalia);
	 System.out.println(this.phylum);
	 System.out.println(this.simiiformes);
	 System.out.println( this.lifeSpan);
	 
	 
 }
 
}
