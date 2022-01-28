package chapter4;

public class SurchargeDeMethodes {

	public static void somme(int a, int b) {
		System.out.println("int a, int b");
	}

	public static void somme(double a, double b) {
		System.out.println("double a, double b");
	}

	public static void somme(long a, long b) {
		System.out.println("long a, long b");
	}

	public static void somme(Integer a, Integer b) {
		System.out.println("Integer a, Integer b");
	}

	public static void somme(short a, short b) {
		System.out.println("short a, short b");
	}

	public static void somme(int... x) {
		System.out.println("int ...x");
	}

	public static void main(String[] args) {
		somme(10, 20);

	}

}
