package Stringss;

import java.util.*;

public class interning {
    public static void main(String[] args) {
        String s = "Hello";
        String x = "Hello";
        x = "Mello";//s=?
        System.out.println(s);
        System.out.println(x);
    }
}
