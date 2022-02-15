package chapter5.LesClassesAbstraites;

public abstract class Animal {
	int age;
	String espece;
	
	
	
	public void manger()
	{
		System.out.println("J'ai faim, je veux manger");
	}
	
	public void domir()
	{
		System.out.println("Il est tard, je vais dormir");
	}
	
	public abstract void seDeplacer();
	
}
