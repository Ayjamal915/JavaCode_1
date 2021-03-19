package SelfTurk;

import java.util.Arrays;
import java.util.TreeSet;

public class Anagram {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "bacd";
        System.out.println("same(a,b) = " + same(a, b));
        System.out.println("same2(a,b) = " + same(a, b));
        System.out.println("same3(a,b) = " + same(a, b));
    }

    public static boolean same(String a, String b) {
        if (a.length() == b.length()) {
            while (a.length() > 0) {
                if (b.contains(a.substring(0, 1))) {
                    b = b.replaceAll(a.substring(0, 1), "");
                    a = a.substring(1);
                }
            }
            return a.length() == b.length();
        } else {
            return false;
        }

    }

    public static boolean same2(String a, String b) {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);

        return Arrays.equals(A,B);
    }
    //TreeSet sort yapiyor hem duplicate almiyor
    public static boolean same3(String a, String b) {
        a=new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b=new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }




}
