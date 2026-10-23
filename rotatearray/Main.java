package rotatearray;




import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums1 = {1,2,3,4,5,6,7};
        solution.rotate(nums1, 3);

        System.out.println(Arrays.toString(nums1));


    }
}