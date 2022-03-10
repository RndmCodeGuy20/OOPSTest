import java.util.ArrayList;
import java.util.Collections;

public class Q12 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(12);
        arrList.add(1);
        arrList.add(22);
        arrList.add(3);
        arrList.add(42);

        Collections.sort(arrList);
        System.out.println("Sorted list : ");

        for (Integer integer : arrList) {
            System.out.print(integer + " ");
        }

        System.out.println("\nMinumum element : " + arrList.get(0));
        System.out.println("Maximum element : " + arrList.get(arrList.size() - 1));
    }
}
