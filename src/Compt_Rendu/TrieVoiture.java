package compte_rendu;

public class TrieVoiture implements ltri {
	
	private Voiture[] voitures; 
	public TrieVoiture(Voiture[] voitures) {
		this.setVoitures(voitures);
	}

	@Override
	public void trier() {

		Voiture testPersonne ;
		int tailleTab = voitures.length;
		for(int i = 0; i < tailleTab; i++) {
			for(int j = 1; j < (tailleTab - i); j++) {
				if(voitures[j-1].kilometrage > voitures[j].kilometrage ) {
					//echanges des elements
					testPersonne = voitures[j-1];
					voitures[j-1] = voitures[j];
					voitures[j] = testPersonne;
				}
			}	
		}
	

	}

	public Voiture[] getVoitures() {
		return voitures;
	}

	public void setVoitures(Voiture[] voitures) {
		this.voitures = voitures;
	}

}
