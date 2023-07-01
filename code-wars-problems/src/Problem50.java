public class Problem50 {
    public String[] rotate(String text) {
        String[] result = new String[text.length()];

        for (int i = 0; i < text.length(); i++) {
            text = text.substring(1) + text.charAt(0);
            result[i] = text;
        }
        return result;
    }
}
