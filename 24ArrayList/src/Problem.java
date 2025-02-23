import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Problem {
    static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;

        while (i < j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);

        System.out.println("Original list: " + list);
        Collections.reverse(list);
        System.out.println("Reverse List: " + list);
        Collections.sort(list);
//        reverseList(list);
        System.out.println("Ascending Order: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order" + list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("welcome");
        list2.add("to");
        list2.add("shubham");
        list2.add("home");
        System.out.println("og" + list2);
        Collections.sort(list2);
//        Collections.sort(list2, Collections.reverseOrder());
        System.out.println("sorted" + list2);

    }
}
