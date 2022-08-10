class Trainer
{
 String name;
 long contactNo;
 int exp;
 int age;
 Gender gender;
 
 Trainer(String name,long contactNo,int exp,Gender gender)
 {
	 this.name=name;
	 this.contactNo=contactNo;
	 this.exp=exp;
	 this.gender=gender;
 }
 void setAge(int age)
 {
	this.age=age; 
 }
 void printData()
 {
 System.out.println(this.name);
 System.out.println(this.contactNo);
 System.out.println(this.exp);
 System.out.println(this.gender.acutalValue);
 System.out.println(this.age);
 }
}