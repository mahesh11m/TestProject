import java.util.Scanner;

public class cwh_79_errorsdemo {
    public static void main(String[] args) {
        //logical error demo
        // write a program to print all prime numbers between one to 10
        System.out.println(2);
        for(int i=1;i<10;i++)
        {
        System.out.println(2*i+1);
        }
        //runtime error
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        System.out.println(1000/k);

    }
}
