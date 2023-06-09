public class Problem19 {
    public static final int[][] makeLatinSquare(int n) {
        int[][] latinSquare = new int[n][n];
        for(int y = 0; y < n; y++) {
            for(int x = 0; x < n; x++) {
                latinSquare[y][x] = (y + x) % n + 1;
            }
        }
        return latinSquare;
    }
}
