
public class Main6 {
public static void main(String[] args) {
Eclipse6 e=new Eclipse6();
e.start();
e.setPriority(Thread.MIN_PRIORITY);
PPT6 p=new PPT6();
p.start();
p.setPriority(Thread.NORM_PRIORITY);
}
}
