public class Problem61 {
    public static String solve(final String str) {
        int length = str.length();
        int upper = 0, lower = 0;

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upper++;
            } else {
                lower++;
            }
        }

        if (upper > lower) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }
}
