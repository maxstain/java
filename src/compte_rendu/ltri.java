package compte_rendu;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public interface ltri {
	public static Vector<Personne> trieNom(){
		Comparator<Personne> comp = Collections.reverseOrder();  
		Collections.sort(test.personne,comp);
		return test.personne;
	}
}
