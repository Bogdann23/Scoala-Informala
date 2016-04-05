package sb;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		String nume;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		nume = scan.nextLine();
		
		// We split the words " " and use a for loop to extract the initials
		// from an array of strings which is Split on space and we iterate on the single words
			
		String n[] = nume.split(" "); 
		for (int i = 0; i < n.length; i++) {
	        String s = n[i]; 
	        System.out.println(s.charAt(0)); //print the first character of each word
		}
	}
}
