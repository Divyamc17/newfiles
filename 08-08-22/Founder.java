class Founder{
	
	String name;
	String from;
	int since;
	boolean alive;
	int income;
	Profession profession;
	
	Founder(String name,String from,int income,Profession profession)
	{
		this.name=name;
		this.from=from;
		this.income=income;
		this.profession=profession;
	}
	void setSince(int since,boolean alive)
	{
		this.since=since;
		this.alive=alive;
	}
     void printData()
	 {
		 System.out.println(this.name);
		 System.out.println(this.from);
		 System.out.println(this.income);
		 System.out.println(this.profession);
		 System.out.println(this.since);
		 System.out.println(this.alive);
		 
	 }
}