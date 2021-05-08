package javaPart_1;

public class Lab_9 {

	// Single Line
	/*
	 * Multi Line Multi Line
	 */
	public static void main(String[] args) {
		one();
	}
	
	public static void one() {
		int count = 0;
		do {
			if(count ==11) {
				System.out.println(count);
				continue;
			}
			count++;
		} while (count <= 20);
	}
}
