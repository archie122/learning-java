public class Problem35 {
    public static String rot13(String message) {
        String messageCopy = message.toLowerCase();
        char[] charArray = messageCopy.toCharArray();
        char[] charArray2 = new char[charArray.length];
        boolean[] isCapitalized = new boolean[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);

            if (charArray[i] == ' ') {
                continue;
            } else {
                if (charArray[i] + 13 > 122) {
                    charArray2[i] = (char) (charArray[i] + 13 - 122 + 96);
                } else {
                    charArray2[i] = (char) (charArray[i] + 13);
                }
            }

            isCapitalized[i] = Character.isUpperCase(message.charAt(i));
        }

        for (int i = 0; i < charArray2.length; i++) {
            if (isCapitalized[i]) {
                charArray2[i] = Character.toUpperCase(charArray2[i]);
            }
        }

        return new String(charArray2);
    }

}
