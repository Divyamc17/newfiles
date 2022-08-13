package com.xworkz.integers;

public class Integers {

	public static void main(String[] args) {

		Integer integer = new Integer(20);
		System.out.println(integer);

		Integer high = new Integer("405");
		System.out.println(high);

		byte number = integer.byteValue();
		System.out.println(number);

		int key = integer.compareTo(15);
		System.out.println(key);

		double dou = integer.doubleValue();
		System.out.println(dou);

		boolean check = integer.equals(18);
		System.out.println(check);

		float flow = integer.floatValue();
		System.out.println(flow);

		int hash = integer.hashCode();
		System.out.println(hash);

		int lion = integer.intValue();
		System.out.println(lion);

		long large = integer.longValue();
		System.out.println(large);

		short cat = integer.shortValue();
		System.out.println(cat);

		String name = integer.toString();
		System.out.println(name);

		// static integers
		int dumble = Integer.bitCount(45);
		System.out.println(dumble);

		int com = Integer.compare(46, 78);
		System.out.println(com);

		Integer store = Integer.decode("709");
		System.out.println(store);

		int fon = Integer.parseInt("809");
		System.out.println(fon);

		int maximum = Integer.max(12, 24);
		System.out.println(maximum);

	}

}
