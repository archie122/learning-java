public class Problem58 {
    public static int rowSumOddNumbers(int n) {
        int result = (n * (n + 1)) / 2;
        int odd = 1;
        int sum = 0;

        if(n == 0) return 0;
        if(n == 1) return 1;

        for (int i = 1; i < result; i++) {
            odd += 2;

            if (i >= (result - n) ){
                sum += odd;
            }
        }

        return sum;
    }
}
