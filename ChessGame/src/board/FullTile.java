package board;

import pieces.Piece;

public final class FullTile extends Tile {

	Piece tilePiece;
	
	public FullTile(int xCoord, int yCoord, int boardIndex, Piece tilePiece) {
		super(xCoord, yCoord, boardIndex);
		this.tilePiece = tilePiece;
	}

	@Override
	public boolean isTileEmpty() {
		return false;
	}

	@Override
	public Piece getPiece() {
		return this.tilePiece;
	}

	@Override
	public void printTile() {
	
		System.out.println("Full Tile\n");
		System.out.printf("x Co-Ordinate: %d, y Co-Ordinate: %d", this.xCoord, this.yCoord);

	}

	

}
