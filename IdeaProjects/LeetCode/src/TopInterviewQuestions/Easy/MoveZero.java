package TopInterviewQuestions.Easy;

import java.util.Arrays;

public class MoveZero {
    public int[] moveZero(int[] nums) {

        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[cnt];
                nums[cnt] = nums[i];
                nums[i] = temp;
                cnt++;
            }
        }
        for (int i = cnt; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        MoveZero t1 = new MoveZero();
        System.out.println(Arrays.toString(t1.moveZero(new int[]{1,0,4,0,2})));
    }
}
