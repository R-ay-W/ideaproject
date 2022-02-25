package com.bjsxt.string;

public class Test1 {
    public static void main(String[] args) {
        String str1 = new String("abcdefg");
        String str2 = "abcdefgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
        String str3 = "abcdefgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggh";

        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println("abcda".indexOf("a"));
        String str5 = "a b c d b c d".replace(" ","");
        System.out.println(str5);
        System.out.println(str5.startsWith("a"));
        System.out.println(str5.endsWith("cd"));

        String str11 = "abc";
        String str12 = "abc";
        str11 = str11.replace('a','v');
        System.out.println(str11==str12);
    }
}
