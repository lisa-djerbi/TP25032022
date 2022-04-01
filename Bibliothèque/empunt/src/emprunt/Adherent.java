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
	
	
	public String toString ()
	{
		return "Adherent " + numAdh + ", nom : "+ nom+ ", emprunts : " + nbEmprunts;
	}
	
	public abstract String getType();

	public int getNumero() {
		
		return numAdh;
	}
	
	
}
