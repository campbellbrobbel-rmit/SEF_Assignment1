package utilities;

import java.awt.Point;

public class Utilities {

	/* 
	 * This method checks if the coordinates are in the correct format. 
	 * Must be input with the letter before the number for it to be valid (e.g. A6)
	 */
		public static boolean checkInputCoordinates(Character[] coordinatesInputArray) {
			
			if(coordinatesInputArray[0] == 'A' || coordinatesInputArray[0] == 'a' || coordinatesInputArray[0] == 'B' || coordinatesInputArray[0] == 'b' 
					|| coordinatesInputArray[0] == 'C' || coordinatesInputArray[0] == 'c' || coordinatesInputArray[0] == 'D' || coordinatesInputArray[0] == 'd'
					|| coordinatesInputArray[0] == 'E' || coordinatesInputArray[0] == 'e' || coordinatesInputArray[0] == 'F' || coordinatesInputArray[0] == 'f'
					) {
				

				if(coordinatesInputArray[1] == '1' || coordinatesInputArray[1] == '2' || coordinatesInputArray[1] == '3' || coordinatesInputArray[1] == '4'
						|| coordinatesInputArray[1] == '5' || coordinatesInputArray[1] == '6') {

					return true;
					
				}
				
			}
			
			return false;
		}
		
		public static Point convertCharactersToPoint(Character[] coordinatesInputArray) {
			
			int x = 0, y = 0;
			int count = 0;
			
			
			while(count < 2) {
			
				if(coordinatesInputArray[count] == 'A' || coordinatesInputArray[count] == 'a') {
					
					x = 0;
				}
				else if(coordinatesInputArray[count] == 'B' || coordinatesInputArray[count] == 'b') {
					x = 1;
				}
				else if(coordinatesInputArray[count] == 'C' || coordinatesInputArray[count] == 'c') {
					
					x = 2;
				}
				else if(coordinatesInputArray[count].equals('D') || coordinatesInputArray[0].equals('d')) {
					
					x = 3;
				}
				else if(coordinatesInputArray[count] == 'E' || coordinatesInputArray[count] == 'e') {
				
					x = 4;
				}
				else if(coordinatesInputArray[count] == 'F' || coordinatesInputArray[count] == 'f') {
					
					x = 5;
				}
				else if(coordinatesInputArray[count] == '6') {
					
					y = 0;
				}
				else if(coordinatesInputArray[count] == '5') {
					y = 1;
				}
				else if(coordinatesInputArray[count] == '4') {
					y = 2;
				}
				else if(coordinatesInputArray[count] == '3') {
					y = 3;
				}
				else if(coordinatesInputArray[count] == '2') {
					y = 4;
				}
				else if(coordinatesInputArray[count] == '1') {
					y = 5;
				}
				
				
				count++;
			}
			
			
			Point coordinate = new Point(x, y);
			System.out.printf("X: %d, Y; %d\n", (int)coordinate.getX(), (int)coordinate.getY());
			
			
			return coordinate;
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
