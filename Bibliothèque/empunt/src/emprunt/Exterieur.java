package emprunt;

public class Exterieur extends Adherent {
	private String adresse;
	
	private static int compteurAdhExt = 0;
	

	public Exterieur(String nom, String adresse) {
		super(++compteurAdhExt, nom);
		this.adresse = adresse;
	}

	@Override
	public int getEmpruntsMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String toString()
	{
		return super.toString() + "\n" 
				+ "Exterieur habitant à l'adresse " + adresse;
	}
	
	
	public String getType()
	{
		return "Exterieur";
	}
}
