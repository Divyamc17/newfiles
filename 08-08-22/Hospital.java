class Hospital
{
	String name;
	Specialization specialization;
	String [] equipments;
	double consultationFee;
	Founder founder;
	
	Hospital(String name,Specialization specialization,String [] equipments,double consultationFee,Founder founder)
	{
		this.name=name;
		this.specialization=specialization;
		this.equipments=equipments;
		this.consultationFee=consultationFee;
		this.founder=founder;
		
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.specialization);
		System.out.println(this.consultationFee);
		System.out.println(this.founder);
		
		for(int things=0;things<this.equipments.length;things++)
		{
		System.out.println(this.equipments[things]);
			
		}
		this.founder.printData();
	}
}
