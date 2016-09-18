package main;

import java.util.Scanner;

import board.*;
import pieces.*;
import player.*;
import utilities.Color;

public class ChessGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Player 1 Name: ");
		String player1Name = scanner.nextLine();
		System.out.print("Player 2 Name: ");
		String player2Name = scanner.nextLine();
		
		Player player1 = new Player(player1Name, Color.BLACK);
		Player player2 = new Player(player2Name, Color.WHITE);
		
		player1.printPlayer();
		player2.printPlayer();
		
		Board board = new Board(6,6);
		board.initPlayerPieces(player1, player2);
		board.printBoard();
		board.printToConsole();
		
	}

}
