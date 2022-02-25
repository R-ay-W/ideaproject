package TopInterviewQuestions.Easy;


import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
//    public int firstUniqChar(String s) {
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (s.indexOf(c) == s.lastIndexOf(c)) {
//                return i;
//            }
//
//        }
//        return -1;
//    }
    /**
     * 数组计数
     */
//    public int firstUniqChar(String s) {
//        int[] arr = new int[26];
//        int n = s.length();
//        for(int i = 0; i< n;i++){
//            arr[s.charAt(i)-'a']++;
//        }
//        for(int i = 0;i<n;i++){
//            if(arr[s.charAt(i)-'a'] == 1){
//                return i;
//            }
//        }
//        return -1;
//    }

    /**
     * HashMap
     */
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
