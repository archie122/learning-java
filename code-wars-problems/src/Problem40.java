import java.util.*;

public class Problem40 {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder sb = new StringBuilder();
        for (Integer integer : binary) sb.append(integer);

        return Integer.parseInt(sb.toString(), 2);
    }
}
