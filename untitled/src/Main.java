import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String args[]){
        System.out.println("Hello World");
        DRoot(893982);
    }

    public static void DRoot(int x){
        int[] list;
        while (x > 0){
            System.out.print(x % 10 + " , ");
            x /= 10;
        }
    }


}