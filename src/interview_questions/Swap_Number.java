package interview_questions;


// Swap number without using third variable

public class Swap_Number {

	public static void main(String[] args) {
		
		int num1=100;
		int num2=200;
		
		System.out.println("Before swapping num1 is ---->"+num1);
		System.out.println("Before swapping num2 is ---->"+num2);
		
		
		num2=num2-num1;   //100
		num1=num1+num2;   //200
		
		System.out.println("After swapping num1 is ---->"+num1);
		System.out.println("After swapping num2 is ---->"+num2);

	}

}
