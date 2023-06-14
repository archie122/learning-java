import java.util.*;

public class Problem23 {
    public static String vaporcode(String s) {
        String[] arr = s.replaceAll("\\s", "").split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i].toUpperCase() + "  ");
        }

        return sb.toString().trim();
    }
}