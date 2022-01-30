package chapter4.immutable;

import java.util.ArrayList;

public class MainPersonne {

	public static void main(String[] args) {
		ArrayList<String> foods = new ArrayList<>();
		foods.add("Pizza");
		foods.add("Makloub");
		foods.add("Chawarma");
		System.out.println(foods);
		
		ArrayList<String> plats = new ArrayList(foods);
		System.out.println(plats);
		plats.set(0, "Couscous");
		System.out.println(foods);
		System.out.println(plats);
		
		
		/*Personne p = new Personne("Amine",22,foods);
		foods.clear();
		System.out.println(p.getRepas());*/
		/*ArrayList<String> s = p.getRepas();
		s.clear();
		System.out.println(p.getRepas());*/
	
	}

}
