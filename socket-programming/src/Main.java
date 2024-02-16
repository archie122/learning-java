import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search: ");
        String result = "";
        String word = input.nextLine();
        input.close();

        try {
            String filePath = "words.txt";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;


            while ((line = bufferedReader.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    result += line + "\n";
                }
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (result.equals("")) {
            System.out.println("No results found");
        }

        System.out.println(result);

    }
}