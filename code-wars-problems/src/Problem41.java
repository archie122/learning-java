public class Problem41 {
    public static int grow(int[] x){
        int result = 1;

        for (int j : x) result *= j;

        return result;
    }
}
