package ooParadigm;

/**
 * @author Bogdan
 */

//subclasa Corporatist mosteneste superclasa Persoana si implementeaza interfetele

public class Corporatist extends Persoana implements Angajat, Student {

	//folosim cele trei metode din interfete ca sablon
	@Override 
	public void studiaza() {
		System.out.println("Studiez implementarea procedurii");
		
	}

	@Override
	public void petrece() {
		System.out.println("Petrec mult timp la serviciu");
		
	}

	@Override
	public void munceste() {
		System.out.println("Muncesc");
		
	}
	
}