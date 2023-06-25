public class Problem43 {
    public static int zeros(int n) {
        int zeros = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            zeros += n / i;
        }
        return zeros;
    }

}
