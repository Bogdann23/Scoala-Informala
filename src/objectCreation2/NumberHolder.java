package objectCreation2;

/**
 * @author Bogdan
 * @version 1.0
 */
public class NumberHolder {
	public int anInt;
    public float aFloat;
    
    /**
     * 
     * @param args
     */
    
    public static void main(String[] args) {
    	NumberHolder Nr = new NumberHolder(); //We create an instance of the class
    	
    	//Next we initialize the two member variables
    	Nr.anInt = 10;
    	Nr.aFloat = 3.11f;
    	
    	//Next we display the value of each member variable
    	System.out.println("Numarul de tip int are valoarea " + Nr.anInt);
    	System.out.println("Al doilea numar, de tip float, are valoarea " + Nr.aFloat);
    }
}

