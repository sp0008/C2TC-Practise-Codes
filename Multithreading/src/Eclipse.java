
public class Eclipse extends Thread{
public void run() {
	System.out.println("Eclipse thread ID is: "+Thread.currentThread().getId());
}
}

class PPT extends Thread{
public void run() {
		System.out.println("PPT thread ID is: "+Thread.currentThread().getId());
	}
}


