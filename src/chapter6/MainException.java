package chapter6;

public class MainException {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int tab[]= {10,20,30};
		
		String formation =null;
		try {
			System.out.println(tab[4]); //Exception
		    //System.out.println(formation.length());  //Exception
		}
		
		catch(NullPointerException e)  // exception sp�cifique
		{
			System.out.println("Chaine null");
			e.printStackTrace();
		}
		catch(Exception e)  // exception m�re
		{
			System.out.println("Un probl�me");
			e.printStackTrace();
			return;
		}
		
		
		
		
		
		/*
		try {
		  System.out.println(x/y);
		
		}
		catch(ArithmeticException e)
		{
			//System.out.println("Tu as fais une division par z�ro, c'est interdit");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			  System.out.println(tab[3]);
			
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				//System.out.println("Tu as fais une division par z�ro, c'est interdit");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		*/
		finally {
		   System.out.println("Suite du programme");
		}

	}

}
