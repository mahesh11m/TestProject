public class method_calling {
     int logic(int x,int y) {
        int z;
        if (x > y) {
             z = x + y;
        } else {
             z = x + y + 2;

        }
        return z;
    }

    public static void main(String[] args) {
        int a=86;
        int b=6;
        int c;
        method_calling obj=new method_calling();
        c=obj.logic(a,b);

        int a1=6;
        int b1=66;
        int c1;

        c1=obj.logic(a1,b1);
        int a2=26;
        int b2=66;
        int c2;

        c2=obj.logic(a2,b2);

        System.out.println(c);
        System.out.println(c2);

    }
}
