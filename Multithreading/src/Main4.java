
public class Main4 {
public static void main(String[] args) {
Eclipse4 e=new Eclipse4();
Thread t=new Thread(e);
t.start();
PPT4 p=new PPT4();
Thread t1=new Thread(p);
t1.start();
}

}
