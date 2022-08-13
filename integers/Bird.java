package com.xworkz.integers;

public class Bird {

	public static void main(String[] args) {

		// Constructor
		Boolean app = new Boolean(true);
		System.out.println(app);

		Boolean man = new Boolean("897");
		System.out.println(man);

		// Static
		int run = Boolean.compare(false, true);
		System.out.println(run);

		boolean decorate = Boolean.logicalAnd(false, false);
		System.out.println(decorate);

		boolean mango = Boolean.parseBoolean("but");
		System.out.println(mango);

		String bundle = Boolean.toString(false);
		System.out.println(bundle);

		// instance
		boolean better = app.booleanValue();
		System.out.println(better);

		int count = app.compareTo(true);
		System.out.println(count);

		boolean go = app.equals(true);
		System.out.println(go);

		int van = app.hashCode();
		System.out.println(van);

		String name = app.toString();
		System.out.println(name);

	}

}
