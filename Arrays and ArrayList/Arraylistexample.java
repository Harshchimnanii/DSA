import java.util.*;
public class Arraylistexample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            list.get(i);
        }
            // list.add(20);
            // list.add(40);
            // list.add(23);
            // list.add(24);
            // list.add (1121);
            System.out.println(list.contains(23));
            System.out.println(list);

            // changes
            list.set(0,99);
            System.out.println(list);
            list.remove(2);

            System.out.println(list);
    }
}
