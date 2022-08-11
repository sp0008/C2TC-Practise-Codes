package string.methods.codes;

public class Prog3 {
	public static void main(String[] args) {
		//contains() method is used to check if a string contains a particular substring or not
		//The compiler checks and returns boolean values
		//returns true if the substring exists else false
		
		String strr="Did you hear me?";
		System.out.println(strr.contains("you hear us"));
		System.out.println(strr.contains("you hear me"));
		System.out.println(strr.contains("you"));
		System.out.println(strr.contains("y"));
		System.out.println(strr.contains("z"));
		System.out.println(strr.contains("zoya"));
		System.out.println(strr.contains("hear us"));
	} 

}
