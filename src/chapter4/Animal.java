package chapter4;

public class Animal {

	public String nom; // il est visible partout
	
	private int age;  // il est visible uniquement dans la classe
	
	
	String espece; // cet attribut est visible seulement dans le package(default ou bien package-private)
	
	protected String pays;
	public void info()
	{
		System.out.println(this.nom+" "+this.age +" "+this.espece);
	}
	
	public Animal() {
		this(10);
		System.out.println("Constructeur par defaut");
	}
	
	public Animal(String nom) {
		this();
		System.out.println("Constructeur avec param nom");
		
	}
	
	public Animal(int age) {
		//this("Chat");
		System.out.println("Constructeur avec param age");
	}
}
