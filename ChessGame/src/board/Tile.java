package board;

import java.awt.Point;

import pieces.Piece;

public class Tile {
	
	/* 
	 * Each tile will have an X/Y co-ordinate, as well as an int representing 
	 * the index it is placed in inside of board
	 */
	
	
	protected final Point boardPoint;
	private Piece tilePiece = null;
	private boolean occupied = false;
	
	Tile (int xCoord, int yCoord) {
		
		this.boardPoint = new Point(xCoord, yCoord);
		
	}
	
	public int getXCoord() {
				
		return (int) this.boardPoint.getX();
	}
	
	public int getYCoord() {
		
		return (int) this.boardPoint.getY();	}
	
	public void applyMove() {
		
		this.tilePiece = null;
		this.occupied = false;
	}

	
	public boolean isOccupied() {
		
		return this.occupied;
		
	}
	public void setPiece(Piece piece) {
		
		this.tilePiece = piece;
		if (piece == null) {
			
			this.occupied = false;
		}
		else {
			
			this.occupied = true;
			
		}
		
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
		
		System.out.printf("x Co-Ordinate: %d, y Co-Ordinate: %d\n", (int)this.boardPoint.getX(), (int)this.boardPoint.getY());
		
		if(this.occupied) {
			
			this.tilePiece.printPiece();

		}
	}
	
}
