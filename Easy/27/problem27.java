import java.util.Arrays;

public class problem27 {

    public static int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val) {
                nums[i] = 101;
            } else {
                continue;
            }

        }
        Arrays.sort(nums);

        for (int i : nums) {

            if (i != 101) {

                k += 1;
            }
        }

        return k;

    }

    public static void main(String[] args) {

        int[] array1 = { 3, 2, 2, 3 };
        int[] array2 = { 0, 1, 2, 2, 3, 0, 4, 2 };

        removeElement(array1, 3); // should return 2
        removeElement(array2, 2); // should return 5

    }
}
