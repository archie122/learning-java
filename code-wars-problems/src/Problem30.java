import java.util.*;

public class Problem30 {
    public static int[] between(int a, int b) {
        int distance = b - a;
        int[] arr = new int[distance + 1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            list.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
