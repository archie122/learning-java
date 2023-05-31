public class Problem9 {
    public double[] tribonacci(double[] s, int n) {
        double[] result = new double[n];
        result[0] = s[0];
        result[1] = s[1];
        result[2] = s[2];
        for(int i = 3; i < n; i++){
            result[i] = result[i-1] + result[i-2] + result[i-3];
        }
        return result;
    }
}
