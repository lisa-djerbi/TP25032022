package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import emprunt.Adherent;
import emprunt.Bibliotheque;
import emprunt.Etudiant;
import emprunt.Exterieur;

class testBibliotheque {

	//question a
	@Test
	void testQuestionA() {
		Bibliotheque b = new Bibliotheque();
		b.enregistrerEtudiant(202202, "Dupont", "Informatique");
		b.enregistrerExterieur("Durant", "12 rue de Paris");
		assert(b.getNbAdherents() == 2);
	}

	//question b
	@Test
	void testQuestionB()
	{
		Adherent a = new Etudiant(202202, "Dupont", "Informatique");
		assertEquals("Etudiant", a.getType());
		
		a = new Exterieur("Durant", "12 rue de Paris");
		assertEquals("Exterieur", a.getType());
	}
	
	
	//question c
	@Test
	void testQuestionC()
	{
		Adherent a = new Etudiant(202202, "Dupont", "Informatique");
		assertEquals("Adherent 202202, nom : Dupont, emprunts : 0\n" + 
				"Etudiant du département Informatique", a.toString());
		
		a = new Exterieur("Durant", "12 rue de Paris");
		assertEquals("Adherent 3, nom : Durant, emprunts : 0\n" +
				"Exterieur habitant à l'adresse 12 rue de Paris", a.toString());
	}
}
