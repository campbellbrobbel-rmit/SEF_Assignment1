package board;

import pieces.Piece;

public final class EmptyTile extends Tile {

	public EmptyTile(int xCoord, int yCoord, int boardIndex) {
		super(xCoord, yCoord, boardIndex);
	}

	@Override
	public void printTile() {
		
		System.out.println("Empty Tile");
		System.out.printf("x Co-Ordinate: %d, y Co-Ordinate: %d\n", this.xCoord, this.yCoord);
		System.out.printf("Tile Board Index: %d\n\n", this.getBoardIndex());

	}

	@Override
	public boolean isTileEmpty() {
		return true;
	}

	@Override
	public Piece getPiece() {
		return null;
	}

}
