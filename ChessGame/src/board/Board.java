package board;
import java.util.*;
import pieces.*;

import pieces.Bishop;
import pieces.Knight;
import pieces.Piece;
import pieces.Rook;
import player.Player;
import utilities.Color;

public class Board {

	private final int xSize, ySize, totalTiles;
	List<Tile> boardTileList = new ArrayList<Tile>();
	
	
	public Board(int xSize, int ySize) {
		
		this.xSize = xSize;
		this.ySize = ySize;
		this.totalTiles = this.xSize * this.ySize;
				
		int totalTileCount = 0;

		// Create a new Empty Tile Object and place them in the boardTileArray. 
		while (totalTileCount < this.totalTiles) {

			for (int xCount = 0; xCount < this.xSize; xCount++ ) {

				for (int yCount = 0; yCount < this.ySize; yCount++) {
					
					Tile tile = new Tile(xCount, yCount, totalTileCount);
					boardTileList.add(totalTileCount, tile); 
					totalTileCount++;
					
					
				}
				
				
			}
		}
		
		
	}
	
	// This method only deals with moving the piece on the board. Does not create a new Move object.
	public void applyMove(Move move) {
		
	
		// Add the Piece from the tile from the starting index to the Tile that matches the end Index. 
		this.boardTileList.get(move.getEndIndex()).addPieceToTile(this.boardTileList.get(move.getStartIndex()).getPiece());
		
		//Update the starting tile to now be Empty. 
		this.boardTileList.get(move.getStartIndex()).removePieceFromTile();
		//this.boardTileList.get(move.getStartIndex()).removePieceFromTile();
	}
	
	public List<Tile> getBoardTileList() {
		
		return this.boardTileList;
	}
	
	
	/* Creates the original player pieces and adds them to the appropriate tile. */
	public void initPlayerPieces() {
		
		Color black = Color.BLACK;
		boardTileList.get(30).addPieceToTile(new Rook(black, 30));
		boardTileList.get(31).addPieceToTile(new Bishop(black, 31));
		boardTileList.get(32).addPieceToTile(new Knight(black, 32));
		boardTileList.get(33).addPieceToTile(new Knight(black, 33));
		boardTileList.get(34).addPieceToTile(new Bishop(black, 34));
		boardTileList.get(35).addPieceToTile(new Rook(black, 35));
		
		Color white = Color.WHITE;
		boardTileList.get(0).addPieceToTile(new Rook(white, 0));
		boardTileList.get(1).addPieceToTile(new Bishop(white, 1));
		boardTileList.get(2).addPieceToTile(new Knight(white, 2));
		boardTileList.get(3).addPieceToTile(new Knight(white, 3));
		boardTileList.get(4).addPieceToTile(new Bishop(white, 4));
		boardTileList.get(5).addPieceToTile(new Rook(white, 5));
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
				
				if (this.boardTileList.get(totalPrintedTiles).isOccupied()) {
					
					if(this.boardTileList.get(totalPrintedTiles).getPiece().getColor() == Color.BLACK) {
						
						System.out.printf("| b%c", this.boardTileList.get(totalPrintedTiles).getPiece().getLetter());
	
					}
					else {
						
						System.out.printf("| w%c", this.boardTileList.get(totalPrintedTiles).getPiece().getLetter());
	
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

