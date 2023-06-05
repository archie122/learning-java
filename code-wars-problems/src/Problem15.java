public class Problem15 {
    public static boolean isNarcissistic(int number) {
        int sum = 0;
        int numberCopy = number;
        int length = String.valueOf(number).length();
        while (number > 0) {
            sum += Math.pow((number % 10), length);
            number = number / 10;
        }

        return sum == numberCopy;
    }
}
