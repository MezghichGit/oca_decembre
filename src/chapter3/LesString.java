package chapter3;

public class LesString {

	public static void main(String[] args) {
		/*
		String ch = " somme";
		ch = 4+3+ch;
		//ch = ch + 4 +3;
		System.out.println(ch);*/
		/*
		String cours = "formation oca";
		
		String formation = cours.substring(10,12);
		System.out.println(formation);*/
		
		//System.out.println("abc".equals(("ABC").toLowerCase()));
		//System.out.println("aBc".equalsIgnoreCase("aBC"));
		
		/*
		String s1 = "Amine"; //Pool
		String s2 = new String("Amine"); //Heap
		String s3 = "Amine"; //Pool
		String s4 = "amine"; // Pool mais un autre emplacement
		String s5 = new String("Amine"); //Heap
		
		
		System.out.println(s2 == s5);*/
		
		/*
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);*/
		/*
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true
		
		String ch = "OCA";
		ch.concat("-OCP");*/
		//System.out.println(ch.concat("-OCP"));
		//ch = ch.concat("-OCP");
		/*
		System.out.println(ch);
		
		StringBuilder sb = new StringBuilder("OCA");
		sb.append("-OCP");
		System.out.println(sb);
		
		String name = "amine";
		name = name.toUpperCase();
		System.out.println(name);*/
		
		// Les StringBuilder
		/*
		StringBuilder sb = new StringBuilder(); // capacity initiale = 16
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("ocaocaocaocaocaocaocaocaocaocaocaocav");
		System.out.println(sb.length());
		System.out.println(sb.capacity());*/
		/*
		StringBuilder sb = new StringBuilder(8);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("ocaocaoczocaocaocza");
		System.out.println(sb.length());
		System.out.println(sb.capacity());*/
		String ch = "oca";
		StringBuilder sb = new StringBuilder(ch);

	}

}
