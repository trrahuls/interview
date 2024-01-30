package interview_questions;

// Print reverse string


class RevString
{
	void revStr()
	{
		String orignal= "I am Rahul";
		StringBuilder revString= new StringBuilder(orignal);
		revString.reverse();
		
		String reversedString= revString.toString();
		System.out.println("Original String ---->"+orignal);
		System.out.println("Reversed String ---->"+reversedString);
	}
}

class StringRev
{
	void strRev()
	{
		String orignal= "I am Rahul";
		
		char[] charArray= orignal.toCharArray();
		
		for (int i=0, j=charArray.length-1; i<j; i++, j--)
		{
			char temp = charArray[i];
			charArray[i]= charArray[j];
			charArray[j]= temp;
			
		}
		String revString= new String(charArray);
		
		System.out.println("Original string is : "+orignal);
		System.out.println("Reversed string is : "+revString);
	}
}


public class Reverse_String {

	public static void main(String[] args) {
		
	//	RevString rs=new RevString();
	//	rs.revStr();
		
		StringRev sr= new StringRev();
		sr.strRev();
	}

}
