package TopInterviewQuestions.Easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 排序后看字符串是否相等*/
public class IsAnagram {
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        for (int i = 0; i < s.length(); i++) {
//
//            if (t.indexOf(s.charAt(i)) != -1) {
//                t = t.replaceFirst(s.charAt(i) + "", "");
//            }
//
//        }
//        return t.length() == 0;
//    }

//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        char[] str1 = s.toCharArray();
//        char[] str2 = t.toCharArray();
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//        return Arrays.equals(str1, str2);
//    }


    public boolean isAnagram(String s, String t) {
        /**
         * 如果没有长度比较，之后的方法则不成立
         */
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> table = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            table.put(ch,table.getOrDefault(ch,0)+1);//getOrDefault() 方法获取指定 key 对应对 value，如果找不到 key ，则返回设置的默认值。
        }
        for(int i = 0; i<t.length();i++){
            char ch = t.charAt(i);
            table.put(ch,table.getOrDefault(ch,0)-1);
            if(table.get(ch)<0){
                return false;
            }
        }
        return true;

    }




    public static void main(String[] args) {
        IsAnagram t1 = new IsAnagram();
        System.out.println(t1.isAnagram("anagram", "nagaram"));
        System.out.println(t1.isAnagram("aacc", "ccac"));
    }
}
