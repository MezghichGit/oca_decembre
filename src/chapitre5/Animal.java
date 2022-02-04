package chapitre5;

// La classe mère
public class Animal {
	
	int age; // visibilté default(package-private)
	String espece; // visibilté default(package-private)
	
	public void info()
	{
		System.out.println("Espece : " +this.espece +" Age : "+ this.age);
	}
	
	public Animal()  // Constructeur par défaut de Animal
	{
		System.out.println("Constructeur par défaut de Animal");
	}
	
	public Animal(int age, String espece)  // Constructeur avec paramètres
	{
		System.out.println("Constructeur avec paramètres Animal");
		this.espece = espece;
		this.age = age;
	}

}
