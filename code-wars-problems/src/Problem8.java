import java.lang.Math;
public class Problem8 {
    public static int[] squareOrSquareRoot(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            if (Math.sqrt(array[i]) % 1 == 0){
                newArray[i] = (int) Math.sqrt(array[i]);
            } else {
                newArray[i] = array[i] * array[i];
            }
        }
        return newArray;
    }
}
