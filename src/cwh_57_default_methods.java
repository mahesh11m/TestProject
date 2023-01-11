
/*
interface camera{
    void takesnap();
    void recordvideo();
   default void record4kvideo(){
        System.out.println("recording in 4k");
    }
}
interface wifi{
    String [] getNetworks();
    void connecttonetwork(String network);
}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling.."+phonenumber);
    }
    void pickcall(){
        System.out.println("connecting");
    }
  //  void takesnap(){
  //      System.out.println("taking snap");
   // }
    class mysmartphone extends mycellphone implements camera,wifi{
     public void takesnap(){
               System.out.println("taking snap");
           }
      public void recordvideo(){
          System.out.println("recordong video");

      }
      public String [] getNetworks(){
          System.out.println("getting list of networks");
          String [] networklist={"harry","prashant","anjali6"};
          return networklist;

      }
      public void connecttonetwork(String network){
          System.out.println("connecting to network"+network);

      }


  }

}
public class cwh_57_default_methods {
    public static void main(String[] args) {
        camera cam1=new mycellphone();


            
        }

    }
    */


