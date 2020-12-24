package compte_rendu;

import java.util.Vector;

public class TriePersonne implements ltri {
	//Attribut
	
	public TriePersonne(Vector<Personne> vector) {
		
	}

	@Override
	public void trier() {
		Personne testPersonne ;
		int tailleTab = test.personne.size();
		for(int i = 0; i < tailleTab ; i++) {
			for(int j = 1; j < (tailleTab - i); j++) {
				if(test.personne.elementAt(j-1).getCin() > test.personne.elementAt(j).getCin() ) {
					//echanges des elements
					testPersonne = test.personne.elementAt(j-1);
					test.personne.set(j-1, test.personne.elementAt(j));
					test.personne.set(j, testPersonne);
				}
			}	
		}
	}

}
