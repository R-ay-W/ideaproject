package SXT;

import java.util.Arrays;

public class DoubleDimensionalArray {

    public static void main(String[] args) {
        int[][] a = new int[3][3];
        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[] {1,2,3,4};
//        a[3] = new int[5];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a[2]));

        int[][] a1= {{1,2},{1,2,3},{1,2,3,4}};
        System.out.println(Arrays.toString(a1[2]));
    }
}
