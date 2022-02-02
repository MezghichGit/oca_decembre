package chapter6;

public class Main {

	public static void getNombre(int n) throws IllegalArgumentException //Unchecked Exception
	{
		if(n>0)System.out.println("Ok nombre valide");
		else
		{
			throw new IllegalArgumentException("Nombre invalide");
		}
	}
	public static void main(String[] args) {
		try {
		getNombre(-10);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Problème : "+e.getMessage());
		}
		
		System.out.println("Suite du programme");

	}

}
