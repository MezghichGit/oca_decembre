package chapitre5;

public class Poisson extends Animal{
	
	double pMax;
	
	public void info()
	{
		super.info(); //appel à la méthode info de la classe mère
		System.out.println("Profondeur Maximale : "+ this.pMax);
	}
	
	public Poisson() // Constructeur par défaut de Poisson
	{
		//super(); // invokation du constructeur sans paramètres
		super(2,"Dorade"); // invokation du constructeur avec paramètres
		System.out.println("Constructeur par défaut de Poisson");
	}
	
	public Poisson(int age, String espece, int pMax) // constructeur avec trois paramètres
	{
		super(age, espece); // doit être toujour la première instruction
		this.pMax = pMax;
	}

}
