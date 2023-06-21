import java.util.*;

public class Problem36 {
    public static int duplicateCount(String text) {
        String textCopy = text.toLowerCase();

        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

        for (int i = 0; i < textCopy.length(); i++) {
            char currentChar = textCopy.charAt(i);

            if (uniqueChars.contains(currentChar)) {
                duplicateChars.add(currentChar);
            } else {
                uniqueChars.add(currentChar);
            }
        }

        return duplicateChars.size();
    }

}
