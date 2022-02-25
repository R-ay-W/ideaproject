package TopInterviewQuestions.Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * 哈希表方法
     */
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }


//    public int[] twoSum(int[] nums, int target) {
//        int[] ans = new int[2];
//
//        for(int i = 0; i < nums.length; i++){
//            int temp = target-nums[i];
//            for(int j = i+1; j < nums.length; j++){
//                if(temp == nums[j]){
//                    ans[0] = i;
//                    ans[1] = j;
//                }
//            }
//        }
//
//        return ans;
//
//    }



    public static void main(String[] args) {
        TwoSum t1 = new TwoSum();
        int[] nums = {0,4,3,0};
        int[] a1 = t1.twoSum(nums,8);
        System.out.println(a1[0]+" "+a1[1]);




    }
}
