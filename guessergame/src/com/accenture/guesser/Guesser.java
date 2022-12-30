package com.accenture.guesser;

import java.util.Random;
//import java.util.Scanner;

public class Guesser {
	int gnum;
	
//	public int guessNum() {
//		System.out.println("Guesser, please guess a number.");
//		Scanner scan = new Scanner(System.in);
//		gnum = scan.nextInt();
//		return gnum;
//	}
	
	public int guessNum() {
		Random rand = new Random();
		gnum = rand.nextInt(1, 10);
//		System.out.println("Guesser:" + gnum);
		return gnum;
}

}
