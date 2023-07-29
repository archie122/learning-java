public class Problem70 {
    public static int howOld(final String herOld) {
        String[] list = herOld.split(" ");
        int age = Integer.parseInt(list[0]);
        return age;
    }
}
