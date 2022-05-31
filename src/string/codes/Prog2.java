package string.codes;

public class Prog2 {
	public static void main(String[] args) {
		//Strings are created either using string literal or new keyword
		//This program checks the equality of the values stored in the Strings
		String str1="Hello";
		
		/*When same values are assigned to two different reference variables created through string literal,
		 the value will only be declared once inside the String Constant Pool of the heap*/
		//Both the reference variables point to the same value in SCP
		String str2="Hello";
		
		//When string is created using new keyword, the value is stored in the heap
		//Since new keyword is used new object is created every time
		//And separate new objects holding similar values will be created 
		String str3=new String("Hello");
		
		//Checking if both the reference variables point to the value in same memory storage. 
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
	}

}
