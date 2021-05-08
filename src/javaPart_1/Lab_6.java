package javaPart_1;

public class Lab_6 {

	// Single Line
	/*
	 * Multi Line Multi Line
	 */
	public static void main(String[] args) {
		Integer count =0;
		
		while(count <= 10) {
			count++;
			System.out.println(count);
		}
		two();
		three();
		four();
	}
	
	public static void two() {
		int totalValue =0;
		for(int i=1;i<=10;i++) {
			totalValue +=i;
		}
		System.out.println("totalValue:"+totalValue);
	}
	
	public static void three() {
		int totalValue =0;
		for(int i=1;i<=100;i++) {
			if(i%12==0) {
				totalValue +=i;
			}
		}
		System.out.println("totalValue:"+totalValue);
	}
	
	public static void four() {
		int array[] = {1,2,3,4,5};
		for(int count:array) {
			System.out.println("count:"+count);
		}

	}

}
