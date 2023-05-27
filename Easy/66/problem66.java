import java.math.BigInteger;

public class problem66 {

    public static int[] plusOne(int[] digits) {

        StringBuilder digitNum = new StringBuilder();

        for (int i : digits) {
            digitNum.append(i);
        }

        // Long number = Long.parseLong();
        BigInteger number = new BigInteger(digitNum.toString());
        BigInteger numberPlusOne = number.add(BigInteger.ONE);

        String numberStr = String.valueOf(numberPlusOne);

        char[] newNumberDigits = numberStr.toCharArray();
        int[] results = new int[newNumberDigits.length];

        for (int i = 0; i < results.length; i++) {

            results[i] = Character.getNumericValue(newNumberDigits[i]);

        }

        return results;

    }

    public static void main(String[] args) {

        int[] digits1 = { 1, 2, 3 };
        int[] digits2 = { 4, 3, 2, 1 };
        int[] digits3 = { 9 };
        int[] digits4 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] digits5 = { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0,
                1, 1, 1, 7, 4, 0, 0, 6 };

        plusOne(digits1);
        plusOne(digits2);
        plusOne(digits3);
        plusOne(digits4);
        plusOne(digits5);

    }

}
