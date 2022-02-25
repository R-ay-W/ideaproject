package SXT;


public class BinarySearch {
//    public static int binarySearch(int[] nums, int key) {
//
//        return helper(nums,key,0,nums.length-1);
//    }
//
//    public static int helper(int[] nums, int key, int lowerBound, int upperBound) {
//        if(lowerBound>upperBound){
//            return -1;
//        }
//        int mid = (lowerBound + upperBound) / 2;
//        if (nums[mid] > key) {
//            return helper(nums, key, lowerBound, mid-1);
//        } else if (nums[mid] < key) {
//            return helper(nums, key, mid+1, upperBound);
//        }
//        else{
//            return mid;
//        }
//    }

    public static int binarySearch(int[] nums, int key) {
        int lower = 0;
        int upper = nums.length - 1;
        while (lower <= upper) {
            int mid = (lower+upper)/2;
            if(nums[mid]<key){
                lower = mid+1;
            }
            else if(nums[mid]>key){
                upper = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 6));
    }
}
