package chapter5.LesClassesAbstraites;

public class TestAnimal {

	public static void main(String[] args) {
		Animal tab[] = new Animal[4];  // tab : tableau polymorphe (Polymorphisme générique)
		tab[0] = new Poisson();
		tab[1] = new Oiseau();
		tab[2] = new Chat();
		tab[3] = new Serpent();
		
		for(Animal a : tab)
		{
			a.seDeplacer();
		}

	}

}
