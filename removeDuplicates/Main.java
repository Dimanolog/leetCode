package removeDuplicates;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        solution.removeDuplicates(nums1);

        System.out.println(Arrays.toString(nums1));


    }
}