package pieces;

import java.awt.Point;

import board.*;
import utilities.*;;

/*
 * This is an abstract class that provides a framework for the different piece types.
 * Each Piece is going to have a color and an index number that shows it's location on a board.
 */

public abstract class Piece {

	protected final Color color;
	protected int boardIndex;
	protected Point boardPoint;
	private boolean isEliminated = false;
	public char letter;
	protected final int[][] potentialLocations;
	
	
	public Piece (Color color, int xCoord, int yCoord, int[][] potentialLocationOffsets) {
		
		this.boardPoint = new Point(xCoord, yCoord);
		this.color = color;
		this.potentialLocations = potentialLocationOffsets;
	}
	
	public int getXCoord() {
		
		return (int) this.boardPoint.getX();
	}
	
	public int getYCoord() {
		
		return (int) this.boardPoint.getY();
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
		
		this.boardPoint = move.getEndPoint();
		
	}
	
	
	public boolean isValidMove(Board board, Point startPoint, Point endPoint) {
		
		Tile startTile = board.getTileArray()[(int)startPoint.getX()][(int)startPoint.getY()];
		Tile endTile = board.getTileArray()[(int)endPoint.getX()][(int)endPoint.getY()];		
		
		
		if (this.isPotentialLocation(endPoint)) {
			
			// Starting Tile holds a piece of the same color as the player
			if(startTile.getPiece() != null && startTile.getPiece().getColor() == this.color) {
				//Destination Tile Piece is either empty or not the same color as the player.
				if(endTile.getPiece() == null || endTile.getPiece().getColor() != this.getColor()) {
					//Destination X is within board boundaries
					if (endPoint.getX() >= 0 && endPoint.getX() <= board.getXSize()) {
						//Destination Y is within board boundaries
						if (endPoint.getY() >= 0 && endPoint.getY() <= board.getYSize()) {
								
							return true;
							
						}
					
					}
				}
			}
		}
		
		return false;
		
	}
	
	private boolean isPotentialLocation(Point endPoint) {
		
		
			for(int number2 = 0; number2 < this.potentialLocations[0].length; number2++) {
				
				int xOffset = this.potentialLocations[0][number2];
				int yOffset = this.potentialLocations[1][number2];
				System.out.printf("Offset X: %d, Y: %d\n", xOffset, yOffset);
				Point point = new Point((int)this.boardPoint.getX() + xOffset, (int)this.boardPoint.getY() + yOffset);

				if (point.equals(endPoint)) {
					
					return true;
				} 
			}
		
		
		return false;
	}
	
	// Each Piece will need to determine if their path is clear before it can be determined a valid move.
	protected abstract boolean pathIsClear();
	
	public abstract void printPiece();
}
