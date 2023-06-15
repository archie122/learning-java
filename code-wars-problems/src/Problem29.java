import java.util.*;

public class Problem29 {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.merge(c, 1, Integer::sum);
        }
        return map;
    }
}
