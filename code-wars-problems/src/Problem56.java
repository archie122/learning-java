import java.util.ArrayList;

public class Problem56 {
    public static int findEvenIndex(int[] arr) {
        int sum = 0;
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];

            if (leftSum == sum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }
}
