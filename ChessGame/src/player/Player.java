package player;

import pieces.*;
import utilities.Color;

public class Player {
	
	private String name;
	private Color color;
	private Piece piecesArray[] = new Piece[6];
	
	public Player(String name, Color color) {
		
		this.name = name;
		this.color = color;
		
		if(this.color == Color.BLACK) {
			
		piecesArray[0] = new Rook(color, 35);
		piecesArray[1] = new Bishop(color, 34);
		piecesArray[2] = new Knight(color, 33);	
		piecesArray[3] = new Knight(color, 32);
		piecesArray[4] = new Bishop(color, 31);
		piecesArray[5] = new Rook(color, 20);
		
		}
		else {
			
			piecesArray[0] = new Rook(color, 5);
			piecesArray[1] = new Bishop(color, 4);
			piecesArray[2] = new Knight(color, 3);	
			piecesArray[3] = new Knight(color, 2);
			piecesArray[4] = new Bishop(color, 1);
			piecesArray[5] = new Rook(color, 0);
			
		}
	}
	
	public void printPlayer() {
		
		System.out.printf("Player Name: %s\n", this.name);
		System.out.printf("Player Color: %s\n\n", this.color);

		for (Piece piece : piecesArray) {
			
			piece.printPiece();
			System.out.println();
	
		}
		
	}
	
}
