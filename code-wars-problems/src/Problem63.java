public class Problem63 {
    public static char findMissingLetter(char[] array) {
        int startingIndex = (int) array[0];
        char missingChar;
        for (int i = 0; i <= array.length; i++) {
            if(startingIndex != (int) array[i]) {
                missingChar = (char) (startingIndex);
                return missingChar;
            } else {
                startingIndex++;
            }
        }

        return ' ';
    }
}
