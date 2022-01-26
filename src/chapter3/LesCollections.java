package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LesCollections {

	public static void main(String[] args) {
		/*
		ArrayList<String> l = new ArrayList<>();
		System.out.println(l.isEmpty());
		System.out.println(l.size()); // size() : méthode
		l.add("10");
		l.add("15");
		l.add("23");
		l.add("oca");
		l.add("true");
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println(l);
		l.remove("oca");
		System.out.println(l);
		System.out.println(l.contains("23"));*/
		/*
		ArrayList<Integer> tab = new ArrayList<>();
		tab.add(10);
		tab.add(1);
		tab.add(12);
		tab.add(10);
		System.out.println(tab);
		//tab.remove(new Integer(10));
		System.out.println(tab);
		Planet p = new Planet();
		System.out.println(p);
		System.out.println(tab.get(2));
		System.out.println(tab.set(0,40));
		System.out.println(tab);
		
		LinkedList<String> l = new LinkedList<>();
		l.add("oca");
		l.add("ocp");
		l.add("Spring Boot");
		System.out.println(l);*/
		/*
		List<Integer> tab = new ArrayList<>();
		List<Integer> tab2 = new LinkedList<>();
		tab2.add(10);
		tab.add(10);*/
		
		//List<Integer> l = new ArrayList<>();
		//ArrayList<Integer> la = new ArrayList<>();
		
		/// Conversion d'une liste vers tableau
		/*
		List<String> list = new ArrayList<>();
		list.add("hawk"); 
		list.add("robin");
		System.out.println(list);
		String[] objectArray = (String[])list.toArray();
		System.out.println(objectArray.length); 
		System.out.println(objectArray[0]);
		System.out.println(objectArray[1]);
		*/
		
		/// Conversion de tableau vers list
		/*
		String[] array = {"hawk","robin"}; // length = 2
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		//list.add("toto");
		//list.remove(0);
		list.set(0, "toto");
		System.out.println(list);
		System.out.println(array[0]);*/
		
		// Boxing ou Autoboxing : Conversion d'un type primitif en type référence(Wrapper Classes)
		List<Double> weights = new ArrayList<>();
		weights.add(50.5); // Autoboxing ou Boxing
		weights.add(new Double(15.5));
		
		// Unboxing : conversion d'un type référence en un type primitif
		double first = weights.get(0); // Unboxing
		List<String> names = new ArrayList<>();
		names.add("amine");
		int l = names.get(0).length();
		System.out.println(l);
		

	}

}
