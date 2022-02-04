package chapitre5;

// La classe m�re
public class Animal {
	
	int age; // visibilt� default(package-private)
	String espece; // visibilt� default(package-private)
	
	public void info()
	{
		System.out.println("Espece : " +this.espece +" Age : "+ this.age);
	}
	
	public Animal()  // Constructeur par d�faut de Animal
	{
		System.out.println("Constructeur par d�faut de Animal");
	}
	
	public Animal(int age, String espece)  // Constructeur avec param�tres
	{
		System.out.println("Constructeur avec param�tres Animal");
		this.espece = espece;
		this.age = age;
	}

}
