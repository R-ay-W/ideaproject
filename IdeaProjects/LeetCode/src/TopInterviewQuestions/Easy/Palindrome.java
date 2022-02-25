package TopInterviewQuestions.Easy;



public class Palindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);
        int length = s.length();
        for (int i = 0; i < length/2; i++) {
            if (s.charAt(i)!=s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;

    }


//    public boolean isPalindrome(String s) {
//        int n = s.length();
//        int left = 0, right = n - 1;
//        while (left < right) {
//            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                ++left;
//            }
//            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                --right;
//            }
//            if (left < right) {
//                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                    return false;
//                }
//                ++left;
//                --right;
//            }
//        }
//        return true;
//    }

}
