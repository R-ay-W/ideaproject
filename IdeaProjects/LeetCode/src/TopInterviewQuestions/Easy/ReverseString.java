package TopInterviewQuestions.Easy;
/**
 * 用两个指针比较好
 * **/
public class ReverseString {
//    public void reverseString(char[] s) {
//        for (int i = 0; i < s.length/2; i++) {
//            char temp = s[i];
//            s[i] = s[s.length-1-i];
//            s[s.length-1-i] = temp;
//        }
//    }
    public void reverseString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }

}
