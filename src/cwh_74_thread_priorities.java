/*class Mythr1 extends Thread{

    public Mythr1(String name){
        super(name);
    }
    public void run(){
         int i=8;
         while(true){
        System.out.println("i am a thread " +getName());
       //   i++;
    }
}
}
public class cwh_74_thread_priorities {
    public static void main(String[] args) {
        // Ready queue T1 ,T2,T3,T4,T5
        Mythr1 t1=new Mythr1("harry1 ");
        Mythr1 t2=new Mythr1("harry2");
        Mythr1 t3=new Mythr1("harry3 ");
        Mythr1 t4=new Mythr1("harry4");
        Mythr1 t5=new Mythr1("harry5**************************************** ");
        t5.setPriority(Thread.MAX_PRIORITY);
       // t1.setPriority(Thread.MIN_PRIORITY);
       // t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
*/