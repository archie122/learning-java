public class Problem53 {
    public static long[] powersOfTwo(int n){
        long[] result = new long[n + 1];
        for (int i = 0; i < n + 1; i++) {
            result[i] = (long) Math.pow(2, i);
            System.out.println(result[i]);
        }

        return result;
    }
}
