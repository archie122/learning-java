import java.util.ArrayList;

public class Problem55 {
    public static String[] solution(String s) {
        if(s.length() % 2 != 0) {
            s = s + "_";
        }

        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < s.length(); i += 2) {
            result.add(s.substring(i, i + 2));
        }

        return result.toArray(new String[0]);
    }
}
