package constAndNestedC;
/**
 * @author Bogdan
 */

public class Problem {

	String s;
	
	static class Inner {
		//Q: What do you need to do to make it compile? 
		//R: To make it compile we need an instance of the class Problem. With it we will access the attribute
		//Q: Why?
		//R: We can't access non-static data from within a static class. 
		
		Problem pr = new Problem(); // I created an instance of the class
	
		void testMethod() {

			// Now if I call the attribute of the class Problem, the error is gone
			pr.s = "Set from Inner";  
		}
	}

	
}
