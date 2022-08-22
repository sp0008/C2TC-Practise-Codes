
public class Eclipse6 extends Thread{
	public void run() {
		System.out.println("Eclipse Thread ID is"+Thread.currentThread().getId());
		System.out.println("Thread priority is:"+Thread.currentThread().getPriority());
	}
}

class PPT6 extends Thread{
	public void run() {
		System.out.println("PPT thread Id is "+Thread.currentThread().getId());
		System.out.println("Thread priroity is:"+Thread.currentThread().getPriority());
	}
}
