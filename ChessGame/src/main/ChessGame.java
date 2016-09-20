package main;

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
			
			int startIndex = -1, endIndex = -1;
			boolean loop = true;
			
			while (loop) {
				
				System.out.print("Please Enter Co-Ordinates of the Piece You Want To Move (e.g. 6B):");
				String input = scanner.nextLine();
				
				char[] coordinatesInputArray = input.toCharArray();
				
				
				Character[] letterArray = {coordinatesInputArray[0], coordinatesInputArray[1]};

				
				startIndex = convertToBoardIndex(letterArray);
				loop = false;
				
				
			}
			
			loop = true;
			while (loop) {
			
				System.out.print("Please Enter Co-Ordinates of the Tile You Want To Move The Piece To (e.g. 6B):");
				
				String input2 = scanner.nextLine();
				
				char[] coordinatesInputArray2 = input2.toCharArray();
			
				Character[] letterArray = {(Character)coordinatesInputArray2[0], (Character)coordinatesInputArray2[1]};
				
				if (checkInputCoordinates(letterArray)) {
					
					endIndex = convertToBoardIndex(letterArray);
					loop = false;
				}
				
				
			}
			
			
			
			player1.makeMove(board, startIndex, endIndex);
			board.printToConsole();
			
			noExit = false;
			
			
		}
	}
	
	private static boolean checkInputCoordinates(Character[] coordinatesInputArray) {
		
		
		if(coordinatesInputArray[0] == 'A' || coordinatesInputArray[0] == 'a' || coordinatesInputArray[0] == 'B' || coordinatesInputArray[0] == 'b' 
				|| coordinatesInputArray[0] == 'C' || coordinatesInputArray[0] == 'c' || coordinatesInputArray[0] == 'D' || coordinatesInputArray[0] == 'd'
				|| coordinatesInputArray[0] == 'E' || coordinatesInputArray[0] == 'e' || coordinatesInputArray[0] == 'F' || coordinatesInputArray[0] == 'f'
				|| coordinatesInputArray[0] == '1' || coordinatesInputArray[0] == '2' || coordinatesInputArray[0] == '3' || coordinatesInputArray[0] == '4'
				|| coordinatesInputArray[0] == '5') {
			
			if(coordinatesInputArray[0] == 'A' || coordinatesInputArray[0] == 'a' || coordinatesInputArray[0] == 'B' || coordinatesInputArray[0] == 'b' 
					|| coordinatesInputArray[0] == 'C' || coordinatesInputArray[0] == 'c' || coordinatesInputArray[0] == 'D' || coordinatesInputArray[0] == 'd'
					|| coordinatesInputArray[0] == 'E' || coordinatesInputArray[0] == 'e' || coordinatesInputArray[0] == 'F' || coordinatesInputArray[0] == 'f'
					|| coordinatesInputArray[0] == '1' || coordinatesInputArray[0] == '2' || coordinatesInputArray[0] == '3' || coordinatesInputArray[0] == '4'
					|| coordinatesInputArray[0] == '5') {
				
				System.out.println("THIS IS TRUE");
				return true;
				
			}
			
		}
		
		return false;
	}
	

	private static int convertToBoardIndex(Character[] coordinatesInputArray) {
		
		int x = 0, y = 0;
		int count = 0;
		
		while(count < 2) {
		
			if(coordinatesInputArray[count] == 'A' || coordinatesInputArray[count] == 'a') {
				
				x = 0;
			}
			else if(coordinatesInputArray[count] == 'B' || coordinatesInputArray[count] == 'b') {
				x = 1;
			}
			else if(coordinatesInputArray[count] == 'C' || coordinatesInputArray[count] == 'c') {
				
				x = 2;
			}
			else if(coordinatesInputArray[count].equals('D') || coordinatesInputArray[0].equals('d')) {
				
				x = 3;
			}
			else if(coordinatesInputArray[count] == 'E' || coordinatesInputArray[count] == 'e') {
			
				x = 4;
			}
			else if(coordinatesInputArray[count] == 'F' || coordinatesInputArray[count] == 'f') {
				
				x = 5;
			}
			else if(coordinatesInputArray[count] == '6') {
				
				y = 0;
			}
			else if(coordinatesInputArray[count] == '5') {
				y = 1;
			}
			else if(coordinatesInputArray[count] == '4') {
				y = 2;
			}
			else if(coordinatesInputArray[count] == '3') {
				y = 3;
			}
			else if(coordinatesInputArray[count] == '2') {
				y = 4;
			}
			else if(coordinatesInputArray[count] == '1') {
				y = 5;
			}
			
			count++;
		}
		
		
		int total = (y*6) + x;
		System.out.printf("X: %d, Y; %d\n", x, y);
		System.out.printf("Total = %d\n", total);
		
		return total;
	}
	
	

}
