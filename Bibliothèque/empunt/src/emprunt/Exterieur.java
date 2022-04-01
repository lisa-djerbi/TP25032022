package emprunt;

public class Exterieur extends Adherent {
	private String adresse;
	
	private static int compteurAdhExt = 0;
	

	public Exterieur(String nom, String adresse) {
		super(compteurAdhExt++, nom);
		this.adresse = adresse;
	}

	@Override
	public int getEmpruntsMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public void afficher()
	{
		super.afficher();
		System.out.println("Exterieur habitant à l'adrsse " + adresse);
	}
}
