package string.methods.codes;

public class Prog2 {
	public static void main(String[] args) {
		//replace() method using with strings
		
		//replace() method can be used in 2 ways
		//It can be used to replace a particular character in the original string with another character
		//It can also be used to replace a substring with another preferred substring
		
		String string1="This is going nowhere";
		System.out.println(string1.replace('i', 'a'));
		System.out.println(string1.replace("going nowhere", "taking somewhere"));
	 }

}
