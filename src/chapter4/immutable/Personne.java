package chapter4.immutable;

import java.util.ArrayList;

public final class Personne {
	
	private final int age;
	private final String name;
	private final ArrayList<String> repas;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public ArrayList<String> getRepas() {
		return new ArrayList(repas);
	}
	
	public Personne(String name, int age, ArrayList<String> l)
	{
		this.name = name;
		this.age = age;
		this.repas =new ArrayList(l);
	}


}
