package TopInterviewQuestions.Easy;

import java.security.KeyStore;

public class LongestCommonPrefix {

//    public String longestCommonPrefix(String[] strs) {
//        String ans = "";
//
//        int maxLength = strs[0].length();
//        for (int i = 1; i < strs.length; i++){
//            if(strs[i].length()<maxLength){
//                maxLength = strs[i].length();
//            }
//        }
//
//        boolean flag = true;
//        int index = 0;
//        if(index>=maxLength){
//            flag = false;
//        }
//        while (flag) {
//
//            char c1 = strs[0].charAt(index);
//            for (int i = 1; i < strs.length; i++) {
//
//                if (c1 != strs[i].charAt(index)) {
//                    flag = false;
//                    return ans;
//                }
//            }
//            ans = ans + c1;
//            index = index + 1;
//            if(index>=maxLength){
//                flag = false;
//            }
//        }
//
//        return ans;
//
//    }

    public String longestCommonPrefix(String[] strs){
        if (strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.length() == 0){
                    return "";
                }
            }
        }
        return prefix;

    }

    public static void main(String[] args) {
        LongestCommonPrefix t1 = new LongestCommonPrefix();
        System.out.println(t1.longestCommonPrefix(new String[]{"","",""}));
    }

}
