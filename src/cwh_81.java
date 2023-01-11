import java.util.Scanner;

public class cwh_81 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=55;
        marks[1]=48;
        marks[2]=45;
Scanner sc=new Scanner(System.in);
        System.out.println("enter the index");
        int ind=sc.nextInt();
        System.out.println("enter the number you want to divide with");
        int number=sc.nextInt();
      try{  System.out.println("the value at array index entered is "+marks[ind]);
        System.out.println("the value of array-value/number is "+ (marks[ind]/number));
      }
      catch(ArithmeticException e){
          System.out.println("arithmetic exception");
          System.out.println(e);
      }
      catch(ArrayIndexOutOfBoundsException e){
          System.out.println("arrayindexout odfbox");
          System.out.println(e);
      }
      catch(Exception t){
          System.out.println(t);

      }

    }
}
