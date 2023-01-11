class Base {
    int x;

    public int getX() {
        System.out.println("i am getting x from base");
        return x;
    }

    public void setX(int x) {
        System.out.println("i am setting x now");
        this.x = x;
    }

    public void printme(){

    }}
    class Derived extends Base{ int y;

        public int getY() {
            System.out.println("i am getting y from derived class");
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
public class cwh_inheritance{
    public static void main(String[] args) {
        Base b= new Base();
       b.setX(5);
      //  Derived d= new Derived();
     //   d.getX();
        System.out.println(b.getX());
    }


}