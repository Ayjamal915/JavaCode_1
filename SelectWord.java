package SelfTurk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SelectWord {
    public static void main(String[] args) {
       // countDups("java is java language is useful java");
        String s = "java is java language is useful java";
        countDups(s);
    }

    public static void countDups(String s) {

        ArrayList<String> words =
                new ArrayList<>(Arrays.asList(s.split(" ")));
        // converted String to ArrayList of Strings
        String checked = "";

        for (String word : words) {

            if (!checked.contains(word)) {
                int freqOfEach = Collections.frequency(words, word); // Ready method
                System.out.println(word + ": " + freqOfEach);
                checked += word + " ";
                if (freqOfEach == 2) {
                    System.out.println("duplicatedword = " +word);
                }
            }

        }

    }
/*
    public static String countDups1(String s) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split("")));
        String checked = "";
        for (String each : words) {
            if (!checked.contains((CharSequence) words)) {
                int freqcount = Collections.frequency(words, each);
                checked += each + " ";
            }
        }
        return checked;
    }


 */
}
