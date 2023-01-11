import java.util.ArrayList;
import java.util.LinkedList;

public class cwh_92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();

        l2.add(14);
        l2.add(16);
        l2.add(18);

        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(9);
        l1.addAll(l2);
        l1.add(1,6);
        for(int i=0;i< l1.size();i++){
            System.out.println(l2.contains(145));
            System.out.print(l1.get(i));

            System.out.print(", ");
        }

    }
}
