public class problem69 {

    public static double mySqrt(int x) {

        double x0 = 1.0;
        double xGuess;

        while (true) {
            xGuess = (x0 + (x / x0)) / 2;

            if (Math.abs(xGuess - x0) < 0.0001) {
                break;
            }

            x0 = xGuess;
        }

        double squareRoot = xGuess;
        int roundedDown = (int) Math.floor(squareRoot);

        return roundedDown;

    }

    public static void main(String[] args) {

        int x1 = 4;
        int x2 = 8;

        mySqrt(x1);
        mySqrt(x2);
    }
}
