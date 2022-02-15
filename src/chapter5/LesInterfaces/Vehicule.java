package chapter5.LesInterfaces;

public abstract interface Vehicule {
	
	public static final int VITESSE_MAX = 400;
	
	public void info();
	
	public abstract void affichage();
	
	// A partir de la version 8
	
	public default void acceler() {
		System.out.println("Je suis une méthode concrete default");
	}
	public static void sarreter() {
		System.out.println("Je suis une méthode concrete static");
	}

}
