public class Problem67 {
    public static int roundToNext5(int number) {
        int result = 0;

        while (true) {
            if (number < 0) {
                if (result <= number) {
                    return result;
                } else {
                    result -= 5;
                }
            } else {
                if (result >= number) {
                    return result;
                } else {
                    result += 5;
                }
            }
        }
    }
}
