package main;

import java.awt.Point;
import java.util.*;

import board.*;
import player.*;
import utilities.*;

public class ChessGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Player 1 Name: ");
		String player1Name = scanner.nextLine();
		System.out.print("Player 2 Name: ");
		String player2Name = scanner.nextLine();
		scanner.close();
		
		Player player1 = new Player(player1Name, Color.BLACK);
		Player player2 = new Player(player2Name, Color.WHITE);
		
		player1.printPlayer();
		player2.printPlayer();
		
		Board board = new Board(6,6);
		board.initPlayerPieces();
		
		board.printToConsole();
		
		boolean exit = false;
		while(!exit) {
			
			Point startPoint = null, endPoint = null;
			
			while(true) {
				
				System.out.print("Please Enter Co-Ordinates of the Piece You Want To Move (e.g. 6B):");
				startPoint = getPointInput(board);
				System.out.print("Please Enter Co-Ordinates of the Tile You Want To Move The Piece To (e.g. 6B):");
				endPoint = getPointInput(board);
				
				if(player1.makeMove(board, startPoint, endPoint))
					break;
				else {
					System.out.println("Not A Valid Move");
					System.out.println("Would you like to exit?");
					scanner = new Scanner(System.in);
					String input = scanner.nextLine();
					if(input.toLowerCase().equals("y") || input.toLowerCase().equals("yes")) {
						exit = true;
						break;
					}
				}
			}
	
			board.printToConsole();
		}
	}
	
	public static Point getPointInput(Board board) {
		Scanner scanner = new Scanner(System.in);
		Point point;
		
		while(true) {
			String input = scanner.nextLine();
			char[] letterArray = input.toCharArray();
			
			if(Utilities.checkInputCoordinates(letterArray, board.getXSize(), board.getYSize())) {
				point = Utilities.charsToPoint(letterArray);
				break;
			}
			else
				System.out.println("Not A Valid Coordinate");
		}
		
		scanner.close();
		return point;
	}
}
