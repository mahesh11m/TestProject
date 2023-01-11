
class employee{
    int id;
    String name;
    String fathername;
    String mothername;

    public void printdetails(){
        System.out.println("my id   "+id);
        System.out.println("my name is "+name);
        System.out.println("my father name   "+fathername);
        System.out.println("my mother name    "+mothername);

    }
}
public class oopsconcept {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        employee harry=new employee();
        employee john=new employee();
        harry.id=881861;
        harry.name="harish k";
        harry.fathername="rohan";
        harry.mothername="kavitha";

        john.id=881875;
        john.name="john taylor t";
        harry.printdetails();
    }

}
