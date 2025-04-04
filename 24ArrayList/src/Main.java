import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        wrapper class
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Boolean> l2 = new ArrayList<>();

//        add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

//        get an element at index i
        System.out.println("get index 1 Element: " + l1.get(1));//6

//        print with for loop
        for (int j = 0; j < l1.size(); j++) {
            System.out.println(l1.get(j));//5,6,7,8
        }

//        printing the arrayList directly
        System.out.println(l1);//[5,6,7,8]

//        adding element at some index i //[5 ,100 ,6 ,7 ,8]
        l1.add(1, 100);
        System.out.println(l1);

//        modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);//[5,10,6,7,8]

//      removing an element at index i
        l1.remove(1);
        System.out.println(l1);//[5,6,7,8]

//        removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);//[5,6,8]

//        checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(17));
        System.out.println(ans);

//        if you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add(4);
        l.add(4.5);
        l.add("shubham");
        l.add(false);
        System.out.println(l);
    }
}