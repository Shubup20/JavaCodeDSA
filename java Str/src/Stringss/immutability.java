package Stringss;

import java.util.*;

public class immutability {

    public static void main(String[] args) {
        String str = "Hello";
//        str.charAt(0) = 'c';

//        System.out.println(str);//show error

        str = str.substring(0,2) +'y'+ str.substring(3) ;
        System.out.println(str);
    }
}
