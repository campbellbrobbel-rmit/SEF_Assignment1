package pieces;

import utilities.Color;

public class Bishop extends Piece {

	public Bishop(Color color, int boardIndex) {
		
		super(color, boardIndex);
		
	}

	@Override
	public void printPiece() {

		System.out.println("\tPiece Type: Bishop");
		System.out.printf("\tPiece Color: %s\n", this.color);
		System.out.printf("\t\tPiece Board Index: %d\n", this.boardIndex);

		
	}
	
	
	
}

