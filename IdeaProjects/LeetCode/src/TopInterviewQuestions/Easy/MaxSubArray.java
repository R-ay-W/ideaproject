package TopInterviewQuestions.Easy;

/**
 * 贪心：
 * 若当前指针所指元素之前的和小于0，则丢弃当前元素之前的数列
 * 若当前指针所指元素之前的和大于0，则加上当前值
 * <p>
 */

public class MaxSubArray {

//    public int maxSubArray(int[] nums) {
//
//        //-2 1 -3 4 -1 2 1 -5 4
//        int prev = nums[0];
//        int max = nums[0];
//        int curr = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (prev < 0) {
//                prev = 0;
//                curr = prev + nums[i];
//            } else {
//                curr = prev + nums[i];
//            }
//
//            max = Math.max(max, curr);
//            prev = curr;
//        }
//        return max;
//    }


    /**
     * 动态规划：
     * 若前一个元素大于0，则将其加到当前元素上
     * 若前一个元素小于0，则保持当前元素不变
     */
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>0){
                nums[i] = nums[i]+nums[i-1];
            }
            max = Math.max(max,nums[i]);
        }
        return max;
    }
}
