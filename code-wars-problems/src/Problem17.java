public class Problem17 {
    public int GetSum(int a, int b) {
        int result = 0;

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            result += i;
        }

        return result;
    }
}
