package pieces;

import utilities.Color;

public abstract class Piece {

	protected final Color color;
	protected int boardIndex;
	
	Piece (Color color, int boardIndex) {
		
		this.boardIndex = boardIndex;
		this.color = color;
		
	}
	
	public abstract void printPiece();
	
}
