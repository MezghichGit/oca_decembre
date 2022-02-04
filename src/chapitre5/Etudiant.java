package chapitre5;

import java.io.IOException;

public class Etudiant extends Personne{

	//le constructeur par défaut de la classe fille appel le contructeur par défaut de la classe mère
	
	int numInscription;
	
	
	public Etudiant()
	{
		super(null,0); // appel explicite au constructeur parent avec deux paramètres
	}
	
	@Override  // best
	public Personne info()  throws IOException
	{
		System.out.println("Je suis une personne mais aussi un(e) étudiant(e)!");
		//super.info();
		//return new Personne();
		return new Etudiant();
		
	}
	
	public void affichage()
	{
		
	}
}
