package pieces;

import board.*;
import utilities.*;

public class Rook extends Piece {

	private final static int[][] potentialLocations = {{1},{-30,-24,-18,-12,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,12,18,24,30}};
	
	public Rook(Color color, int xCoord, int yCoord) {
		
		
		super(color, xCoord, yCoord, Rook.potentialLocations);
		this.letter = 'R';

	}

	@Override
	public void printPiece() {

		System.out.println("\tPiece Type: Rook");
		System.out.printf("\tPiece Color: %s\n", this.color);
		System.out.printf("\tPiece Board Index: %d\n\n", this.boardIndex);

		
		
	}

	@Override
	protected boolean pathIsClear() {
		// TODO Auto-generated method stub
		return false;
	}


}
