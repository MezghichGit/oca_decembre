package chapter4.expressionLambda;

import java.util.function.Predicate;

public class MainPredicate {

	public static void main(String[] args) {
		Predicate <String> p1 = (String s)->{return s.length()==10;};
		
		System.out.println(p1.test("abcabcabcd"));

	}

}
