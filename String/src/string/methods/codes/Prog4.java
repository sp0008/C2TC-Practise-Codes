package string.methods.codes;

public class Prog4 {
public static void main(String[] args) {
	//contains() method
	
	//this method checks for the sequence and character by character when used
	String strr="Hello T#E#C#H#N#O#S#E#R#V#E@2.0 readers";
	boolean doesHave=strr.contains("T#E#C#H#N#O#S#E#R#V#E");
	System.out.println(doesHave);
	System.out.println(strr.contains("TECHNOSERVE"));
}
}
