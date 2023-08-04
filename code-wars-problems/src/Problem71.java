import java.util.ArrayList;

public class Problem71{
    public static String[] dirReduc(String[] arr) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "NORTH") {
                y++;
            } else if (arr[i] == "SOUTH") {
                y--;
            } else if (arr[i] == "EAST") {
                x++;
            } else if (arr[i] == "WEST") {
                x--;
            }

            System.out.println(arr[i]);
        }

        System.out.println(x + " " + y);

        ArrayList <String> result = new ArrayList<>();

        if (x < 0) {
            result.add("WEST");
        } else if (x > 0) {
            result.add("EAST");
        }

        if (y > 0) {
            result.add("NORTH");
        }  else if (y < 0) {
            result.add("SOUTH");
        }

        System.out.println(result.size());

        return result.toArray(new String[0]);

    }

}
