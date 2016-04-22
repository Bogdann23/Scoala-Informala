package exceptii;
import java.io.*;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

/**
 * @author Bogdan
 *
 */
public class ListOfNumbers {
	private Vector<Integer> vec;
	private static final int SIZE = 10;

	public ListOfNumbers () {
		vec = new Vector<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++)
			vec.addElement(new Integer(i));

		this.readList();
		this.writeList();
	}
	
	//adding readList method*************
	public void readList() {
		try {
			//FileReader object created with the file name
			FileReader fr = new FileReader("D:/fisier.txt"); 
			//BufferedReader object actually does the reading in the file
			BufferedReader br = new BufferedReader(fr); 

			//we have a string from which we read a line at a time
			String str;
			//as the line is read it will be printed. This will be done until we reach the file end
			while((str = br.readLine()) != null) {
				System.out.println(str + "\n");
			}
			br.close(); //closing the stream helps avoid resource leaks
		}
		catch (IOException e) {
			System.out.println("File not found");
		}
	}


	public void writeList() {
		PrintWriter out = null;
		try {
			System.out.println("Entering try statement");
			out = new PrintWriter(new FileWriter("OutFile.txt"));
			for (int i = 0; i < SIZE; i++)
				out.println("Value at: " + i + " = " + vec.get(i));
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundsException: " +
					e.getMessage());
		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());
		} finally {
			if (out != null) {
				System.out.println("Closing PrintWriter");
				out.close();
			} else {
				System.out.println("PrintWriter not open");
			}
		}
	}
	
	public static void main(String[] args) {
		new ListOfNumbers();
	}
}
