package gitExercise;

public class sortArray {

	public static void main(String[] args) {
		int [] numArray = {6, 4, 89, 14, 63, 20, 27, 99, 1, 55, 70};
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
	}
}
