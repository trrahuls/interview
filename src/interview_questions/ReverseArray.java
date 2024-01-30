package interview_questions;

public class ReverseArray {

	public static void reverse(int[] array) {
		int start = 0;
		int end = array.length - 1;

		while (start < end) {
			// Swap elements at start and end indices
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;

			// Move towards the center of the array
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int[] originalArray = {1, 2, 3, 4, 5};

		System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));

		reverse(originalArray);

		System.out.println("Reversed Array: " + java.util.Arrays.toString(originalArray));
	}



}
