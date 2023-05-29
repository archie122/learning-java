public class Problem5 {
    public static long conjecture(long x) {
        long count = 1;
        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
                count++;
            } else if (x % 2 == 1) {
                x = x * 3 + 1;
                count++;
            } else {
                break; // Add a termination condition for non-conforming values
            }
        }
        return count;
    }

}
