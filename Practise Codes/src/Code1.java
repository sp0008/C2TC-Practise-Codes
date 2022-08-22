
public class Code1 {
	public static void main(String[] args) {
		byte var1=126;
		byte var2=127;
		//Maximum value a byte can store is 255
		//Size of one byte is 8 bits
		
		//Error -->
		byte result= (byte) (var1+var2);
		System.out.println(result);
	}

}
