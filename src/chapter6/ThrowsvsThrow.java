package chapter6;

public class ThrowsvsThrow {

	public static void division(int a, int b) throws ArithmeticException, NullPointerException { //Unchecked Exception
		System.out.println(a / b);
	}
	
	public static void modulo(int a, int b) throws Exception{ // checked Exception
		//System.out.println(a % b);
		throw new Exception("Juste un test");  // throw permet de déclencher une exception
	}

	public static void main(String[] args) { // we declare
		/*try {
		modulo(10,2);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		//try {
		//division(10, 0);
		/*} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}

		catch (NullPointerException e) {
			e.printStackTrace();
		}*/

		//finally {
		System.out.println("Fin du programme");
		//}
	}

}
