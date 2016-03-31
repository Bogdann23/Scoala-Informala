package objectCreation;
/**
 * 
 * @author Bogdan
 * @version 1.0
 * Constructs a class Rectangle in order to finalize the object creation that caused the error
 */
public class Rectangle {
	int width;
	int height;
	int area;
	/**
	 * @return - will return the area of the triangle resulted after the calculation
	 */
	public int area() {
		area = width * height;
		return area;
	}
}
