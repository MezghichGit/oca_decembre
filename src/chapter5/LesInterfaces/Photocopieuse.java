package chapter5.LesInterfaces;

public interface Photocopieuse {
	public void photocopier();
	
	public default void info()
	{
		System.out.println("Une photocopieuse");
	}
}
