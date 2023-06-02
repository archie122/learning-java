import java.util.*;

public class Problem12 {
    public static long digPow(int n, int p) {
        int nCopy = n;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int result = 0;

        while(nCopy != 0){
            list.add(nCopy % 10);
            nCopy /= 10;
        }
        Collections.reverse(list);
        for (Integer integer : list) {
            result += Math.pow(integer, p);
            p++;
        }

        int div = result / n;
        if (result % n == 0) {
            return div;
        } else {
            return -1;
        }
    }
}
