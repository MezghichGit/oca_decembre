package chapter4.expressionLambda;

@FunctionalInterface
public interface Prediction {
	
	// une méthode abstraite
	public boolean test(String ch);
	
	public default void info() {  // méthode concrete
		System.out.println("Info");
	}  
	
	public static void affichage() {  // méthode concrete
		
	}

}
