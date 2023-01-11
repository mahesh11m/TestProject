class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
       // int i=8;
      //  while(i<44){
            System.out.println("i am a thread6");
         //   i++;
        }
    }
//}
public class cwh_73_thread_constructors {
    public static void main(String[] args) {

        Mythr t=new Mythr("harry");
        Mythr t1=new Mythr("john");
        t.start();
        t1.start();
        System.out.println("the id of thread t is"+t.getName());
        System.out.println("the id of thread t is"+t1.getName());
        System.out.println("the id of thread t is"+t1.getState());

    }
}
