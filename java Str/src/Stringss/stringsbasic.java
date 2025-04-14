package Stringss;

import java.util.*;

public class stringsbasic {

    public static void main(String[] args) {
//        char[] arr = new char[10];
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(str);
//        String str = "Shubham chauhan";
//        System.out.println(str);
//        System.out.println("Janu");

        String str = "Shubham";
        int lent = str.length();
        System.out.println(lent); // space also count
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf("a"));
        String gtr = "Janu";
        System.out.println(str.compareTo(gtr));

        System.out.println(str.contains("han"));//true and false
        System.out.println(str.endsWith("ham"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(" " + gtr));

    }
}
