package player;

import pieces.*;

import java.awt.Point;
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
	public boolean makeMove (Board board, Point startPoint, Point endPoint) {
		
			Piece movingPiece = board.getTileArray()[(int)startPoint.getX()][(int)startPoint.getY()].getPiece();
	
			//Check If it is a valid move.
			if(movingPiece.isValidMove(board, startPoint, endPoint)) {
				
				//If the destination tile is occupied with an enemy piece.
				if (board.getTileArray()[(int)startPoint.getX()][(int)startPoint.getY()].isOccupied()) {
					
					Piece enemyPiece = board.getTileArray()[(int)endPoint.getX()][(int)endPoint.getY()].getPiece();
					Move move = new Move(movingPiece, enemyPiece, endPoint);
					this.addMoveToList(move);
					board.applyMove(move);
					
					return true;
				}
				// If the destination tile is not occupied
				
				else {
					
					Move move = new Move(movingPiece, null, endPoint);
					this.addMoveToList(move);
					board.applyMove(move);
					return true;
				}
				
				
			}
			
	
		return false;
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
