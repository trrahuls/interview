package interview_questions;

// Array length

class ArLengthNumber
{
	void array_length_number()
	{
		int[] ar= {2,3,4,5};
		int a=ar.length;
		System.out.println("Array length for integer is "+a);

	}
}
class ArLengthChar
{
	void array_length_number()
	{
		String[] ar= {"a","b","c","d"};
		int a=ar.length;
		System.out.println("Array length for character is "+a);
	}
}

class ArRevOrd
{
	void array_rev_ord()
	{
		char[] charArray= {'a','b','c','d'};

		System.out.println("Original Array:");
		// Print the original array
		for (char ch : charArray) {
			System.out.print(ch + " ");
		}
		System.out.println("\nArray in Reverse Order:");
		// Print the array in reverse order
		for (int i = charArray.length - 1; i >= 0; i--) 
		{
			System.out.print(charArray[i] + " ");
		}
	}

}


	public class Array_Length {

		public static void main(String[] args) {

			/*ArLengthNumber aln= new ArLengthNumber();
		aln.array_length_number();

		ArLengthChar alc= new ArLengthChar();
		alc.array_length_number();*/

			ArRevOrd arr= new ArRevOrd();
			arr.array_rev_ord();
		}

	}
