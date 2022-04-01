package emprunt;

public class Etudiant extends Adherent {
	
	private String dptEtude;
	

	public Etudiant(int numAdh, String nom, String dptEtude) {
		super(numAdh, nom);
		this.dptEtude = dptEtude;
	}

	@Override
	public int getEmpruntsMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String toString ()
	{
		return super.toString() + "\n" +
					"Etudiant du département " + dptEtude;
	}
	
	public String getType()
	{
		return "Etudiant";
	}
}
