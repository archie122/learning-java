import java.util.*;

public class Problem54 {
    public static int[] pipeFix(int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();
        int x = numbers[0];

        for (int i = x; i <= numbers[numbers.length - 1]; i++) {
            list.add(i);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
            System.out.println(result[i]);
        }

        return result;
    }
}
