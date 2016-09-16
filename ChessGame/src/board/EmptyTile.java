package board;

import pieces.Piece;

public final class EmptyTile extends Tile {

	EmptyTile(int xCoord, int yCoord) {
		super(xCoord, yCoord);
	}

	
	public boolean isTileEmpty() {
		return true;
	}

	
	public Piece getPiece() {
		
		return null;
	}

}
