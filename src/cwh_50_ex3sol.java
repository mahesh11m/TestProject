import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputnumber;
    public int ngss;

    public int getNgss() {
        return ngss;
    }

    public void setNgss(int ngss) {
        this.ngss = ngss;
    }


     Game(int n){
        Random rand =new Random();
        this.number=rand.nextInt(100);

    }
    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();

    }
    boolean iscorrectnumber() {
        if (inputnumber==number){
            return true;
        }
        else if(inputnumber<number){
            System.out.println("too less");
        }
        else if(inputnumber>number){
            System.out.println("too high");
        }
return false;
    }

}

public class cwh_50_ex3sol {
    public static void main(String[] args) {
        Game g = new Game(1);
        boolean b=false;
        while (!b) {



            g.takeuserinput();
            b = g.iscorrectnumber();
            System.out.println(b);

        }
    }
}