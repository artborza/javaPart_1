package javaPart_1;

import java.util.Scanner;

public class Lab_7 {

	public static void main(String[] args) {
		one();
		two();
	}

	public static void one() {
		int count = 20;
		do {
			System.out.println(count);
			count--;
		} while (count >= 0);
	}
	public static void two() {
		for(int i=0;i<=1;i+=0) {
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter number");
		    String name = myObj.nextLine();
		    if(Integer.parseInt(name)%2 !=0) {
		    	System.out.println("เลขคี่");
		    	break;
		    }else {
		    	System.out.println("เลขคู่");
		    }
		}
	}
}
