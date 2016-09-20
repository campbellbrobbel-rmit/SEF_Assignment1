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
	/*
	 * This is the method used to move the piece. The startIndex is the co-ordinate
	 * of the piece being moved and the endIndex is the position that the player wants to move them to.
	 * It is going to return false if the move is invalid and true if it is a valid move.
	 */
	public boolean makeMove (Board board, int startIndex, int endIndex) {
		
		Tile tempTile = board.getBoardTileList().get(startIndex);
		
		if(tempTile.getPiece() != null) {
			
			for(int potentialTileLocation : tempTile.getPiece().possibleMoveLocations(tempTile)) {
				
				/* Compare the end index with a list of possible index's that the piece can move to*/
				if (potentialTileLocation == endIndex - startIndex) {
					
					if(!(board.getBoardTileList().get(endIndex).isOccupied())) {
						
						Move move = new Move(tempTile.getPiece(), null, potentialTileLocation);
						this.addMoveToList(move);
						board.applyMove(move);
						
						return true;
					}
					else if (board.getBoardTileList().get(endIndex).getPiece().getColor() != this.color) {
						
						/*
						 *  IF THE DESTINATION TILE CONTAINS A PIECE OF THE OPPOSITE COLOR AS THE PLAYER,
						 *  IT IS A VALID ATTACKING MOVE.
						 *  
						 */
						return true;
						
					}
					else {
						
						System.out.println("Invalid Move 1");
						// OTHERWISE, NOT A VALID MOVE
						return false;
					}
				}
				
				
			}
		}
		else {
			
			System.out.println("\nNot a valid piece. Please enter the co-rdinates of a piece.");
			return false;
		}
		
		return true;
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
