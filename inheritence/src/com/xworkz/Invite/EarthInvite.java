package com.xworkz.Invite;

import com.xworkz.subclass.EarthPlanet;
import com.xworkz.superclass.Planet;

public class EarthInvite {

	public static void main(String[] args) {

		EarthPlanet earthplanet = new EarthPlanet("Oval", "blue", "tfyr", "Earth", 6713, true);
		earthplanet.torisu();

		Planet planet = new EarthPlanet("Oval", "blue", "tfyr", "Earth", 6713, true);
		EarthPlanet convo = (EarthPlanet) planet;
		convo.torisu();
		System.out.println();
		Planet planet1 = new EarthPlanet("Oval", "blue", "tfyr", "Earth", 6713, true);

		// data casting
		EarthPlanet convetedFromPlanet = (EarthPlanet) planet1;
		convetedFromPlanet.torisu();
	}

}
