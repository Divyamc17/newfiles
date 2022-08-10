class HospitalInvite
{
  public static void main (String[] as)	
  {
    String [] eqp={"bed","wheelchairs","stand"};
	Founder founder=new Founder("Dr.Hegde","Mangalore",159826,Profession.MBBS);
	founder.setSince(1954,true);
	Hospital hospital=new Hospital("Manipal",Specialization.CARDIO,eqp,500,founder);
	hospital.printData();
  }
	
}