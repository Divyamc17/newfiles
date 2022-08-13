package com.xworkz.integers;

public class Mysore {

	public static void main(String[] args) {

		// constructor
		Character size = new Character('s');
		System.out.println(size);

		// instance
		char code = size.charValue();
		System.out.println(code);

		int wide = size.compareTo(size);
		System.out.println(wide);

		boolean by = size.equals(size);
		System.out.println(by);

		int num = size.hashCode();
		System.out.println(num);

		String value = size.toString();
		System.out.println(value);

		// static
		int car = Character.charCount(20);
		System.out.println(car);

		// char[] nut= new char[]{'a','b','c'};
		// int total=Character.codePointAt(nut, 4);
		// System.out.println(total);

		// int bell=Character.codePointAt(null, 22, 17);
		// System.out.println(bell);

		int gun = Character.digit('m', 26);
		System.out.println(gun);
		
		boolean verify=Character.isAlphabetic(29);
		System.out.println(verify);
		
		 boolean bundle=Character.isLetterOrDigit('#');
		 System.out.println(bundle);
		 
		 int fun=Character.toLowerCase(5888);
		 System.out.println(fun);
		
	}

}
