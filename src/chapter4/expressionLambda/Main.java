package chapter4.expressionLambda;

public class Main {

	public static void main(String[] args) {
		Prediction p = (String s)->{return s.length()<4;};  // c'est une expression lambda verbose qui implemente la m�thode test

		System.out.println(p.test("ocaocp"));
		
		Prediction p2 =  s-> s.contains("oc"); // expression lambda r�duite
		System.out.println(p2.test("abc"));
	}

}
