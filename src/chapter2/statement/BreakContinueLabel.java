package chapter2.statement;

public class BreakContinueLabel {

	public static void main(String[] args) {
		/*
		for(int i=0; i<10; i++)
		{
			//if(i==5) break;  // break provoque la sortie de la boucle
			if(i==5) continue;  // continue provoque le passage directement à l'itération suivante
			System.out.println("i = "+i);
		}*/
		
		
      outer: for(int i = 0; i<10 ; i++)
		{
			for(int j =0; j<10; j++)
			{
				if(j==5) continue outer;
				System.out.println("(i,j)= ("+i+","+j+")");
			}
		}
		
		System.out.println("Suite du programme...");

	}

}
