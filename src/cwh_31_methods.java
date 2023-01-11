

public class cwh_31_methods {
    static int logic(int x,int y) {
        int z;
        if (x < y) {
            z = x + y;
        } else
            z = x + y + x;
        return z;
    }

    public static void main(String[] args) {

int a=1;
int b=2;
int c;
c=logic (a,b);
        System.out.println(c);
        int a1=87;
        int b1=65;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);

        }
    }

