package chapter2.statement;

public class Main {

	public static void main(String[] args) {
		//int a; long b;
		//for (;;) {
			//System.out.println("Hello World");
		//}
		
		
		/*for(int y=0, x = 4; x < 5 && y < 10; x++, y++) { 
			// DOES NOT COMPILE
			//System.out.print(x + " ");}
		}*/
		
		/*for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) 
		{
			System.out.print(y + " ");
		}*/
		//System.out.print(x + " ");
		/*
		String names[] = new String[4];
		names[0]="amine";
		names[1]="asma";
		names[2]="mohamed";
		names[3]="ali";
		System.out.println("The classic Loop");
		for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		System.out.println("The enhanced Loop");
		
		for(String name : names)  // a : variable de parcours
		{
			System.out.println(name);
		}*/
		
		int[][] notes = new int[3][];
		notes[0] = new int[4];
			notes[0][0]=10;
			notes[0][1]=11;
			notes[0][2]=12;
			notes[0][3]=13;
		//notes[1] = new int[2];
	    notes[1] = new int[]{20,21};
		//notes[2] = new int[3];
	    notes[2] = new int[]{30,31,32};
	    
	    for(int tab[] : notes)
	    {
	    	for(int e : tab)
	    	{
	    		System.out.println(e+"\t");
	    	}
	    	System.out.println("------------------------");
	    }
	}
}
