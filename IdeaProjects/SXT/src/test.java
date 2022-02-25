import java.util.Arrays;

public class test {

    public static void bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

//    public static int binarySearch(int[] nums, int key) {
//        bubbleSort(nums);
//        int lower = 0;
//        int upper = nums.length;
//
//        while(lower<=upper){
//            int mid = (lower + upper) / 2;
//            if(nums[mid]>key){
//                upper = mid-1;
//            }
//            else if(nums[mid]<key){
//                lower = mid+1;
//            }
//            else {
//                return mid;
//            }
//        }
//        return -1;
//    }

    public static int binarySearch(int[] nums, int key) {
        bubbleSort(nums);
        return helper(nums, key, 0, nums.length - 1);
    }

    public static int helper(int[] nums, int key, int lower, int upper) {
        if (lower > upper) {
            return -1;
        }
        int mid = (lower + upper) / 2;
        if (nums[mid] > key) {
            return helper(nums, key, lower, mid - 1);
        } else if (nums[mid] < key) {
            return helper(nums, key, mid + 1, upper);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 1, 2, 4, 6, 9, 0, 1};
        int index = binarySearch(arr, 9);
        System.out.println(Arrays.toString(arr));
        System.out.println(index);

    }
}
