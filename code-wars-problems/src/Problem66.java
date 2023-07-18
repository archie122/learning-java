public class Problem66 {
    public static int [][] multiplicationTable(int n){
        int [][] table = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                table[j][i] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}

//[[1,2,3],
// [2,4,6],
// [3,6,9]]