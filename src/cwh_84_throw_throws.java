
class Negativeradiusexception extends Exception{
    public String toString(){
        return "radius cannot be negative";
    }
    public String getmessage(){
        return "radius cannot be negative";
    }
}
public class cwh_84_throw_throws {

    public static double area(int r)throws Negativeradiusexception{
        if(r<0){
            throw new Negativeradiusexception();
        }

        double result=Math.PI*r*r;
        return result;
    }
    //made by harry
    public static int divide(int a,int b)throws ArithmeticException{
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        //shivam uses function created by harry
    //  try  { int c=divide(8,0);
    //    System.out.println(c);}
    //  catch(Exception e){
     //     System.out.println("exception");
     // }
        try  { double c=area(0);
            System.out.println(c);}
        catch(Exception e){
            System.out.println("exception");
        }


    }
}
