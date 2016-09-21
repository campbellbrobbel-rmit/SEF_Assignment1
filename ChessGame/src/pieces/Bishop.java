package pieces;

import utilities.Color;

public class Bishop extends Piece {

	private final static int[][] potentialLocations = {{1,1,-1,-1,2, 2,-2,-2,3,3,-3,-3,4, 4,-4,-4, 5,5,-5,-5,6, 6,-6,-6},{-1, 1,-1, 1,2,-2,2,-2,-3, 3,-3, 3,4,-4,4,-4,-5, 5,-5, 5,6,-6,6,-6}};
	
	public Bishop(Color color, int xCoord, int yCoord) {
		super(color, xCoord, yCoord, Bishop.potentialLocations);
		this.letter = 'B';
	}

	@Override
	public void printPiece() {
		System.out.println("\tPiece Type: Bishop");
		System.out.printf("\tPiece Color: %s\n", this.color);
		System.out.printf("\tPiece Board Index: %d\n\n", this.boardIndex);
	}

	@Override
	protected boolean pathIsClear() {
		// TODO Auto-generated method stub
		return false;
	}
}

