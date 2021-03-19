package SelfTurk;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str ="AAABBBSDDD";
        System.out.println("removeDup(str) = " + removeDup(str));
        System.out.println("removeDup2(str) = " + removeDup2(str));
        System.out.println("removeDup3(str) = " + removeDup3(str));
    }
    public static String removeDup(String str){
        String result= "";
        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }

        return result;
    }
    public static String removeDup2(String str){
        str= new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str=str.replace("[","").replace(", ", "").replace("]","");
        return str;
    }
    public static String removeDup3(String str){
        String  result ="";
        while(str.length()>0){
            if(!result.contains(str.substring(0,1))){
                result+=str.substring(0,1);
                str=str.replaceAll(str.substring(0,1),"");
            }
        }

        return result;
    }
}
