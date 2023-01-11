import kotlin.collections.ArrayDeque;

public class cwh_93_arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(6);
        ad1.add(65);
        ad1.add(66);
        ad1.add(66);
        ad1.add(66);
       System.out.println(ad1.getSize());
        ad1.addFirst(77);
        System.out.println(ad1);
    }
}
