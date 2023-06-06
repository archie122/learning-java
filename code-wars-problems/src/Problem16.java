import java.text.DecimalFormat;

public class Problem16 {
    public static String seriesSum(int n) {
        double x = 4;
        double sum = 1;
        for (int i = 1; i < n; i++) {
            sum += 1/x;
            x += 3;
        }
        double roundOff = (double) Math.round(sum * 100) / 100;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(roundOff);
    }
}
