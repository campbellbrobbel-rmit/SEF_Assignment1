package board;

import pieces.Piece;

public final class FullTile extends Tile {

	public FullTile(int xCoord, int yCoord) {
		super(xCoord, yCoord);
		
	}

	
	public boolean isTileEmpty() {
		return false;
	}

	
	public Piece getPiece() {
		return null;
	}

}
