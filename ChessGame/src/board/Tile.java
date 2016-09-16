package board;

import pieces.Piece;

public abstract class Tile {
	
	int xCoord, yCoord;
	
	Tile (int xCoord, int yCoord) {
		
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public abstract boolean isTileEmpty();
	public abstract Piece getPiece();
	
}
