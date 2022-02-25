package TopInterviewQuestions.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if(nums[i]==nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


    /**
     * 先排序
     * 重复元素一定出现在相邻位置
     */
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if(set.contains(i)){
                return true;
            }
            else {
                set.add(i);
            }
        }
        return false;
    }
}
