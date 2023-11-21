public class Problem72 {
    public static String greet(String name){
        return "Hello " + name.toUpperCase().charAt(0) + name.substring(1).toLowerCase() + "!";
    }
}
