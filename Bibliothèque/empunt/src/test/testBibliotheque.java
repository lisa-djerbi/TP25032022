package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import emprunt.Bibliotheque;

class testBibliotheque {

	//question a
	@Test
	void test() {
		Bibliotheque b = new Bibliotheque();
		b.enregistrerEtudiant(202202, "Dupont", "Informatique");
		b.enregistrerExterieur("Durant", "12 rue de Paris");
		assert(b.getNbAdherents() == 2);
	}

}
