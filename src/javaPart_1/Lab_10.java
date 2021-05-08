package javaPart_1;

public class Lab_10 {

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
			count++;
			if(count==2) {
				continue;
			}
			System.out.println(count);
		} while (count < 10);
	}
}
