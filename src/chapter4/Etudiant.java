package chapter4;

public class Etudiant {
	private int age;
	private String nom;
	private boolean etranger;

	public boolean isEtranger() {
		return etranger;
	}

	/*public void setEtranger(boolean etranger) {
		this.etranger = etranger;
	}*/

	public Etudiant() {

	}
	
	public Etudiant(String nom, int age) {
       this.nom = nom;
       this.age = age;
	}

	public int getAge() {
		return age;
	}
/*
	public void setAge(int age) {
		if((age>20) && (age<=30))
		   this.age = age;
		else
			System.out.println("Age invalide!");
	}*/

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
	
		this.nom = nom;
	}
	
	
}
