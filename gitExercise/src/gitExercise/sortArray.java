package gitExercise;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		int [] numArray = {6, 4, 89, 14, 63, 20, 27, 99, 1, 55, 70};
		int [] sortedNum = {1, 4, 6, 14, 20, 27, 55, 63, 70, 89, 99};
		int [] newArray = new int[11];
		String [] fruits = {"grapes", "apples", "pears", "bananas", "oranges", "kiwi"};
		String [] sortedFruits = {"apples", "bananas", "grapes", "kiwi", "oranges", "pears"};
		int temp;
		for(int i = 1; i < numArray.length; i++) {
			for (int j = i; j > 0; j--) {
				if (numArray[j] < numArray[j - 1]) {
					temp = numArray[j];
					numArray[j] = numArray[j - 1];
					numArray[j - 1] = temp;
				}
			}
		}
		for(int i = 0; i < numArray.length; i++) {
			newArray[i] = numArray[i];
		}
		
		//@Test
		if(Arrays.equals(newArray, sortedNum)) {
			System.out.println(Arrays.toString(newArray));
			System.out.println("The array is sorted in ascending order");
		}
		else {
			System.out.println("The array is not sorted");
		}
		
		Arrays.sort(fruits);
		
		//@Test
		if(Arrays.equals(fruits, sortedFruits)) {
			System.out.println(Arrays.toString(fruits));
			System.out.println("The array is sorted in ascending order");
		}
		else {
			System.out.println("The array is not sorted");
		}
	}
}
