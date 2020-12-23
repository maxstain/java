package compte_rendu;

public class Personne {
	private int cin;
	private String nom;
	private String prenom;
	private String ville;

	public Personne(int cin, String nom, String prenom, String ville) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.cin == ((Personne)obj).getCin();
    }
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
