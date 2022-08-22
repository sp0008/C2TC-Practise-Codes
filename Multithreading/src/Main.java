

class Main{
	public static void main(String[] args) {
		Eclipse e1=new Eclipse();
		Thread t=new Thread(e1);
		t.start();
		PPT p1=new PPT();
		Thread t1=new Thread(p1);
		t1.start();
	}
}