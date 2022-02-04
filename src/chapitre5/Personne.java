package chapitre5;

public class Personne {

	String nom;
	int age;
	
	Personne info()  throws Exception
	{
		System.out.println("Je suis une personne!");
		return new Personne();
	}
	
	public Personne(String nom, int age)
	{
		
	}
	
	public Personne()
	{
		
	}
}
