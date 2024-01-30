package interview_questions;

public class HighestValueFromArray {

	public static void main(String[] args) {
		int[] array = {10, 5, 8, 20, 15};

		// Find the highest value in the array
		int highestValue = findHighestValue(array);

		// Print the highest value
		System.out.println("The highest value in the array is: " + highestValue);
	}

	public static int findHighestValue(int[] array) {
		if (array.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int highest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > highest) {
				highest = array[i];
			}
		}

		return highest;

	}

}
