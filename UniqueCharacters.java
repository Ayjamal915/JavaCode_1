package SelfTurk;

import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="AABBCDHGG";
        System.out.println("unique(str) = " + unique(str));
        System.out.println("unique(str3) = " + unique3(str));
        System.out.println("unique(str2) = " + unique2(str));
    }
    public static String unique(String str) {
        String unique="";
        while(str.length()>0){
            if(str.substring(1).contains(str.substring(0,1))){
                str=str.replaceAll(str.substring(0,1),"");
            }else{
                unique+=str.substring(0,1);
                str=str.substring(1);
            }
        }

        return unique;
    }

    public static String unique3(String str){
        String unique="";
        for (String each: str.split(""))
            unique+=((Collections.frequency(Arrays.asList(str.split("")),each))==1)? each: "";
        return unique;
    }

    public static String unique2(String str){
        char[] arr=str.toCharArray();
        String unique="";
        for (int i = 0; i <arr.length ; i++) {
            int freq=0;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j])
                    freq++;
            }
            if(freq==1)
                unique+=arr[i];
        }
        return unique;

    }

}
