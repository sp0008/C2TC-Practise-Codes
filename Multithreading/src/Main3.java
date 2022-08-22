
public class Main3 {
public static void main(String[] args) {
Eclipse3 e=new Eclipse3();
Thread t=new Thread(e);
t.start();
PPT3 p=new PPT3();
Thread t1=new Thread(p);
t1.start();
}
}
