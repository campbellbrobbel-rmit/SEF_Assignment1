package board;

import pieces.Piece;

public final class FullTile extends Tile {

	Piece tilePiece;
	
	public FullTile(int xCoord, int yCoord, Piece tilePiece) {
		super(xCoord, yCoord);
		this.tilePiece = tilePiece;
	}

	
	public boolean isTileEmpty() {
		return false;
	}

	
	public Piece getPiece() {
		return this.tilePiece;
	}

}
