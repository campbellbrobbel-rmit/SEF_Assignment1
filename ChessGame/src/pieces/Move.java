package pieces;

public class Move {

	private final int startIndex, endIndex;
	
	private Piece piece;
	private Piece attackedPiece = null;
	
	public Move(Piece piece, Piece attackedPiece, int moveOffset) {
		
		this.startIndex = piece.boardIndex;
		this.endIndex = startIndex + moveOffset;
		this.piece = piece;
		
		if (attackedPiece != null) {
			
			if(piece.getColor() != attackedPiece.getColor()) {
				
				this.attackedPiece = attackedPiece;
				
			}
		}
	}
	
	public int getStartIndex() {
		
		return this.startIndex;
		
	}
	
	public int getEndIndex() {
		
		return this.endIndex;
	}
}
