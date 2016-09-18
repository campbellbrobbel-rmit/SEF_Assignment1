package board;
import java.util.*;

import pieces.Piece;
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
	
	public void initPlayerPieces(Player player1, Player player2) {
		
		
		for (Piece piece: player1.getPiecesArray()) {
			
			this.addPlayerPieceToTile(player1);
		}
		for (Piece piece: player2.getPiecesArray()) {
			
			this.addPlayerPieceToTile(player2);
		}
		
	}
	
	private void addPlayerPieceToTile(Player player) {
		
		for (Piece piece: player.getPiecesArray()) {
		
			int boardIndex = piece.getBoardIndex();
			this.boardTileList.get(boardIndex).addPieceToTile(piece);
			
		}
	}

	public void printBoard() {
		
		for(Tile tile : boardTileList) {
			
			tile.printTile();
			
			
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
			
			System.out.printf("%d", ySize - yCount);

			
			for (int xCount = 0; xCount < this.xSize; xCount++) {
				
				if (this.boardTileList.get(totalPrintedTiles).isOccupied()) {
					
					if(this.boardTileList.get(totalPrintedTiles).getPiece().getColor() == Color.BLACK) {
						
						System.out.print("| b ");
	
					}
					else {
						
						System.out.print("| w ");
	
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
			
			System.out.println("--");
		}
		
		
		char letter = 'a';

		for(int xCount = 0; xCount < xSize; xCount++) {
			
			System.out.printf("  %c ", letter);
			letter++;
			
		}
	}
}

