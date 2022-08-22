
public class Code5 {
	public static void main(String args[]) {
		for(int i=0; i<=10; i++) {
			if(i>6) 
				break;
		}
		//Local variables can't be accessed outside the scope of main method
		System.out.println(i);
	}

}
