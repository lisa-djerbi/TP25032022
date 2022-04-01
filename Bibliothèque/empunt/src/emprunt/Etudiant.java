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

	
	public void afficher()
	{
		super.afficher();
		System.out.println("Etudiant du département " + dptEtude);
	}
}
