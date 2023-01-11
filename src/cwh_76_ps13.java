/*
class practice13 extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(1);
            }
            catch (Exception e) {
                System.out.println(e);
            }


        System.out.println("good morning");
    }
}}
class practice13b extends Thread{
    public void run(){
       /* while(true){
            try {
                Thread.sleep(2);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("thank you");
        }
        System.out.println("thank you");

    }}
public class cwh_76_ps13 {
    public static void main(String[] args) {
        practice13 p1=new practice13();
        practice13b p2=new practice13b();
        p2.start();

        System.out.println("p1 thread :"+p1.getPriority());
       // System.out.println("p1 thread"+p1.getState());
        System.out.println("p2 thread "+p2.getState());
        p2.setPriority(7);
        System.out.println(p2.getPriority());

       // p1.start();
     //  p2.start();


    }

}
*/