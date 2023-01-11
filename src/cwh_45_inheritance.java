class Base1{
  Base1(){
      System.out.println("i am a base class constructor");
  }
    Base1(int x){
        System.out.println("i am a base class constructor with value x as " +x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("i am a derived class constructor");
    }
    Derived1(int x,int y){
        super( x);

        System.out.println("i am a derived class constructor with value y as " +y);
    }

}
class childofDerived1 extends Base1{
    childofDerived1(){
        System.out.println("i am a derived class constructor");
    }
    childofDerived1(int x,int y,int z){
    //    super(x,y);

        System.out.println("i am a derived class constructor with value z as " +z);
    }

}
public class cwh_45_inheritance {
    public static void main(String[] args) {
        childofDerived1 b=new childofDerived1();


    }
}
