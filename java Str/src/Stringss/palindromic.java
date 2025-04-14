package Stringss;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class palindromic {

    public static void main(String[] args) {
        String str = "abcdcba";
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag == true) {
            System.out.println("yes");
        } else {
            System.out.println("Not");
        }

    }


}
