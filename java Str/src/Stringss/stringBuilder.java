package Stringss;

import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        //Hello=>mello
        str.setCharAt(0, 'm');
        System.out.println(str);

        str.append(" World");
        System.out.println(str);

        str.insert(3, 's');
        System.out.println(str);

        str.deleteCharAt(3);
        System.out.println(str);

        str.delete(3,5);
        System.out.println(str);

        str.reverse();
        System.out.println(str);

    }
}
