package TopInterviewQuestions.Easy;

import java.util.Arrays;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < nums1.length; i++) {

            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);

    }



    public static void main(String[] args) {
        MergeSortedArrays t1 = new MergeSortedArrays();
        t1.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
