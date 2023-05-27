public class Problem4 {
    public String dnaToRna(String dna) {
        char[] dnaArray = new char[dna.length()];
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'T') {
                dnaArray[i] = 'U';
            } else dnaArray[i] = dna.charAt(i);
        }

        return new String(dnaArray);  // Do your magic!
    }
}
