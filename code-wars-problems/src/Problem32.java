public class Problem32 {
    public static String abbrevName(String name) {
        String [] split = name.split(" ");
        return split[0].toUpperCase().charAt(0) + "." + split[1].toUpperCase().charAt(0);
    }
}
