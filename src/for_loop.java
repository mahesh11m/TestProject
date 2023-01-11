public class for_loop {
    public static void main(String[] args) {

       /* for(int i=0;i<=190;i++){
            System.out.println(i);
        }*/

        //even numbers
/*int n=-10;
        for(int i=0;i>n;i--){
            System.out.println(2*i-1);
        }*/

        //break and continue loops

      /*  for(int i=0;i<=10;i++){
            System.out.println(i);
            System.out.println("java is great");

        if(i==3){
            System.out.println("ending loop using break");
            break;
        }}
        */

      /*  for(int i=0;i<=10;i++){
            if(i==3) {
                System.out.println("ending loop using break");
                continue;
            }

                System.out.println(i);
                System.out.println("java is great");

          }*/

        int i=0;
        do{
            i++;
        if (i==2){
            System.out.println("ending the loop");
            continue;
        }
            System.out.println(i);
            System.out.println("java is great");
        } while(i<5);{
            System.out.println("loops ends here");
        }
    }}
