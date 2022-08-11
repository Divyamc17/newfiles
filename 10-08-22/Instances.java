class Instances{
	
	public static void main (String[] busy)
	{
		//toUpperCase()
		String cases=new String("Mysore");
		System.out.println(cases);
		String cause=cases.toUpperCase();
		System.out.println(cause);
		
		//toLowerCase()
		String lowcases=new String("AMARAVATHI");
		System.out.println(lowcases);
		String cau=cases.toLowerCase();
		System.out.println(cau);
		
		
		//compareTo(String anotherString)
		 String comp=new String ("bangaluru");
         System.out.println(comp);
		 int comps=comp.compareTo("place");
		 System.out.println(comps);
		 
		//endsWith(String suffix)
		String rad=new String ("radia");
        System.out.println(rad);
		boolean rads=rad.endsWith("tion");
		System.out.println(rads);
	
		//charAt(int index)
		String lion=new String ("Lion");
        System.out.println(lion);
		char loins=lion.charAt(54);
		System.out.println(loins);
		
		//hashCode()
		String code=new String ("check");
	    System.out.println(code);
		int see=code.hashCode();
		System.out.println(see);

	}
} 
  