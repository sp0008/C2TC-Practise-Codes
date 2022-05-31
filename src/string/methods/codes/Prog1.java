package string.methods.codes;

public class Prog1 {
	public static void main(String[] args) {
		
		//String declared using string literal
		String str="Hardik Pandya";
		//substring() method aapplied on String
		//A single index in parameter/argument passed shows "start index"
		//Prints the substring sequence from the given start index till last index of original string
		System.out.println(str.substring(7));
		//Substring with two indices, in which first is the start index and the next is the last index
		//Prints the substring sequnce with characters from the given start index to last index
		System.out.println(str.substring(0,7));
	
	}
}
