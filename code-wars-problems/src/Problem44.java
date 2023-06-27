public class Problem44 {
    public static String camelCase(String input) {
        String output = input.replaceAll("([A-Z])", " $1");
        return output;
    }
}
