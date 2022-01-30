package chapter4.expressionLambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class LaMethodeRemoveIf {

	public static void main(String[] args) {
		/*
		Predicate<String> p = (String s)-> {return s.length()<=2;};
		
		ArrayList<String> names = new ArrayList<>();
		names.add("amine");
		names.add("ahmed");
		names.add("moez");
		names.add("kamel");
		names.add("a");
		names.add("ab");
		names.add("Haithem");
		System.out.println(names);
		names.removeIf(p);
		System.out.println(names);*/
		
		for(int i = 0; i<10; i++)
		{
			for(int j = 0; j<2;j++) {System.out.println("jj");}
			System.out.println("ii");
		}

	}

}
