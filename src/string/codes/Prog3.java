package string.codes;

public class Prog3 {
	public static void main(String[] args) {
		//Two Strings created using String literal
		String str1="Sai Priya";
		String str2="Sai Priya";
		//Two Strings created using new keyword
		String str3=new String("Sai Priya");
		String str4=new String("Sai Priya");
		//Checking if the Strings point to the same value/memory storage
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
	}
}
