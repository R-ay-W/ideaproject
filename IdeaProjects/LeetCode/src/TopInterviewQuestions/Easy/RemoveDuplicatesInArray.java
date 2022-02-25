package TopInterviewQuestions.Easy;

/**
 * 两个指针i,j
 * j走在前
 * 寻找和j-1不同的元素
 * i在后
 * 记录可覆盖的位置*/
public class RemoveDuplicatesInArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while(i < nums.length && j < nums.length){
            if(nums[j]==nums[i]){
                j++;
            }
            else{
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesInArray t1 = new RemoveDuplicatesInArray();
        int ans = t1.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});

        System.out.println(ans);

    }
}
