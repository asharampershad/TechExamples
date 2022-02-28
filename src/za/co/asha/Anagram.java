package za.co.asha;

import java.util.Arrays;

public class Anagram {
    public static void main (String[] args) {
        String str1 = "save";
        String str2 = "vase";

        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();

        Arrays.sort(chr1);
        Arrays.sort(chr2);

        if (Arrays.equals(chr1, chr2)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
