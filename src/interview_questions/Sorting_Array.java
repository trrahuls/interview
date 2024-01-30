package interview_questions;

import java.util.Arrays;

// Sort array values

class Alpha
{
	void short_array_alpha()
	{
		String ar[]= {"a","o", "b"};
		Arrays.sort(ar);

		for (String i:ar)
		{
			System.out.println("Sorted alpha character is --->"+i);
		}
	}

}

class Number
{
	void short_array_number()
	{
		int[] num= {4,2,9,3};
		Arrays.sort(num);

		for (int i:num)
		{
			System.out.println("Sorted number is --->"+i);
		}
	}

}
public class Sorting_Array {

	public static void main(String[] args) {

		Alpha al =new Alpha();
		al.short_array_alpha();
		
		Number nu=new Number();
		nu.short_array_number();

	}

}
