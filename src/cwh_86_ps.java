import java.util.Scanner;

public class cwh_86_ps {
    public static void main(String[] args) {
        //problem1
        //syntax error
        // int a=8
        try{int a=9;
        int b=0;
        int c=a;
        }
        catch(IllegalArgumentException e){
            System.out.println("haa haa");
        }
        catch(ArithmeticException e){
            System.out.println("hee hee");
        }
        int [] marks = new int[3];
        marks[0]=55;
        marks[1]=48;
        marks[2]=45;
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        int i=0;
        while(flag&& i<5){
            try{System.out.println("enter the value of index");
            int ind=sc.nextInt();
            System.out.println(marks[ind]);
            break;
            }
            catch(Exception e){
                System.out.println("invalid index");
                i++;
            }

    }
}}
