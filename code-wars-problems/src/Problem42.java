public class Problem42 {
    public static String rangeExtraction(int[] arr) {
        String result = "";
        String temp = "";

        for (int i = 0; i < arr.length; i++) {

            if(i == arr.length - 1) {
                break;
            } else {
                if(arr[i] + 1 == arr[i + 1]){
                    temp += arr[i];
                    System.out.println(temp);
                    continue;
                } else if (arr[i] + 1 > arr[i + 1]){
                    result += temp;
                    temp = "";
                }
            }

            result += arr[i];
        }

        return result;
    }
}
