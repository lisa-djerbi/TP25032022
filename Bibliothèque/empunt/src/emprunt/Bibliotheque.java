package emprunt;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	private String nom;
	private List<Adherent> adherents;
	
	public Bibliotheque()
	{
		nom = "Bibliothèque universtaire";
		adherents = new ArrayList<Adherent>();
	}


	public void enregistrerEtudiant(int numAdh, String nom, String dptEtude)
	{

		adherents.add(new Etudiant(numAdh, nom, dptEtude));
	}
	
	public void enregistrerExterieur(String nom, String adresse)
	{

		adherents.add(new Exterieur(nom, adresse));
	}
	
	public int getNbAdherents()
	{
		return adherents.size();
	}
	
	public void afficherAdherents()
	{
		for (Adherent a : adherents)
			System.out.println(a);
	}
	
	public Adherent rechercherAdherent(int numAdh) throws AdherentNotFoundException
	{
		for (Adherent a : adherents)
		{
			int n = a.getNumero();
			if(n == numAdh)
				return a;
		}
		throw new AdherentNotFoundException();
		
	}

}
