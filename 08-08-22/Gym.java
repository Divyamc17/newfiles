class Gym
{
 String name;
 double fees;
 String[] equipments;
 Trainer trainer;

Gym(String name,double fees, String[] equipments,Trainer trainer)
{
	this.name=name;
	this.fees=fees;
	this.equipments=equipments;
	this.trainer=trainer;
} 
 void printData()
 {
	 System.out.println(this.name);
	 System.out.println(this.fees);
	 for (int equpment=0;equpment<this.equipments.length;equpment++)
	 {
	 System.out.println(this.equipments[equpment]);
	 }
	 this.trainer.printData();
 }
}