
public class Eclipse4 implements Runnable{
public void run() {
	for(int i=0; i<5; i++) {
	System.out.println("Eclipse thread ID is: "+Thread.currentThread().getId());
	}
}
}

class PPT4 implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("PPT thread Id is:"+Thread.currentThread().getId());
		}
	}
}
