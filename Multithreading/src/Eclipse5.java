
public class Eclipse5 extends Thread{
	public void run() {
		System.out.println("Eclipse thread ID is "+Thread.currentThread().getId());
		System.out.println("Thread priority is:"+Thread.currentThread().getPriority());
	}
}

class PPT5 extends Thread{
	public void run() {
		System.out.println("PPT Thread ID is: "+Thread.currentThread().getId());
		System.out.println("Thread priority is: "+Thread.currentThread().getPriority());
	}
}
