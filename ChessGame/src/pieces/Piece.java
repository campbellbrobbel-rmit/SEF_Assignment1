package pieces;
import board.*;
import utilities.Color;

/*
 * This is an abstract class that provides a framework for the different piece types.
 * Each Piece is going to have a color and an index number that shows it's location on a board.
 */

public abstract class Piece {

	protected final Color color;
	protected int boardIndex;
	private boolean isEliminated = false;
	public char letter;
	private int[] possibleMoves;
	
	Piece (Color color, int boardIndex) {
		
		this.boardIndex = boardIndex;
		this.color = color;
		
	}
	
	public char getLetter() {
		
		return this.letter;
	}
	public int getBoardIndex() {
		
		return this.boardIndex;
	}
	
	public void setBoardIndex(int newIndex) {
		
		this.boardIndex = newIndex;
	}
	
	public Color getColor() {
		
		return this.color;
	}
	public void applyMove (Move move) {
		
		this.boardIndex = move.getEndIndex();
		
	}
	
	public abstract void printPiece();
	public abstract int[] possibleMoveLocations(Tile tile);
	
	
}
