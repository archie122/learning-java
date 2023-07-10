public class Problem59 {
    public String decrypt(String encrypted, String password) {
        StringBuilder result = new StringBuilder();
        int length = password.length();
        int x = 1, y = 1, sum = x + y;

        for (int i = 2; i < length; i++) {
            int z = x + y;
            x = y;
            y = z;
            sum += z;
        }

        for (int i = 0; i < encrypted.length(); i++) {
            int temp = (int) encrypted.charAt(i);
            if (i % 2 == 0) {
                int temp2 = (temp - 97 - sum + 26) % 26 + 97;
                result.append((char) temp2);
            } else {
                int temp2 = (temp - 97 + sum) % 26 + 97;
                result.append((char) temp2);
            }
        }

        result.delete(result.length() - length, result.length());


        return result.reverse().toString();
    }
}
