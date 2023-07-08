public class Problem57 {
    public static String incrementString(String str) {
        String pattern = "\\d+";

        if (str.length() == 0) {
            return "1";
        } else if (str.matches(pattern)) {
            return String.format("%0" + str.length() + "d", Integer.parseInt(str) + 1);
        }

        String[] parts = str.split("(?<=\\D)(?=\\d)");
        int numericPart = Integer.parseInt(parts[1]) + 1;
        String formattedNumericPart = String.format("%0" + parts[1].length() + "d", numericPart);
        return parts[0] + formattedNumericPart;
    }

}
