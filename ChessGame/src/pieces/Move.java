package pieces;

import java.awt.Point;

public class Move {

	private final Point startPoint, endPoint;
	
	private Piece piece;
	private Piece attackedPiece = null;
	
	public Move(Piece piece, Piece attackedPiece, Point destinationPoint) {
		
		this.startPoint = piece.boardPoint;
		this.endPoint = destinationPoint;
		this.piece = piece;
		
		if (attackedPiece != null) {
			
			if(piece.getColor() != attackedPiece.getColor()) {
				
				this.attackedPiece = attackedPiece;
				
			}
		}
	}
	
	public Point getStartPoint() {
		
		return this.startPoint;
		
	}
	
	public Point getEndPoint() {
		
		return this.endPoint;
	}
}
