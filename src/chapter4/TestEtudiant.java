package chapter4;

public class TestEtudiant {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant("Ahmed",22);
		//e1.age = 23;
		System.out.println(e1.getAge());
		//e1.setAge(-23);
		System.out.println(e1.getAge());

	}

}
