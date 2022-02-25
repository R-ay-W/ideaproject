package TopInterviewQuestions.Easy;

import java.util.*;

public class Intersect {
//    public int[] intersect(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        List<Integer> l1 = new ArrayList<>();
//        int i = 0, j = 0;
//        while (i < nums1.length && j < nums2.length) {
//            if (nums1[i] == nums2[j]) {
//                l1.add(nums1[i]);
//                i++;
//                j++;
//            } else if (nums1[i] > nums2[j]) {
//                j++;
//            } else {
//                i++;
//            }
//        }
//        int[] ans = new int[l1.size()];
//        for (int k = 0; k < l1.size(); k++) {
//            ans[k] = l1.get(k);
//        }
//        return ans;
//    }

    /**
     * HashMap
     */
    public int[] intersect(int[] nums1, int[] nums2){
        if(nums1.length>nums2.length){
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            int count = map.getOrDefault(num,0)+1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for(int num:nums2){
            int count = map.getOrDefault(num,0);
            if(count>0){
                intersection[index++] = num;
                count--;
                if(count>0){
                    map.put(num,count);
                }else{
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection,0,index);
    }

}
