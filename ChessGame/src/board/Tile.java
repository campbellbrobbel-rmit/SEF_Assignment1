package board;

import pieces.Piece;

public class Tile {
	
	/* 
	 * Each tile will have an X/Y co-ordinate, as well as an int representing 
	 * the index it is placed in inside of board
	 */
	
	protected final int xCoord;
	protected final int yCoord;
	protected final int boardIndex;
	private Piece tilePiece = null;
	private boolean occupied = false;
	
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
	
	public void applyMove() {
		
		this.tilePiece = null;
		this.occupied = false;
	}
	
	public int getBoardIndex() {
		
		return this.boardIndex;
	}
	
	public boolean isOccupied() {
		
		return this.occupied;
		
	}
	public void addPieceToTile(Piece piece) {
		
		this.tilePiece = piece;
		this.occupied = true;
		
	}
	public void removePieceFromTile() {
		
		this.tilePiece = null;
		this.occupied = false;
	}
	public Piece getPiece() {
		
		return this.tilePiece;
		
	}
	public void printTile() {
		
		if(this.tilePiece == null) {
			
			System.out.println("Empty Tile");

		}
		else {
			
			System.out.println("Occupied Tile");

		}
		
		System.out.printf("x Co-Ordinate: %d, y Co-Ordinate: %d\n", this.xCoord, this.yCoord);
		System.out.printf("Tile Board Index: %d\n\n", this.getBoardIndex());
		
		if(this.occupied) {
			
			this.tilePiece.printPiece();

		}
	}
	
}
