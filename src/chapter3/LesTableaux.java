package chapter3;

import java.util.Arrays;

public class LesTableaux {

	public static void main(String[] args) {
		/*
		int []tab = {10,2,14}; // déclaration +instaciation+ initialisation
		System.out.println(tab.length); // length : property
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[2]);*/
		/*
		int tab[] = new int[3]; // déclaration puis instanciation + initialisation par des zéros
		tab[0]=20;
		System.out.println(tab.length);
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[2]);*/
		
		//String names[] = new String[3];
		
		/*String names[] = {"Ali","Amine","Marwen","Riad"};
		System.out.println(names.length);
		System.out.println(names[0]);
		System.out.println(names);
		Planet p = new Planet();
		System.out.println(p);
		System.out.println(p.toString());
		Planet tabP[] = new Planet[3];
		System.out.println(tabP);*/
		/*
		int []tab = {10,2,14};
		for(int e : tab)
		{
			System.out.println(e);
		}
		
		Arrays.sort(tab);  // méthode de tri(par ordre ascendant)
		System.out.println("************");
		for(int e : tab)
		{
			System.out.println(e);
		}*/
		/*
		int [] tab [] =new int[3][];
		tab[0] = new int[2];
		tab[1] = new int[6];
		tab[2] = new int[4];
		tab[0][0]=10;
		tab[0][1]=12;*/
		/*int [] tab [] = {{1,8},{10,7,8},{1}};
		System.out.println(tab.length); //3
		System.out.println(tab[0].length); //2
		System.out.println(tab[1].length); //3 
		System.out.println(tab[2].length); //1*/
		int compteur = 0;
		int []tab = {10,2,14};
		for(int e : tab)
		{
			System.out.println(e);
			continue;
			//compteur++; // code unreachable
			
		}
		
		
	}

}
