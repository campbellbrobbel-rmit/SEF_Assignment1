package pieces;
import board.*;
import utilities.Color;

public class Knight extends Piece {

	/*
	 *  This is a list of the possible move locations relative to 
	 *  the pieces location which is stored in "boardIndex".  
	 */

	public Knight(Color color, int boardIndex) {
		super(color, boardIndex);
		this.letter = 'K';

	}

	@Override
	public void printPiece() {
		
		System.out.println("\tPiece Type: Knight");
		System.out.printf("\tPiece Color: %s\n", this.color);
		System.out.printf("\tPiece Board Index: %d\n\n", this.boardIndex);
		
	}

	@Override
	public int[] possibleMoveLocations(Tile tile) {
		
		if(tile.getYCoord() == 0) {
			
			if(tile.getXCoord() == 0) {
				
				int[] moveLocations = {8, 13};
				return moveLocations; 
			
			}
			else if(tile.getXCoord() == 1) {
				
				int[] moveLocations = {8, 11, 13};
				return moveLocations;
				
			}
			else if (tile.getXCoord() == 4) {
				
				int[] moveLocations = {4, 11, 13};
				return moveLocations;
				
			}
			else if (tile.getXCoord() == 5) {
				
				int[] moveLocations = {4, 11};
				return moveLocations;
				
			}
			else {
				
				int[] moveLocations = {4, 8, 11, 13};
				return moveLocations;
				
				
			}
		}
		
		else if (tile.getYCoord() == 1) {
			
			if(tile.getXCoord() == 0) {
				
				int[] moveLocations = {-4, 8, 13};
				return moveLocations; 
			
			}
			else if(tile.getXCoord() == 1) {
				
				int[] moveLocations = {-4, 8, 11, 13};
				return moveLocations;
				
			}
			else if (tile.getXCoord() == 4) {
				
				int[] moveLocations = {-8, 4, 11, 13};
				return moveLocations;
				
			}
			else if (tile.getXCoord() == 5) {
				
				int[] moveLocations = {-8, 4, 11};
				return moveLocations;
				
			}
			else {
				
				int[] moveLocations = {-4,-8, 4, 8, 11, 13};
				return moveLocations;
				
				
			}
			
		}
		else if (tile.getYCoord() == 4) {
			
			if(tile.getXCoord() == 0) {
				
				int[] moveLocations = {-11, -4, 8};
				return moveLocations; 
			
			}
			else if(tile.getXCoord() == 1) {
				
				int[] moveLocations = {-13, -11, -4, 8};
				return moveLocations;
				
			}
			else if (tile.getXCoord() == 4) {
				
				int[] moveLocations = {-13, -11, -8, 4};
				return moveLocations;
				
			}
			else if (tile.getXCoord() == 5) {
				
				int[] moveLocations = {-13, -8, 4,};
				return moveLocations;
				
			}
			else {
				
				int[] moveLocations = {-13, -11, -4, -8, 4, 8};
				return moveLocations;
				
				
			}
			
		}
		else if (tile.getYCoord() == 5) {
			
			if(tile.getXCoord() == 0) {
				
				int[] moveLocations = {-4, -11};
				return moveLocations; 
			
			}
			else if(tile.getXCoord() == 1) {
				
				int[] moveLocations = {-4, -11, -13};
				return moveLocations;
				
			}
			else if (tile.getXCoord() == 4) {
				
				int[] moveLocations = {-8, -11, -13};
				return moveLocations;
				
			}
			else if (tile.getXCoord() == 5) {
				
				int[] moveLocations = {-8, -13};
				return moveLocations;
				
			}
			else {
				
				int[] moveLocations = {-4,-8, -11, -13};
				return moveLocations;
				
				
			}
			
		}
		
		else {
	
				int[] moveLocations = {-13, -11, -4,-8, 4, 8, 11, 13};
				return moveLocations;
		
		}
		
	}
	
	
	
	
}
