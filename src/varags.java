/*     public class varags {

    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("the sum of a and b is: " + sum(4,8));
        System.out.println("the sum of a,b,c: " + sum(4,8,6));

    }
}          */


public class varags {

    static int sum(int...arr){
        int result=0;
        for(int a:arr){
            result+=a;//1234
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("the sum of a and b is: " + sum(4,8));
        System.out.println("the sum of a,b,c: " + sum(4,8,6,8,6,45,89,6));

    }
}
