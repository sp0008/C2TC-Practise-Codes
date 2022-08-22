
public class Eclipse3 extends Thread{
public void run() {
	for(int i=0; i<5; i++) {
		System.out.println("Eclipse thread Id is: "+Thread.currentThread().getId());
	}
}
}

class PPT3 extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("The PPT thread ID is: "+Thread.currentThread().getId());
		}
	}
}
