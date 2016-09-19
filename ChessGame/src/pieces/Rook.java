package pieces;
import board.*;
import utilities.Color;

public class Rook extends Piece {

	public Rook(Color color, int boardIndex) {
		
		super(color, boardIndex);
		this.letter = 'R';

	}

	@Override
	public void printPiece() {

		System.out.println("\tPiece Type: Rook");
		System.out.printf("\tPiece Color: %s\n", this.color);
		System.out.printf("\tPiece Board Index: %d\n\n", this.boardIndex);

		
		
	}

	@Override
	public int[] possibleMoveLocations(Tile tile) {
		return null;
	}

}
