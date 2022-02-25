package TopInterviewQuestions.Easy;

/**
 * 异或：两个相同的数异或运算结果为0
 * 0和任何数异或运算结果是它本身
 */
public class singleAppearanceNumber {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] = nums[0] ^ nums[i];
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int a = 0 ^ 1332;
        System.out.println(a);
    }
}
