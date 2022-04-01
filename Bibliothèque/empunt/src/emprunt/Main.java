package emprunt;

public class Main {

	public static void main(String[] args) {
		Bibliotheque b = new Bibliotheque();
		b.enregistrerEtudiant(202202, "Dupont", "Informatique");
		b.enregistrerExterieur("Durant", "12 rue de Paris");
		
		b.afficherAdherents();

	}

}
