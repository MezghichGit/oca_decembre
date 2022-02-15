package chapter5.LesInterfaces;

public interface Imprimante {

	public void imprimer(); //service
	
	public default void info()
	{
		System.out.println("Une imprimante");
	}
}
