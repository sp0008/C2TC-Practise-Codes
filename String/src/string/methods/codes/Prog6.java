package string.methods.codes;

public class Prog6 {
	public static void main(String[] args) {
		//equalsIgnoreCase() method is used to ignore the case of the strings
		//It considers both upper and lower case strings with same value as equals
		//Prints a boolean value true or false
		
		String s1="Github is a Version Control Tool";
		String s2="Github is a Version Control System";
		String s3="GITHUB IS A VERSION CONTROL TOOL";
		String s4="GITHUB IS A VERSION CONTROL SYSTEM";
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.equalsIgnoreCase(s4));
	}

}
