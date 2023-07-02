import java.math.*;
import java.util.*;


public class Problem51 {
    public static BigInteger perimeter(BigInteger n){
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        } else if (n.equals(BigInteger.ONE)) {
            return BigInteger.valueOf(4);
        }

        BigInteger x = BigInteger.valueOf(0);
        BigInteger y = BigInteger.valueOf(1);
        BigInteger z = BigInteger.valueOf(0);
        BigInteger result = BigInteger.valueOf(0);

        ArrayList<BigInteger> list = new ArrayList<BigInteger>();

        for (int i = 0; i < n.intValue() + 1; i++){
            x = y;
            y = z;
            z = x.add(y);
            list.add(z);
        }

        result = result.add(list.get(list.size() - 1)).add(list.get(list.size() - 2)).add(list.get(list.size() - 2)).add(list.get(list.size() - 3));



        return result.multiply(BigInteger.valueOf(2));
    }
}
