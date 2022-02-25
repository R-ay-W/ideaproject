package TopInterviewQuestions.Easy;

import java.util.HashMap;

/**
 * 个位：I V III IV IX VIII
 * 十位：X L XL LXX XC
 * 百位：C D CD DCC CM
 * 千位：M,MM
 * <p>
 * 简单总结一下：
 * <p>
 * 罗马数字由 I,V,X,L,C,D,M 构成的。
 * 当小值在大值的左边，则减小值，如 IV=5-1=4 0-1+5。
 * 当小值在大值的右边，则加小值，如 VI=5+1=6 0+5+1。
 * ****IMPORTANT****从左往右，两个两个比较，左边的大于右边的，sum+左边；左边的小于右边的，sum-左边，最后一位加起来
 * 1000 100 1000 10 100 1 5
 */

public class RomanToInteger {
//    public int romanToInt(String s) {
//        int[] roman = new int[s.length()];
//        for (int i = 0; i < roman.length; i++) {
//            char c = s.charAt(i);
//            switch (c) {
//                case 'I':
//                    roman[i] = 1;
//                    break;
//                case 'V':
//                    roman[i] = 5;
//                    break;
//                case 'X':
//                    roman[i] = 10;
//                    break;
//                case 'L':
//                    roman[i] = 50;
//                    break;
//                case 'C':
//                    roman[i] = 100;
//                    break;
//                case 'D':
//                    roman[i] = 500;
//                    break;
//                case 'M':
//                    roman[i] = 1000;
//                    break;
//                default:
//                    break;
//            }
//
//        }
//        int sum = 0;
//        for (int i = 0; i < roman.length - 1; i++) {
//            if (roman[i] >= roman[i + 1]) {
//                sum += roman[i];
//            } else {
//                sum -= roman[i];
//            }
//        }
//        sum += roman[roman.length - 1];
//        return sum;
//
//    }

    /**
     * HashMap版本
     */

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int value = map.get(s.charAt(i));
//            if (i < n - 1 && value < map.get(s.charAt(i + 1))) {
//                sum -= value;
//            } else {
//                sum += value;
//            }
            if(i == n-1){
                sum += value;
            }
            else if(value < map.get(s.charAt(i+1))){
                sum -= value;
            }
            else {
                sum += value;
            }

        }
        return sum;
    }


    public static void main(String[] args) {
        String s = "III";
        RomanToInteger t1 = new RomanToInteger();
        System.out.println(t1.romanToInt(s));

    }
}
