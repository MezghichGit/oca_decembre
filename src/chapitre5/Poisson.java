package chapitre5;

public class Poisson extends Animal{
	
	double pMax;
	
	public void info()
	{
		super.info(); //appel � la m�thode info de la classe m�re
		System.out.println("Profondeur Maximale : "+ this.pMax);
	}
	
	public Poisson() // Constructeur par d�faut de Poisson
	{
		//super(); // invokation du constructeur sans param�tres
		super(2,"Dorade"); // invokation du constructeur avec param�tres
		System.out.println("Constructeur par d�faut de Poisson");
	}
	
	public Poisson(int age, String espece, int pMax) // constructeur avec trois param�tres
	{
		super(age, espece); // doit �tre toujour la premi�re instruction
		this.pMax = pMax;
	}

}
