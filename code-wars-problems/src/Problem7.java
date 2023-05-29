import java.util.Arrays;
import java.util.Collections;

public class Problem7 {
    public static int sortDesc(final int num) {
        String s = Integer.toString(num);
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        return Integer.parseInt(String.join("", arr));
    }
}
