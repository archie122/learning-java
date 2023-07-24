public class Problem68 {
    public static String reverseWords(final String original) {
        String[] words = original.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(reverse(word)).append(" ");
            } else {
                // If the word is empty, add the appropriate number of spaces back.
                int spacesToAdd = countSpaces(original);
                for (int i = 0; i < spacesToAdd; i++) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString().trim();
    }

    public static String reverse(final String original) {
        return new StringBuilder(original).reverse().toString();
    }

    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

}
