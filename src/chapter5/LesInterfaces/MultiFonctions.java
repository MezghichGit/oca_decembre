package chapter5.LesInterfaces;

public class MultiFonctions implements Imprimante, Photocopieuse,Scanner {

	@Override
	public void scan() {
		System.out.println("Je fais un scan");
		
	}

	@Override
	public void photocopier() {
		System.out.println("Je fais une photocopie");
		
	}

	@Override
	public void imprimer() {
		System.out.println("Je fais un tirage");
		
	}
	
	@Override
	public  void info()
	{
		System.out.println("Une Multifonction");
	}

}
