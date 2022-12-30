package com.accenture.umpire;

import com.accenture.guesser.Guesser;
import com.accenture.player.Player;

public class Umpire {
	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	
	public void collectNumberFromGuesser( ) {
		Guesser g = new Guesser();
		numberFromGuesser = g.guessNum();
	}
	
	public void collectNumberFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numberFromPlayer1 = p1.guessNum();
		numberFromPlayer2 = p2.guessNum();
		numberFromPlayer3 = p3.guessNum();
	}
	
	public void compare() {
		System.out.println("Number guessed by the guesser:" + numberFromGuesser);
		
		if(numberFromGuesser==numberFromPlayer1) {
			System.out.println("Player1 has won the game!");
		}
		else if(numberFromGuesser==numberFromPlayer2) {
			System.out.println("Player2 has won the game!");
		}
		else if(numberFromGuesser==numberFromPlayer3) {
			System.out.println("Player3 has won the game!");
		}
		else {
			System.out.println("Game lost. Try again.");
		}
	}

}
