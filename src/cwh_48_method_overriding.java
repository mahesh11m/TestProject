
class A {
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("i am method 2 of class A");
    }
}

class B extends A{
    public void meth3(){
        System.out.println("i am method 3 of class B");
    }
    public void meth2(){
        System.out.println("i am method 2 of class B");
    }

}
public class cwh_48_method_overriding {
    public static void main(String[] args) {
        B b=new B();
        b.meth2();

    }

}
