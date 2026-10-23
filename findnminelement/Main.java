package findnminelement;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Integer> kthMin = solution.findKthMin(new int[]{12, 34, 33, 2, 1, 2, 4, 5, 6, 7, 8, 3, 1, 2, 3, 4, 5, 666, 777, 555}, 3);
        System.out.println(kthMin);


    }
}