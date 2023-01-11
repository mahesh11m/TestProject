/*abstract class pen{
   abstract void write();
   abstract void refill();
}
class Fountainpen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");

    }
    void changenib(){
        System.out.println("changing nib");

    }

}
class monkey{
    void jump(){
        System.out.println("jumping..");
    }
    void bite(){
        System.out.println("biting..");
    }
}
interface basicanimal{
    void eat();
    void sleep();
}
class `human extends monkey implements basicanimal{
    void speak(){
        System.out.println("hello sir!");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
interface TvRemote{
    void on();
    void off();

}
interface smartTvRemote extends TvRemote{
    void mute();

}
class Tv implements smartTvRemote{
    public void on(){
        System.out.println("turning tv on");

    }
    public void off(){
        System.out.println("turning tv off");

    }
    public void mute(){
        System.out.println("audio is muted");

    }
}
public class cwh_60_ch11_ps {
    public static void main(String[] args) {
       //q1,q2
        Fountainpen fp=new Fountainpen();
        fp.changenib();
        //q3
        human harry=new human();
        harry.speak();
        harry.sleep();
        //q5
        monkey m1=new human();
        m1.jump();
        m1.bite();
        basicanimal ravish=new human();
        ravish.eat();
        ravish.sleep();

    }
}
*/