package utilities;

import java.awt.Point;

public class Utilities {

	/* 
	 * This method checks if the coordinates are in the correct format. 
	 * Must be input with the letter before the number for it to be valid (e.g. A6)
	 */
	public static boolean checkInputCoordinates(char[] letterArray, int xSize, int ySize) {
		char char1 = Character.toUpperCase(letterArray[0]);
		char char2 = Character.toUpperCase(letterArray[1]);
		
		if(char1 >= 'A' && char1 <= 'A' + xSize && char2 >= '1' && char2 <= '1' + ySize)
			return true;
		
		return false;
	}
	
	public static Point charsToPoint(char[] letterArray) {
		
		int x = Character.toUpperCase(letterArray[0]) - 'A';
		int y = letterArray[1];
		
		System.out.printf("X: %d, Y; %d\n", x, y);
		
		return new Point(x, y);
	}

	public static Point intOffsetToCoordinate(Point point, int offset) {
		
		int oldPointX = (int)point.getX(), oldPointY = (int)point.getY();
		int newPointX = 0, newPointY = 0, tempOffset = offset;
		Point newCoordinate;
		
		while(tempOffset % 6 != 0) {

			if (newPointX < 5) {
				
				newPointX++;
				
			}
			else {
				
				newPointX = 0;
				newPointY++;
			}
			if(offset > 0) {
				
				tempOffset--;

			}
			else {
				
				tempOffset++;
			}
			

		}
		
		newPointY += tempOffset/6;
		newCoordinate = new Point(oldPointX + newPointX, oldPointY + newPointY);
		
		return newCoordinate;
	}
}
