public class method_overriding {

    //static void change(int []arr){
     //   arr[0]=5;
     //   arr[1]=55;
     //   int a=9;
      //  System.out.println("its aaaa jokeeeee");
      //  System.out.println("its a funny jokeeeee");
        static void foo(){
            System.out.println("good morning bro!");

        }
    static void foo(int a,int b){
        System.out.println("good morning  "  + a + " bro!");
        System.out.println("good morning  "  + b + " bro!");
    }

    public static void main(String[] args) {
       // int[]markss={2,54,34,21,3};
       // change(markss);
       // int x=65;

      //  change(x);
       // int x=7;
      // System.out.println("the value of x is "+markss[1]);
      //  System.out.println("the value of x is "+markss[0]);

       // telljoke();
        foo(3000,77);




    }
}
