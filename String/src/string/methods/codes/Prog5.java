package string.methods.codes;

public class Prog5 {
	public static void main(String[] args) {
		String str="To learn java, go to www.oracle.com";
		if(str.contains("www.oracle.com.in")) {
			System.out.println("The URL contains .com.in");
		}
		else {
			System.out.println("The URL does not have .com.in");
	}
}
}