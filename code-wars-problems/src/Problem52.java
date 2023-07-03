import java.util.*;

public class Problem52 {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        int[] sortedB = Arrays.copyOf(b, b.length);
        Arrays.sort(sortedB);

        for (int i = 0; i < a.length; i++) {
            if ((long) a[i] * a[i] != sortedB[i]) {
                return false;
            }
        }

        return true;
    }
}
