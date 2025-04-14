package Stringss;

import java.util.*;

public class toggleString {
    public static void main(String[] args) {
        String input = "PHysiCS";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if uppercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);  // Convert to lowercase
            }
            // Check if lowercase
            else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);  // Convert to uppercase
            } else {
                result += ch; // Non-alphabetical character, keep as is
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Converted: " + result);
    }
}
