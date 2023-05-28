public class problem67 {

    public static String addBinary(String a, String b) {

        StringBuilder results = new StringBuilder();
        String carry = "0";

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        while (aArray.length != bArray.length) {
            if (aArray.length > bArray.length) {
                char[] temp = new char[aArray.length];
                System.arraycopy(bArray, 0, temp, aArray.length - bArray.length, bArray.length);
                for (int i = 0; i < aArray.length - bArray.length; i++) {
                    temp[i] = '0';
                }
                bArray = temp;
            } else {
                char[] temp = new char[bArray.length];
                System.arraycopy(aArray, 0, temp, bArray.length - aArray.length, aArray.length);
                for (int i = 0; i < bArray.length - aArray.length; i++) {
                    temp[i] = '0';
                }
                aArray = temp;
            }
        }

        for (int i = aArray.length - 1; i >= 0; i--) {
            if ((aArray[i] == '1') && (bArray[i] == '1')) {

                if (carry == "1") {
                    results.insert(0, "1");
                    carry = "1";
                } else {
                    results.insert(0, "0");
                    carry = "1";
                }

            } else if (((aArray[i] == '1') && (bArray[i] == '0')) || ((aArray[i] == '0')
                    && (bArray[i] == '1'))) {

                if (carry == "1") {
                    results.insert(0, "0");
                    carry = "1";
                } else {
                    results.insert(0, "1");
                    carry = "0";
                }

            } else if ((aArray[i] == '0') && (bArray[i] == '0')) {

                if (carry == "1") {
                    results.insert(0, "1");
                    carry = "0";
                } else {
                    results.insert(0, "0");
                    carry = "0";
                }

            }

        }

        if (carry == "1") {
            results.insert(0, "1");
            return results.toString();
        } else {
            return results.toString();
        }

    }

    public static void main(String[] args) {

        String a1 = "11";
        String b1 = "1";

        String a2 = "1010";
        String b2 = "1011";

        System.out.println(addBinary(a1, b1)); // expected 100
        System.out.println(addBinary(a2, b2)); // expected 10101

    }

}
