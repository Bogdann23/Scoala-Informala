package eb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This application manages a store of electronic books format.
 * 
 * @author gheorgheaurelpacurar
 */

//Exercise1: create a HashMap********************************************************

//I created a class to add my own elements to the map 
//three instance variables for the Evaluation attributes
class Evaluation {
	private int stars;
	private int user_id;
	private String description;

// the variables are all set in the constructor when the evaluation is created
	Evaluation(int stars, int user_id, String description) {
		this.stars = stars;
		this.user_id = user_id;
		this.description = description;	
	}

	public int getStars(){
		return stars;
	}

	public int getUser_id() {
		return user_id;
	}

	public String getDescription() {
		return description;
	}
	
	//we override toString(), because when we do a System.out.println(a Evaluation Object), we want to see the title
	public String toString() {
		return description;
		}
}
public class ElectronicBooksStore {

	public static void main(String[] args){

		// declare an array of ElectronicBooks
		ElectronicBook[] books;
		books = new ElectronicBook[3];

		// create a new eBook
		String isbn = "978-606-758-671-8";
		String[] authors = new String[]{"Lev Grossman","Mira Grossman"};
		EBook eBook = new EBook(isbn, authors);
		eBook.setTitle("Taramul Magicianului");
		eBook.setPrice(20.93f);
		eBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.DRM);
		eBook.setRecommendedReader(EBook.eBooksReaders.AMAZON);
		eBook.setPublisher("Nemira");
		eBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2016);
		String[] downloadLinks = new String[]{
				"http://www.elefant.ro/ebooks/fictiune/literatura-de-divertisment/sf-fantasy/taramul-magicianului-al-treilea-volum-al-seriei-magicienii-322807.html"
		};
		eBook.setRemarksAndNotes(new String[] {""});
		eBook.setDownloadLinks(downloadLinks);
		// Add eBook to the books
		books[0] = eBook;
		// create a new eBook
		isbn = "978-606-758-667-1";
		authors = new String[]{"Bogdan Munteanu"};
		eBook = new EBook(isbn, authors);
		eBook.setTitle("Ai uitat sa zambesti.");
		eBook.setPrice(12.53f);
		eBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.DRM);
		eBook.setRecommendedReader(EBook.eBooksReaders.AMAZON);
		eBook.setPublisher("Nemira");
		eBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2016);
		downloadLinks = new String[]{
				"http://www.elefant.ro/ebooks/fictiune/literatura-romana/literatura-romana-contemporana/ai-uitat-sa-razi-322805.html"
		};
		eBook.setDownloadLinks(downloadLinks);
		eBook.setRemarksAndNotes(new String[] {""});
		// Add eBook to the books
		books[1] = eBook;         
		// create a new eBook
		isbn = "978-606-758-667-3";
		authors = new String[]{"Dany Ionathan","Sandy Marion", "Leonore Bittman"};
		IBook iBook = new IBook(isbn, authors);
		iBook.setTitle("The Swift Programming Language (Swift 2.2)");
		iBook.setPrice(0.00f);
		iBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.IBA);
		iBook.setRecommendedReader(IBook.iBooksReaders.APPIPAD);
		iBook.setPublisher("Apple");
		iBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2014);
		downloadLinks = new String[]{
				"https://itunes.apple.com/us/store?mt=11"
		};  
		iBook.setDownloadLinks(downloadLinks);
		eBook.setRemarksAndNotes(new String[] {"This is a great iBook!", "I recommend it!"});
		// Add eBook to the books
		books[2] = iBook;      

		//check the list of Books
		for(int index = 0; index <3;index++){
			System.out.println("Book title: "+books[index].getTitle());
			System.out.println("Book ISBN: "+books[index].getISBN());
			System.out.println("Book Publisher: "+books[index].getPublisher());
			String[] authorsOfThisBook = books[index].getAuthors();
			int numberOfAuthors = authorsOfThisBook.length;
			for(int currentAuthor=0;currentAuthor<numberOfAuthors;currentAuthor++)
			{
				System.out.println("Book author: "+ authorsOfThisBook[currentAuthor]);
			}
			//System.out.println("Book Authors: "+books[index].getAuthors()[0]);
			System.out.println("Book Price: "+books[index].getPrice());
			System.out.println("Book format: "+books[index].getElectronicFormat());
			System.out.println("Book year of publication: "+books[index].getYearOfPublication());
			//System.out.println("Book remarks and notes: "+books[index].getRemarksAndNotes()[0]);
			System.out.println("------------------------------------------------------------------");
		}


		//add evaluation ***************************************************************
		Evaluation e1 = new Evaluation(5, 011, "Enigma Otiliei");
		Evaluation e2 = new Evaluation(4, 021, "Micul lord Fauntleroy");
		Evaluation e3 = new Evaluation(6, 031, "Calugarul care si-a vandut ferrari-ul");

		//create hashmap
		HashMap<Evaluation, ElectronicBook> map = new HashMap<Evaluation, ElectronicBook>();
		map.put(e1, books[0]);
		map.put(e2, books[1]);
		map.put(e3, books[2]);

		// get the key, try1
		//Show added details with the use of the iterator
		for(HashMap.Entry<Evaluation, ElectronicBook> entry : map.entrySet()){
			System.out.println(entry.getKey());
		}
		
		//get the key, try2
		/*	for (Entry<Evaluation, ElectronicBook> entry : map.entrySet()) {
				    Evaluation key = entry.getKey();
				    Object value = entry.getValue();
				    System.out.println(entry.getKey());
				    // ...
				}*/

		System.out.println("------------------------------------------------------------------");

		//Exercise 2****************************************************************************

		//create TreeSet		
		TreeSet<ElectronicBook> set = new TreeSet<ElectronicBook>();
		//add electronic books to TreeSet
		set.addAll(Arrays.asList(books));

		//display the TreeSet Collection
		for(ElectronicBook eb : set) {
			System.out.println(eb.getTitle() + " - " +  eb.getPublisher() + " - " + eb.getISBN());
		}

		// create ascending iterator
		//Iterator iterator;
		//iterator = Arrays.asList(books).iterator();

		// displaying the Tree set data
		//System.out.println("Tree set data in ascending order: ");     
		//while (iterator.hasNext()){
		//	System.out.println(iterator.next() + " ");
		//}
		//End **********************************************************************************


	}

}



