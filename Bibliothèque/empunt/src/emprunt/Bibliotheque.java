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


	public static void main(String[] args) {
		
	}

}
