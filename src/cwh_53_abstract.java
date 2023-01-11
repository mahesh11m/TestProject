
abstract class parent2{
    public parent2(){
        System.out.println("mai class2 ka constructor hoo");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet2();
    public void greet3(){};
}
class child2 extends parent2{
    public void greet(){
        System.out.println("good morning");
    }
    public void greet2(){
        System.out.println("good evening");
    }
}
abstract class child3 extends parent2{
    public void th(){
        System.out.println("i am good");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
       // parent2 p=new parent2(); -- throws error because u cannot make object of a abstract class
        child2 c=new child2();
        c.greet();

    }

}
