package javaPart_1;

public class Lab_2 {

	// Single Line
	/*
	 * Multi Line Multi Line
	 */
	public static void main(String[] args) {
		bark();

		float float1 = 1.1f;
		Integer integer = 15;
		Double double1 = 5.64;
		Character character = '1';

		int integer2 = (int) float1;
		float f = integer;
//		float g = (Double) double1; //cant
		int i = character;
		System.out.println(integer2);
		System.out.println(f);
		System.out.println(i);

		final String hello = "Hello";
		System.out.println(hello);
		hello = "World";
		System.out.println(hello);
	}

	public static void bark() {
		String dogName = "dog";
		System.out.println("The Dog name = " + dogName + " brrark");
	}

}
