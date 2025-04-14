package Stringss;

import javax.swing.table.TableCellEditor;
import java.util.*;

public class printAllSubstring {

    public static void main(String[] arg) {
        String str = "abcd"; //index 0to3
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j <= str.length() ; j++) {
//                System.out.print(str.substring(i, j) + " ");
//            }
//        }


        // without build method

        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                temp += str.charAt(j);
                System.out.println(temp);
            }
        }
    }
}

