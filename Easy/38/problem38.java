public class problem38 {

    public static int searchInsert(int[] nums, int target) {

        int lastElement = nums[nums.length - 1];
        int results = 0;

        if (target > lastElement) {
            results = nums.length;

        } else {

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == target) {
                    results = i;
                    break;
                }

                if (target > nums[i] && target < nums[i + 1]) {
                    results = i + 1;
                    break;
                }

            }

        }

        return results;
    }

    public static void main(String[] args) {

        int[] array1 = { 1, 3, 5, 6 };
        int[] array2 = { 1, 3, 5, 6 };
        int[] array3 = { 1, 3, 5, 6 };

        searchInsert(array1, 5);
        searchInsert(array2, 2);
        searchInsert(array3, 7);

    }

}
