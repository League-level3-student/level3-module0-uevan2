package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
		public static void main(String[] args) {
			String[] sArray = new String[5];
			sArray[0] = "a";
			sArray[1] = "b";
			sArray[2] = "c";
			sArray[3] = "d";
			sArray[4] = "e";
		
			arrayPrinter(sArray);
			arrayPrinter2(sArray);
			arrayPrinter3(sArray);
			arrayPrinterRandom(sArray);
		}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	static void arrayPrinter(String[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	
//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void arrayPrinter3(String[] s) {
		for(int i = s.length-1; i >= 0; i--) {
			System.out.println(s[i]);
		}
	}
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
		static void arrayPrinter2(String[] s) {
			for(int i = 0; i < s.length; i=i+2) {
				System.out.println(s[i]);
			}
		}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void arrayPrinterRandom(String[] s) {
		
		Random r = new Random();
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[r.nextInt(s.length)]);
		}
		
	}
	
}
