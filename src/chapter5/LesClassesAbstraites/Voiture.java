package chapter5.LesClassesAbstraites;

public abstract class Voiture {

	public void info() {  // une méthode concrete
		System.out.println("Méthode infos");
	}
	
	public abstract void affichage();  // une méthode abstraite
}
