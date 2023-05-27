import java.util.ArrayList;

public class problem26 {

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> non_dub = new ArrayList<>();
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (non_dub.contains(nums[i])) {
                continue;
            } else {
                non_dub.add(nums[i]);
            }

        }

        k = non_dub.size();

        for (int i = 0; i < nums.length; i++) {
            if (i < non_dub.size()) {
                nums[i] = non_dub.get(i);
            } else {
                nums[i] = -1;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] array1 = { 1, 1, 2 };
        int[] array2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        removeDuplicates(array1);
        removeDuplicates(array2);

    }
}