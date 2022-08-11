package string.methods.codes;

public class Prog7 {
	public static void main(String[] args) {
		//indexOf() method can be used to print the index 
		//Checks for the given character or the substring in the original string
		//Prints the index of the first occurrence of the character/particular substring
		
		String str="This is a great session";
		int index1=str.indexOf("s");
		int index2=str.indexOf("is");
		int index5=str.indexOf("s",6);
		int index3=str.indexOf("s",7);
		int index4=str.indexOf("great");
		System.out.println(index1);
		System.out.println(index2);
		System.out.println(index3);
		System.out.println(index4);
		System.out.println(index5);
	}
}
