package string.methods.codes;

public class Prog8 {
	public static void main(String[] args) {
		//lastIndexOf() method is used to print the last index
		//It checks for the last occurrence of given character/substring
		//then prints the index of it
		
		String strr="This is what it is";
		int index1=strr.lastIndexOf("s");
		System.out.println(index1);
		System.out.println(strr.lastIndexOf("s",5));
	}
}
