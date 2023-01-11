class phone{
    public void name(){
        System.out.println("my name is phone");
    }
    public void on(){
        System.out.println("turning phone on");
    }
}
class smartphone extends phone{
    public void name(){
        System.out.println("my name is smartphone");
    }
    public void on(){
        System.out.println("turning on smartphone");
    }



}

public class cwh_49_dynamic_method_dismatch {
    public static void main(String[] args) {
     //   phone obj=new phone();
     //   obj.name();

        phone obj=new smartphone();
        obj.on();
        obj.name();

    }
}
