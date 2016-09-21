package pieces;
import java.awt.Point;

import board.*;
import utilities.Color;


public class Knight extends Piece {

	private final static int[][] potentialLocations = {{2,-2,2,-2,1,-1,1,-1},{1,1,-1,-1,2,2,-2,-2}};
	/*
	 *  This is a list of the possible move locations relative to 
	 *  the pieces location which is stored in "boardIndex".  
	 */
	 
	
	public Knight(Color color, int xCoord, int yCoord) {
				
		super(color, xCoord, yCoord, Knight.potentialLocations);
		this.letter = 'K';
		
	}

	@Override
	public void printPiece() {
		
		System.out.println("\tPiece Type: Knight");
		System.out.printf("\tPiece Color: %s\n", this.getColor());
		System.out.printf("\tPiece Board Index: %d\n\n", this.boardIndex);
		
	}

	@Override
	protected boolean pathIsClear() {
		// TODO Auto-generated method stub
		return true;
	}

	 
	
	
}
