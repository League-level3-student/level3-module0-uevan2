package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static <intArray> void main(String[] args) {
		//1. make an array of 5 Strings
			String[] nums = new String[5];
		//2. print the third element in the array
				System.out.println(nums[2]);
		//3. set the third element to a different value
				nums[2] = "words";
		//4. print the third element again
				System.out.println(nums[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
				for(int i = 0; i < nums.length; i++) {
					nums[i] = "wordsssss";
					System.out.println(nums[i]);
				}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
				
		//7. make an array of 50 integers
				int[] ints = new int[50];
				int smallest = 999999999;
				int largest = -999999999;
		//8. use a for loop to make every value of the integer array a random number
				Random r = new Random();
				for(int i = 0; i < ints.length; i++) {
					ints[i] = r.nextInt();
					if(smallest > ints[i]) {
						smallest = ints[i];
						System.out.println(smallest);
					}
					
					if(largest < ints[i]) {
						largest = ints[i];
						System.out.println(largest);
					}
				
					System.out.println(ints[i]);
				}
		//9. without printing the entire array, print only the smallest number on the array
				
		//10 print the entire array to see if step 8 was correct
				
		//11. print the largest number in the array.
		
		//12. print only the last element in the array
				System.out.println(ints[49]);
	}
}
