import java.util.*;
public class Problem25 {
    public static String order(String words) {
        String[] arr = words.split(" ");
        Map<Integer, String> map = new TreeMap<>();

        for (String word : arr) {
            int number = findInteger(word);
            map.put(number, word);
        }

        StringBuilder orderedWords = new StringBuilder();

        for (String word : map.values()) {
            orderedWords.append(word).append(" ");
        }

        return orderedWords.toString().trim();
    }

    public static int findInteger(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return Character.getNumericValue(c);
            }
        }
        return -1;
    }

}
