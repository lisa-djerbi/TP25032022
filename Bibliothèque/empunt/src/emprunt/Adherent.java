package emprunt;

public abstract class Adherent {

	private int numAdh;
	private String nom;
	private int nbEmprunts;
	
	
	public Adherent(int numAdh, String nom)
	{
		this.numAdh = numAdh;
		this.nom = nom;
		this.nbEmprunts = 0;
	}

	public void emprunt()
	{
		
	}
	
	
	public void retour()
	{
		
	}
	
	public abstract int getEmpruntsMax();
	
	
	public void afficher()
	{
		System.out.println("Adherent " + numAdh + ", nom : "+ nom+ ", emprunts : " + nbEmprunts);
	}
	
}
