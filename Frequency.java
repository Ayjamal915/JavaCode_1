package SelfTurk;

public class Frequency {
    public static void main(String[] args) {
        //String str ="java is java language is useful";
        String str = "asss dddd f ghhh jj k";
        //output:a1s3 d4 f1 g1h3 j2 k1
        System.out.println("duplicated word = " + frequency(str));
    }

    public static String frequency(String str) {
        String result = "";
        while (str.length() > 0) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                //  if (str.substring(i,i+1).contains(str.substring(0, 1)))
                if (str.substring(i, i + 1).contains(str.substring(0, 1)))
                    count++;
            }
             //if(count=2)
            if (!str.substring(0, 1).equals(" "))
                result += str.substring(0, 1) + count + " ";
            //result += str.substring(0, 1);
            str = str.replaceAll(str.substring(0, 1), "");
        }
        return result;
    }

}







