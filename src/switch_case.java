import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        age=sc.nextInt();
        switch(age){
        case 19:
            System.out.println("you are studying gradution");
        break;
            case 22:
                System.out.println("you are a graduate");
                break;
            default:
                System.out.println("enoy your life");
            }
    }
}
