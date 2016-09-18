package board;

public class Board {

	private final int xSize, ySize, totalTiles;
	Tile boardTileArray[];
	
	
	public Board(int xSize, int ySize) {
		
		this.xSize = xSize;
		this.ySize = ySize;
		this.totalTiles = this.xSize * this.ySize;
		
		
		boardTileArray = new EmptyTile[this.totalTiles];
		
		int totalTileCount = 0;

		while (totalTileCount < this.totalTiles) {

			for (int xCount = 0; xCount < this.xSize; xCount++ ) {

				for (int yCount = 0; yCount < this.ySize; yCount++) {

					boardTileArray[totalTileCount] = new EmptyTile(xCount, yCount, totalTileCount);
					totalTileCount++;
					
					
				}
				
				
			}
		}
		
	}

	public void printBoard() {
		
		for(Tile tile : boardTileArray) {
			
			tile.printTile();
			
			
		}
		
		System.out.println();
		
	}
}

