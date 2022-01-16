package chapter2;

public class Main {

	enum Jour{LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE}
	public static void main(String[] args) {
		/*int y = 4;
		double x = 3 + 2 * --y; // 3 + 2 * 3
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		
		/*int x = (2+8)/4+2*(6+3);
		System.out.println("x = "+x);*/
		
		///Post and Pre -Unary Operator
		
		//int x = 4;
		//int y = ++x; //Pré-increment
		
		//int y = x++; //Post-increment
		
		//System.out.println("x = "+x);
		//System.out.println("y = "+y);
		
		//int u = 10;
		//int w = ++u; //11 11
		/*int w = u++;
		System.out.println("u = "+u);
	    System.out.println("w = "+w);*/
		
		//int x = 2 * 5 + 3 * 4 - 8;
		//System.out.println("x = "+x);
		/*
		int x =10;
		int y =2;
		int z = 2*++y + 4*x-- + 2*--y + 2*x - --y;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);*/
		
		/*boolean test = true;
		System.out.println(!test);*/
		//Ternary operator
		/*int y = 2;
		boolean x = (++y >2)?true:false;
		System.out.println(x);
		System.out.println(y);*/
		/*
		int x = 11;
		String res = (x <10)?"OK": "false";
		
		System.out.println((x >10)?100: false);*/
		/*int x = 5;
		System.out.println((x>2)?   (x>4)?(x <3)?9:10  :8    :7);*/
		
		/*int x = 10;
		int y =20;
		int z = 30;*/
		
		// AND on utilise && ; &
		// OR on utilise ||; |
		//boolean res = (x>y) && (++y<z);
		//boolean res = (x<y) & (++y<z);
		
		/*boolean res = (x<y) || (++y<z); // VRAI
		System.out.println(res);
		System.out.println("y= " + y);*/
		/*double x2 = 10 + 15.5;
		long h = 15;
		long k = 10+h;*/
		/*byte x = 127;  //Max du byte 127
		byte y = 2;
		int z = x+y; //Promotion to 32 bites*/
		/*
		short  x1 = 3;
		short  y1 = 2;
		double  z1 = x1+y1; //Promotion to 32 bites
		System.out.println(z1);
		
		double x = 39.21;
		float y = 2.1F;
		double z = x+y;*/
		
		/*short x = 10;
		short y = 3;
		short z = (short)(x * y); */
		/*
		byte x = (byte)400;
		System.out.println(x);*/
		/*
		int x = 10;
		int y=2;  // must be initialised
		y +=x;  // Compound assignment operator (Opérateur d'affectation Composé)
		 // y = y + x;
		y-=2;
		System.out.println(y);*/
		
		/*long x = 10;
		long y = 2*x;*/
		
		
		//y = (int)(y * x);  // solution avec cast explicite
		//y*=x;  // solution avec compound assignment operator
		/*
		int x =10;
		
		if(x<100)
			System.out.println("OK");
		else {
			System.out.println("Autre OK");
		    System.out.println("The end");
		}*/
		/*
		int x = 10;
		
		switch(x)
		{
		    
		   case 1 : case 12 : System.out.println("Vous avez taper 1 ou 12");break;	
		   case 10 : System.out.println("Vous avez taper 10"); break;
		   case 100 : System.out.println("Vous avez taper 100");break;
		   case 1000 : System.out.println("Vous avez taper 1000"); break;	
		   default : System.out.println("Autre valeur");
		   
		}*/
		
		
		Jour j =Jour.JEUDI;
		
		switch(j)
		{
		    
		   case LUNDI : System.out.println("Vous avez taper lundi");break;	
		   case MARDI : System.out.println("Vous avez taper mardi");break;
		   case JEUDI : System.out.println("Vous avez taper jeudi");break;	
		   default : System.out.println("Autre valeur");
		   
		}
		
		final int k = 10;
		//k = 11;
		
   }

}
