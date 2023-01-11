public class cwh_80_try {
    public static void main(String[] args) {
        int a=100;
        int b=10;
        try{
            int c=a/b;
            System.out.println("the result is " +c);
        }
        catch(Exception t){
            System.out.println("we failed ");
            System.out.println(t);
            System.out.println("end of program");
        }
    }
}
