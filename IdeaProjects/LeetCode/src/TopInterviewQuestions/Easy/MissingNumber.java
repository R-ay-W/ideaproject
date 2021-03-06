package TopInterviewQuestions.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {
//    public int missingNumber(int[] nums){
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]!=i) {
//                return i;
//            }
//        }
//        return nums.length;
//    }

    /**
     * using HashSet
     */
    public int missingNumber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return nums.length;
    }


}
