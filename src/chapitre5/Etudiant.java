package chapitre5;

import java.io.IOException;

public class Etudiant extends Personne{

	//le constructeur par d�faut de la classe fille appel le contructeur par d�faut de la classe m�re
	
	int numInscription;
	
	
	public Etudiant()
	{
		super(null,0); // appel explicite au constructeur parent avec deux param�tres
	}
	
	@Override  // best
	public Personne info()  throws IOException
	{
		System.out.println("Je suis une personne mais aussi un(e) �tudiant(e)!");
		//super.info();
		//return new Personne();
		return new Etudiant();
		
	}
	
	public void affichage()
	{
		
	}
}
