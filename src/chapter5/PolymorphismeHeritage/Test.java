package chapter5.PolymorphismeHeritage;

public class Test {
	
	public static void info(Animal a)  // méthode polymorphe (polymorphisme générique)
	{}

	public static void main(String[] args) {
		
		info(new Poisson());
		
		info(new Oiseau());
		
		info(new Animal());
		
		
		Animal a = new Animal();
		Poisson p = new Poisson();
		
		//a = p;   //UpCasting OK
		
		
		Poisson p2 = new Poisson();
		
		a = p2;  //UpCasting
		
		p =  (Poisson)a;     //DownCasting KO
		
		System.out.println("Fin du programme");

	}

}
