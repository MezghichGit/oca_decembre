package chapitre5;

public class TestMain {

	public static void main(String[] args) {
		
		//Poisson p = new Poisson(); // appel au constructeur par défaut de Poisson
		
		//p.info();
		
		//Animal a = new Animal(); // appel au constructeur par défaut de Animal
		
		Poisson p = new Poisson(1,"Balène",300);
		p.info();

	}

}
