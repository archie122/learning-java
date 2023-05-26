public class Problem2 {
    public static boolean isValid(char[] walk) {
        int COUNTx = 0;
        int COUNTy = 0;

        if (walk.length == 10) {
            for (int i = 0; i < 10; i++) {
                switch (walk[i]) {
                    case 'n' -> COUNTx++;
                    case 'e' -> COUNTy++;
                    case 's' -> COUNTx--;
                    case 'w' -> COUNTy--;
                }
            }

            return COUNTx == 0 && COUNTy == 0;
        }
        return false;
    }

}
