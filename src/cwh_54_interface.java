interface Bicycle{
    int a=45;
    void applybrake(int decrement);
    void speedup(int increment);

}
class AvonCycle implements Bicycle{
    void Blowhorn(){
        System.out.println("pee pee poo poo");
    }
    public void applybrake(int decrement){
        System.out.println("apllying brake");
    };
    public void speedup(int increment){
        System.out.println("speeding up");

    };

}
public class cwh_54_interface {
    public static void main(String[] args) {
        AvonCycle a1=new AvonCycle();
        a1.applybrake(1);
        System.out.println(a1.a);

    }
}
