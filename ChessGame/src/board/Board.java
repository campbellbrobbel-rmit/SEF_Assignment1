package board;

import java.util.*;

import pieces.*;
import utilities.*;

public class Board {

	private final int xSize, ySize, totalTiles;
	List<Tile> boardTileList = new ArrayList<Tile>();
	Tile[][] tileArray;
	
	
	public Board(int xSize, int ySize) {
		
		this.xSize = xSize;
		this.ySize = ySize;
		this.totalTiles = this.xSize * this.ySize;
		this.tileArray = new Tile[xSize][ySize];
		
		int totalTileCount = 0;

		// Create a new Empty Tile Object and place them in the boardTileArray. 
		while (totalTileCount < this.totalTiles) {

			for (int xCount = 0; xCount < this.xSize; xCount++ ) {

				for (int yCount = 0; yCount < this.ySize; yCount++) {
					
					Tile tile = new Tile(xCount, yCount);
					
					this.tileArray[xCount][yCount] = tile;
					//tileArray[xCount][yCount] = new Tile(xCount, yCount, yCount); 
					totalTileCount++;
					
					
				}
				
				
			}
		}
		
		
	}
	
	public int getXSize() {
		
		return this.xSize;
	}
	public int getYSize() {
		
		return this.ySize;
	}
	
	// This method only deals with moving the piece on the board. Does not create a new Move object.
	public void applyMove(Move move) {
		
		/* 
		 * if(this.tileArray[startXIndex][startYIndex].getPiece().isValidMove(new Point(endXIndex - startXIndex, endYIndex - startYIndex))
		&& isOnBoard(startXIndex, startYIndex)) {
				
		} */
		
		// Add the Piece from the tile from the starting index to the Tile that matches the end Index. 
		//this.boardTileList[(int)move.getEndPoint().getX()][(int)move.getEndPoint().getY()].setPiece((this.boardTileList[(int)move.getStartPoint().getX()][(int)move.getStartPoint().getY()].getPiece()));
		this.tileArray[(int)move.getEndPoint().getX()][(int)move.getEndPoint().getY()].setPiece((this.tileArray[(int)move.getStartPoint().getX()][(int)move.getStartPoint().getY()].getPiece()));
		//this.tileArray[endXIndex][endYIndex].addPieceToTile(this.tileArray[startXIndex][startYIndex].getPiece());
		
		//Update the starting tile to now be Empty. 
		//this.boardTileList.get(move.getStartIndex()).setPiece(null);
		this.tileArray[(int)move.getStartPoint().getX()][(int)move.getStartPoint().getY()].setPiece(null);
		//this.tileArray[startXIndex][startYIndex].removePieceFromTile();
	}
	
	public Tile[][] getTileArray() {
		
		return this.tileArray;
	}
	
	
	/* Creates the original player pieces and adds them to the appropriate tile. */
	public void initPlayerPieces() {
		
		Color black = Color.BLACK;
		tileArray[0][5].setPiece(new Rook(black, 0,5));
		tileArray[1][5].setPiece(new Bishop(black, 1, 5));
		tileArray[2][5].setPiece(new Knight(black, 2, 5));
		tileArray[3][5].setPiece(new Knight(black, 3, 5));
		tileArray[4][5].setPiece(new Bishop(black, 4, 5));
		tileArray[5][5].setPiece(new Rook(black, 5, 5));
		
		Color white = Color.WHITE;
		tileArray[0][0].setPiece(new Rook(white, 0, 0));
		tileArray[1][0].setPiece(new Bishop(white, 1, 0));
		tileArray[2][0].setPiece(new Knight(white, 2, 0));
		tileArray[3][0].setPiece(new Knight(white, 3, 0));
		tileArray[4][0].setPiece(new Bishop(white, 4, 0));
		tileArray[5][0].setPiece(new Rook(white, 5, 0));
	}
	

	public void printBoard() {
		
		for(Tile tile : boardTileList) {
			
			tile.printTile();
			System.out.println("---------------");
			
		}
		
		System.out.println();
		
	}
	
	public void printToConsole() {
		
		
		for(int xCount = 0; xCount < xSize; xCount++) {
			
			System.out.print("----");
			
		}
		
		System.out.println("--");
		int totalPrintedTiles = 0;
		for (int yCount = 0; yCount < this.ySize; yCount++) {
			
			System.out.printf("%d ", ySize - yCount);

			
			for (int xCount = 0; xCount < this.xSize; xCount++) {
				
				if (this.tileArray[xCount][yCount].isOccupied()) {
					
					if(this.tileArray[xCount][yCount].getPiece().getColor() == Color.BLACK) {
						
						System.out.printf("| b%c", this.tileArray[xCount][yCount].getPiece().getLetter());
	
					}
					else {
						
						System.out.printf("| w%c", this.tileArray[xCount][yCount].getPiece().getLetter());
	
					}
					
				}
				else {
					
				System.out.print("|   ");
				
				}
			
				totalPrintedTiles++;
			}
			
			System.out.println("|");
			
			for(int xCount = 0; xCount < xSize; xCount++) {
				
				System.out.print("----");
				
			}
			
			System.out.println("---");
		}
		
		
		char letter = 'A';
		
		System.out.print("  |");
		for(int xCount = 0; xCount < xSize; xCount++) {
			
			System.out.printf(" %c |", letter);
			letter++;
			
		}
		System.out.println();
		
		for(int xCount = 0; xCount < xSize; xCount++) {
			
			System.out.print("----");
			
		}
		System.out.println("----");

	}
}

