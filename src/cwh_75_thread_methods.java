class MyNewthr1 extends Thread{

    public void run(){
        int i=0;

        while(true){
            System.out.println("i am a thread 1111111 " );
           try {

                   Thread.sleep(120);
               }
           catch (InterruptedException e)
           {
                   e.printStackTrace();
               }
               i++;

           }
    }
}
class MyNewthr2 extends Thread {

    public void run() {

        while(true){
            System.out.println("i am a thread 222222 " );

        }
    }
}
public class cwh_75_thread_methods {
    public void main(String[] args) {
        MyNewthr1 t1=new MyNewthr1();
        MyNewthr2 t2=new MyNewthr2();
        t2.start();

        t1.start();

    }

    }

