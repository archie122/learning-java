import java.math.BigInteger;

public class Problem49 {
    public static BigInteger perimeter(BigInteger n) {

        BigInteger x = BigInteger.valueOf(0);
        BigInteger y = BigInteger.valueOf(1);
        BigInteger z = BigInteger.valueOf(0);
        BigInteger result = BigInteger.valueOf(0);

        for (int i = 0; i < n.intValue() + 1; i++) {
            x = y;
            y = z;
            z = x.add(y);
            result = result.add(z);
        }

        return result.multiply(BigInteger.valueOf(4));
    }
}
