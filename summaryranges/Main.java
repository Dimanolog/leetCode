package summaryranges;



import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1,2,3,5,6,7, 9, 10, 15};
        List<String> ranges = solution.summaryRanges(nums1);

        System.out.println(ranges);


    }
}