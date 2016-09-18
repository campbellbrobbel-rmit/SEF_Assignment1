package pieces;

import utilities.Color;

public class Knight extends Piece {

	/*
	 *  This is a list of the possible move locations relative to 
	 *  the pieces location which is stored in "boardIndex".  
	 */
	
	private final int[] possibleMoves = {-13,-11,-8, -4, 4, 8, 11, 13};
	
	public Knight(Color color, int boardIndex) {
		super(color, boardIndex);
	}

	@Override
	public void printPiece() {
		
		System.out.println("\tPiece Type: Knight");
		System.out.printf("\tPiece Color: %s\n", this.color);
		System.out.printf("\t\tPiece Board Index: %d\n\n", this.boardIndex);
		
	}
	
	
	
	
}
