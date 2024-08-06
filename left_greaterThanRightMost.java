import java.util.*;

class left_greaterThanRightMost {
    public static void main(String[] args) {
        int[] nums = { 8, 10, 6, 2, 9, 7 };
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > max) {
                count++;
                max = nums[i];
            }
        }
        System.out.println(count);
    }
}
