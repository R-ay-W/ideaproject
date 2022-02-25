package SXT;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] nums) {
        int temp;
        //外层循环，n个元素排序，则最多需要n-1次循环
        for (int i = 0; i < nums.length - 1; i++) {
            //标记一个布尔类型，标记数组是否已达到有序状态
            boolean flag = true;
            //内层循环，每一次循环都从数组的前两个元素开始进行比较，比较到无序数组的最后
            for (int j = 0; j < nums.length - 1 - i; j++) {
                //如果前一个元素大于后一个元素，则交换两元素的值
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    //本次发生了交换，说明该数组依然处于无序状态
                    flag = false;
                }
            }
            //如果有一次从头到尾没有发生一次交换，说明该数组已经有序，可退出循环
            if (flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 6, 2, 5, 0, 7, 4, 9, 5};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
