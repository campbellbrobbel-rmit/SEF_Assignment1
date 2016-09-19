package player;

import pieces.*;

import java.util.*;

import board.*;
import utilities.Color;


public class Player {
	
	private String name;
	private Color color;
	private List<Move>moveList = new ArrayList<Move>();
	
	public Player(String name, Color color) {
		
		this.name = name;
		this.color = color;
		
	}
	public void makeMove (Board board, int startIndex, int endIndex) {
		
		Tile tempTile = board.getBoardTileList().get(startIndex);
		
		for(int potentialTileLocation : tempTile.getPiece().possibleMoveLocations(tempTile)) {
			
			/* Compare the end index with a list of possible index's that the piece can move to*/
			if (potentialTileLocation == endIndex - startIndex) {
				
				if(!(board.getBoardTileList().get(endIndex).isOccupied())) {
					
					Move move = new Move(tempTile.getPiece(), null, potentialTileLocation);
					this.addMoveToList(move);
					board.applyMove(move);
				
				}
				else if (board.getBoardTileList().get(endIndex).getPiece().getColor() != this.color) {
					
					/*
					 *  IF THE DESTINATION TILE CONTAINS A PIECE OF THE OPPOSITE COLOR AS THE PLAYER,
					 *  IT IS A VALID MOVE.
					 *  
					 */
					
				}
				else {
					
					// OTHERWISE, NOT A VALID MOVE
				}
			}
			
			else {
				
				/* 
				 * NOT A VALID MOVE
				 */
				
			}
		}
		
		
	}
	public Move getMoveFromList(int index) {
		
		return moveList.get(index);	
	}
	
	public void addMoveToList(Move move) {
		
		this.moveList.add(move);
	}
	public void printPlayer() {
		
		System.out.printf("Player Name: %s\n", this.name);
		System.out.printf("Player Color: %s\n\n", this.color);
		
	}
	
}
