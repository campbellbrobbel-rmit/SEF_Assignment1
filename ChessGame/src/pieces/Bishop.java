package pieces;

import board.Tile;
import utilities.Color;

public class Bishop extends Piece {

	public Bishop(Color color, int boardIndex) {
		
		super(color, boardIndex);
		this.letter = 'B';
	}

	@Override
	public void printPiece() {

		System.out.println("\tPiece Type: Bishop");
		System.out.printf("\tPiece Color: %s\n", this.color);
		System.out.printf("\tPiece Board Index: %d\n\n", this.boardIndex);

		
	}

	@Override
	public int[] possibleMoveLocations(Tile tile) {
		
		
		return null;
	}
	
	
	
}

