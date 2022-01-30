package chapter4.expressionLambda;

@FunctionalInterface
public interface Prediction {
	
	// une m�thode abstraite
	public boolean test(String ch);
	
	public default void info() {  // m�thode concrete
		System.out.println("Info");
	}  
	
	public static void affichage() {  // m�thode concrete
		
	}

}
