package objectCreation;

/**
 * @author Bogdan
 * @version 1.0
 */
public class SomethingIsWrong {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
        Rectangle myRect = new Rectangle(); // I created the object by Instantiation and Initialization
        myRect.width = 40;
        myRect.height = 50;
        
        //The next statement will display the return value, meaning the area of the triangle
        System.out.println("myRect's area is " + myRect.area()); 
    }
}


