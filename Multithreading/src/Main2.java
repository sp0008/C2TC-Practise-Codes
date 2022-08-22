
public class Main2 {
	public static void main(String[] args) {
		Eclipse1 e=new Eclipse1();
		Thread t2=new Thread(e);
		t2.start();
		PPT2 p2=new PPT2();
		Thread t3=new Thread(p2);
		t3.start();
	}

}
