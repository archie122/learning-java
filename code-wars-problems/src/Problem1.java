// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Problem1 {
    public static int DRoot(int x) {
        if (x < 10) {
            return x;
        }

        int result = 0;

        while (x > 0) {
            result += x % 10;
            x /= 10;
        }

        return DRoot(result);
    }

}