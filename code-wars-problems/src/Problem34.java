import java.util.*;
public class Problem34 {
    public int sum(List<?> mixed) {
        int sum = 0;

        for (int i = 0; i < mixed.size(); i++) {
            if (mixed.get(i) instanceof String) {
                sum += Integer.parseInt((String) mixed.get(i));
            } else {
                sum += (Integer) mixed.get(i);
            }
        }

        return sum;
    }

}
