import java.util.Scanner;

public class tax_calcualtor {
    public static void main(String[] args) {
        float tax=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your income");
        float income=sc.nextFloat();

      if(income<=250000){
            tax=tax+0;
        }

        else if  (income>=250001 || income<=500000) {
            tax=tax+0.05f*(income-250000);
        }

       else if  (income>=500001 || income<=750000) {
            tax=tax+0.05f*(income-250000);
            tax=tax+12500+0.10f*(income-500001);
        }

        else if  (income>=750001 || income<=1000000) {
            tax=tax+0.05f*(income-250000);
            tax=tax+12500+0.10f*(income-500001);
            tax=tax+37500+.15f*(income-750001);
        }

        else if  (income>=1000001 || income<=1250000) {
            tax=tax+0.05f*(income-250000);
            tax=tax+12500+0.10f*(income-500001);
            tax=tax+37500+.15f*(income-750001);
            tax=tax+75000+.20f*(income-1000001);
        }

        else if  (income>=1250001 || income<=1500000) {
            tax=tax+0.05f*(income-250000);
            tax=tax+12500+0.10f*(income-500001);
            tax=tax+37500+.15f*(income-750001);
            tax=tax+75000+.20f*(income-1000001);
            tax=tax+125000+.25f*(income-1250001);
        }

        else if  (income>=1500001) {
         tax=tax+0.05f*(income-250000);
          tax=tax+12500+0.10f*(income-500001);
         tax=tax+37500+0.15f*(income-750001);
          tax=tax+75000+0.20f*(income-1000001);
          tax=tax+12500+.25f*(income-1250001);
            tax=tax+87500+0.30f*(income-1500001);
        }

        System.out.println("your total tax is "+tax);

    }
}
