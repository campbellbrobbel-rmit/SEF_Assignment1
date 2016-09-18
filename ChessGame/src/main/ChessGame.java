package main;
import board.*;
import pieces.*;
import player.*;
import utilities.Color;

public class ChessGame {

	public static void main(String[] args) {
		
		Player player1 = new Player("Campbell", Color.BLACK);
		Player player2 = new Player("Dave", Color.WHITE);
		
		player1.printPlayer();
		player2.printPlayer();
		
		Board board = new Board(5,5);
		
		board.printBoard();
		
		
	}

}
