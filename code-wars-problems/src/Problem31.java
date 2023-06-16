public class Problem31 {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) array[i] = array[i] * -1;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        return array;
    }
}
