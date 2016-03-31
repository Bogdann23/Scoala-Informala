package ooParadigm;

/**
 * @author Bogdan
 */
public class Program {

	public static void main(String[] args) {
		
		System.out.println("***Corporatist***");
		Corporatist corp1 = new Corporatist();
		
		//apelez metodele implementate cu ajutorul interfetelor
		corp1.studiaza();
		corp1.petrece();
		corp1.munceste();
		
		//creez un obiect din superclasa Persoana, 
		Persoana per = new Corporatist();
		
		
		//apelez metoda mostenita de corporatist de la clasa Persoana
		corp1.profesie(); 
		
		System.out.println();
		System.out.println("***Freelancer***");
		Freelancer free = new Freelancer();
		free.munceste();
		
	}

}
