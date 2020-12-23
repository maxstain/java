package compte_rendu;
import compte_rendu.ltri;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class test {

	public static Vector<Personne> personne = new Vector<Personne>();
	public static Vector<Voiture> voiture = new Vector<Voiture>();
	public static  boolean exist(Personne p) {
		Iterator<Personne> x = personne.iterator();
		while(x.hasNext()) 
			if(x.next().getCin() == p.getCin()) 
				return true;
		return false; 
	}
	
	
	public static void showItem(Vector<Personne> p) {
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i).getNom());
		}
	}
	public static void main(String[] args) {
		boolean  insert = true;
		while(insert) {
			Scanner x = new Scanner(System.in);
			System.out.println("Donner le cin: ");
			int cin = x.nextInt();
			System.out.println("Donner le nom: ");
			String nom = x.next();
			System.out.println("Donner le prenom: ");
			String prenom = x.next();
			System.out.println("Donner la ville de destination: ");
			String ville = x.next();
			Personne p = new Personne(cin, nom, prenom, ville);
			if(!exist(p)) 
					personne.add(p);
			else System.err.println("Problème de construction fiche personne, violation identifiant unique");

			System.out.println("Vouler Vous Ajouter un autre Personne");
			String rep = x.next().toLowerCase();
			if(!rep.equalsIgnoreCase("o"))
				insert = false;
		}
		System.out.println("Avant Le trie");
		showItem(personne);
		System.out.println("#####################");
		System.out.println("Apres");
		ltri.trieNom();
		showItem(personne);
	}
}
