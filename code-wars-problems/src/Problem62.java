import java.util.regex.*;
public class Problem62 {
    public static int noBoringZeros(int n) {
        boolean istrue = true;
        while (istrue){
            if (Integer.toString(n).endsWith("0")) {
                n /= 10;
            } else {
                istrue = false;
            }
        }
        
        return n; 
    }
}
