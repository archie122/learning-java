
public class Problem22 {
    public static String accum(String s) {
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            String repeatedChar = arr[i].repeat(i+1).toLowerCase();
            sb.append(repeatedChar.substring(0, 1).toUpperCase() + repeatedChar.substring(1));

            if (i < arr.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
