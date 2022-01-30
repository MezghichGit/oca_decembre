package chapter4.expressionLambda;

public class MainCalculatrice {

	public static void main(String[] args) {
		Calculatrice c1 = (a,b)-> a+b; // expression lambda réduite
		Calculatrice c2 = (int a, int b)-> {return a*b;}; // expression lambda verbose
		Calculatrice c3 = (a, b)-> {return a/b;};
		
		System.out.println(c1.operation(10, 2));
		System.out.println(c2.operation(10, 2));
		System.out.println(c3.operation(10, 2));

	}

}
