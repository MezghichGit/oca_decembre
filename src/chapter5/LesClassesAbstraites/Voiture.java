package chapter5.LesClassesAbstraites;

public abstract class Voiture {

	public void info() {  // une m�thode concrete
		System.out.println("M�thode infos");
	}
	
	public abstract void affichage();  // une m�thode abstraite
}
