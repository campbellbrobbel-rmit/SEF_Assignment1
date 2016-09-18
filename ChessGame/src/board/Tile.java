package board;

import pieces.Piece;

public abstract class Tile {
	
	/* 
	 * Each tile will have an X/Y co-ordinate, as well as an int representing 
	 * the index it is placed in inside of board
	 */
	
	protected final int xCoord;
	protected final int yCoord;
	protected final int boardIndex;
	
	Tile (int xCoord, int yCoord, int boardIndex) {
		
		this.boardIndex = boardIndex;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public int getXCoord() {
				
		return this.xCoord;
	}
	
	public int getYCoord() {
		
		return this.yCoord;
	}
	
	public int getBoardIndex() {
		
		return this.boardIndex;
	}
	
	public abstract boolean isTileEmpty();
	public abstract Piece getPiece();
	public abstract void printTile();
	
}
