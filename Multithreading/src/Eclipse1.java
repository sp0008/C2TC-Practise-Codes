
public class Eclipse1 implements Runnable{
public void run() {
	System.out.println("Eclipse thread ID is: "+Thread.currentThread().getId());
}
}

class PPT2 implements Runnable{
	public void run() {
		System.out.println("The PPT thread ID is: "+Thread.currentThread().getId());
	}
}