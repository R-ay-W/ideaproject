package TopInterviewQuestions.Easy;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class MajorityElement {
//    private Map<Integer, Integer> countNums(int[] nums) {
//        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
//        for (int num : nums) {
//            if (!counts.containsKey(num)) {
//                counts.put(num, 1);
//            } else {
//                counts.put(num, counts.get(num) + 1);
//            }
//        }
//        return counts;
//    }
//
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> counts = countNums(nums);
//        Map.Entry<Integer, Integer> majorityEntry = null;
//        for (Map.Entry<Integer, Integer> entry : counts.entrySet()){
//            if(majorityEntry == null || entry.getValue()>majorityEntry.getValue()){
//                majorityEntry = entry;
//            }
//        }
//
//        return majorityEntry.getKey();
//    }

/**
 * 先将数组排序
 * 下标为n/2（向下取整）的元素一定是众数（下标从0开始）
 */
//    public int majorityElement(int[] nums){
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }

    public int majorityElement(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int more = map.get(nums[i])+1;
                map.put(nums[i],more);
            }
            else{
                map.put(nums[i],1);
            }
        }
        Map.Entry<Integer,Integer> max = null;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(max==null){
                max = entry;
            }
            else{
                if(entry.getValue()>max.getValue()){
                    max = entry;
                }
            }
        }
        return max.getKey();
    }
public static void main(String[] args) {
    HashMap<Integer,Integer> test = new HashMap<>();
    test.put(1,2);
    test.put(1,3);
    System.out.println(test);
}
}
