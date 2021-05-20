package gitExercise;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		int [] numArray = {6, 4, 89, 14, 63, 20, 27, 99, 1, 55, 70};
		String [] fruits = {"grapes", "apples", "pears", "bananas", "oranges", "kiwi"};
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
			System.out.println(numArray[i]);
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
