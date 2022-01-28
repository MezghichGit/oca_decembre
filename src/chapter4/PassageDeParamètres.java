package chapter4;

public class PassageDeParam�tres {

	
	// premier exemple : concerne les 8 types primitifs
	/*public static void permut(int a, int b)
	{
		int aux;
		
		aux = a;
		a = b;
		b = aux;
	}*/
	
	// deuxi�me exemple avec les types refer�nces(mutables : Exemple StringBuilder)
	/*
	public static void modifStringBuilder(StringBuilder sb)
	{
		sb.append("-ocp");
	}*/
	
	// troixi�me exemple : type reference immutable
	public static void modifString(String ch)
	{
		//ch = ch.concat("-ocp");
		ch.concat("-ocp"); // ===>oca-ocp
	}
	
	public static void modifInteger(Integer x)
	{
		x = 10;
		
	}
	
	public static void modifAnimal(Animal a)
	{
		a.nom = "Sam";
		
	}
	
	
	public static void main(String[] args) {
		
		Animal e = new Animal();
		e.nom="toto";
		modifAnimal(e);
		System.out.println(e.nom);
		// quatrieme exemple
		/*Integer a = 20;
		modifInteger(a);*/
		//System.out.println(a);
		// troixi�me exemple
		/*String s = "oca";
		modifString(s); // passage de param�tre par valeur
		System.out.println(s);*/
		// deuxi�me exemple
		/*
		StringBuilder s = new StringBuilder("oca");
		modifStringBuilder(s); // param�tre formel sb va prendre une copie de s
		System.out.println("s = "+s);*/
		
		// premier exemple
		/*
		int x = 10;
		int y = 20;
		permut(x,y);
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
	}

}
