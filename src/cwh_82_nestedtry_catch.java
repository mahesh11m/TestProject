import java.util.Scanner;

public class cwh_82_nestedtry_catch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=55;
        marks[1]=48;
        marks[2]=45;
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
        System.out.println("enter the value of index");
        int ind=sc.nextInt();
        try{
            System.out.println("welcome to video no 82");
            try{
                System.out.println( marks[ind]);
                flag=false;

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("sorry the index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");

        }
    }
}}
