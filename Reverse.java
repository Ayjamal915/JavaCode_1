package SelfTurk;

public class Reverse {
    public static void main(String[] args) {
        String srt1 = "ABCD";
        System.out.println("reverse(srt1) = " + reverse(srt1));
        System.out.println("reverse2(srt2) = " + reverse2(srt1));
        System.out.println("reverse3(srt3) = " + reverse3(srt1));
    }

    public static String reverse(String srt) {
        String rev = "";
        for (int i = srt.length() - 1; i >= 0; i--) {
            rev += srt.charAt(i);
        }

        return rev;
    }

    public static String reverse2(String srt) {
        String rev = "";
        while (srt.length() > 0) {
            rev += srt.charAt(srt.length() - 1);
            srt =srt.substring(0,srt.length()-1);
        }
        return rev;
    }

    public static String reverse3(String srt) {
        return new StringBuffer(srt).reverse().toString();
    }
}
