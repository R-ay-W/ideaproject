import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Nino
 */

public class Main {
    static Queue<Integer> queue = new LinkedList<>();
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String[] lineArr = line.split(" ");
        int[] nums = new int[lineArr.length];
        for (int i = 0; i < lineArr.length; i++) {
            nums[i] = Integer.parseInt(lineArr[i]);
        }
        sort(nums);
        for (int num : nums) {
            queue.add(num);
        }

        Node[] arr = new Node[N];
        int leftIndex = -1;
        int rightIndex = -1;
        for (int i = 0; i < N; i++) {
            arr[i] = new Node(i);
        }
        Node root = arr[0];
        inOrder(root, arr);
        for (int i = 0; i < N; i++) {
            if (i != N - 1) {
                System.out.print(arr[i].toString() + " ");
            } else {
                System.out.println(arr[i]);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
                swap(arr, j-1, j);
            }
        }
    }

    static void inOrder(Node node,Node[] arr) {
        if (node == null) {
            return;
        }
        if (leftChildIndex(node.index) < N) {
            node.left = arr[leftChildIndex(node.index)];
        }
        inOrder(node.left,arr);
        node.value = queue.remove();
        if (rightChildIndex(node.index) < N) {
            node.right = arr[rightChildIndex(node.index)];
        }
        inOrder(node.right, arr);
    }


    public static int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    public static int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    static class Node {
        int index;
        int value;
        Node left;
        Node right;

        public Node(int index) {
            this.index = index;
            this.value = -1;
            left = null;
            right = null;
        }

        public Node() {
            value = -1;
            left = null;
            right = null;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
