package tictactoe_game;

import java.util.Scanner;

class TicTacToe{
	public static void displayBoard(char board[][]) {
		for(char y[]:board) {
			for(char c:y) {
				System.out.print(c);
			}
			System.out.println();
		}
		
//		public static void insertPosition() {
//			
//		}
	}
	
	public static void insertPostion(char board[][], int position) {
		switch(position) {
		case 1: board[0][0] = 'X';
		break;
		case 2: board[0][2] = 'X';
		break;
		case 3: board[0][4] = 'X';
		break;
		case 4: board[2][0] = 'X';
		break;
		case 5: board[2][2] = 'X';
		break;
		case 6: board[2][4] = 'X';
		break;
		case 7: board[4][0] = 'X';
		break;
		case 8: board[4][2] = 'X';
		break;
		case 9: board[4][4] = 'X';
		break;
		default: System.out.println("Invalid postioin. Please re-enter the  posiion (bwetween 1 - 9 ");
		}
	}
}


public class LaunchTicTacToe {
	public static void main(String[] args) {
		char board[][] = {{' ', '|', ' ', '|', ' '},
						  {'-', '+', '-', '+', '-'}, 
						  {' ', '|', ' ', '|', ' '},
						  {'-', '+', '-', '+', '-'}, 
						  {' ', '|', ' ', '|', ' '}
						  };

		TicTacToe.displayBoard(board);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Player, please enter the position(1 -9).");
		int ppos = scan.nextInt();
		
		TicTacToe.insertPostion(board, ppos);
		TicTacToe.displayBoard(board);
	}

}

//class TicTacToe{	
//	
//	void displayBoard(char[][] board) {
//    System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "\n-+-+-");
//    System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "\n-+-+-");
//    System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "\n");
//	}
//	
//}
//
//public class LaunchTicTacToe {
//	public static void main(String[] args) {
//		char[][] board = {{' ',' ',' '}, {' ',' ',' '}, {' ', ' ', ' '}};
//		
//		TicTacToe ttt = new TicTacToe();
//		ttt.displayBoard(board);
//	}
//
//}
