package main;

import java.awt.Point;
import java.util.*;

import board.*;
import pieces.*;
import player.*;
import utilities.*;

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
		board.initPlayerPieces();
		
		
		board.printToConsole();
		
		
		boolean noExit = true;
		while (noExit) {
			
			Point startPoint = null, endPoint = null;
			boolean loop = true;
			
			while (loop) {
				
				System.out.print("Please Enter Co-Ordinates of the Piece You Want To Move (e.g. 6B):");
				String input = scanner.nextLine();
				
				char[] coordinatesInputArray = input.toCharArray();
				
				
				Character[] letterArray = {coordinatesInputArray[0], coordinatesInputArray[1]};

					
					if(Utilities.checkInputCoordinates(letterArray)) {
						startPoint = Utilities.convertCharactersToPoint(letterArray);
						if (startPoint != null) {
							
							loop = false;
						}
						
					}
					else {
						
						System.out.println("Not A Valid Co-Ordinate");
					}
					
				
			}
			
			loop = true;
			while (loop) {
			
				System.out.print("Please Enter Co-Ordinates of the Tile You Want To Move The Piece To (e.g. 6B):");
				
				String input2 = scanner.nextLine();
				
				char[] coordinatesInputArray2 = input2.toCharArray();
			
				Character[] letterArray = {(Character)coordinatesInputArray2[0], (Character)coordinatesInputArray2[1]};
				
				if (Utilities.checkInputCoordinates(letterArray)) {
					
					endPoint = Utilities.convertCharactersToPoint(letterArray);
					
					if (player1.makeMove(board, startPoint, endPoint)) {
						
						loop = false;

					}
					else {
						
						System.out.println("Not A Valid Move");
					}
				}
	
			}
	
			board.printToConsole();
			
			noExit = false;
			
			
		}
	}

	
	

}
