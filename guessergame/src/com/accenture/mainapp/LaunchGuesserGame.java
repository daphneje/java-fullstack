package com.accenture.mainapp;

import com.accenture.umpire.Umpire;

public class LaunchGuesserGame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayers();
		u.compare();
	}

}

// randomly generate number from guesser
// announce multiple players