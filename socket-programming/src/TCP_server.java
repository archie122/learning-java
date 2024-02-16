import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP Server, the code was verified by all of our team members. We had some different problems with the code,
 * and we had different solutions to fix them. We looked at others code and found it very similar.
 */

public class TCP_server {
    public static void main (String argv[]) throws Exception {
        String selected_Word;
        int port = 6789;
        ServerSocket welcomeSocket = new ServerSocket(port);
        String result = "";

        System.out.println("Server listing on port : " + port);

        while (true) {
            Socket connectionSocket = welcomeSocket.accept();

            System.out.println("Successfully accepted a connection form client with the following IP and port : "
                + connectionSocket.getInetAddress()
                + " : "
                + connectionSocket.getPort()
            );

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            try {
                while (true) {
                    selected_Word = inFromClient.readLine();
                    try {
                        String filePath = "words.txt";
                        FileReader fileReader = new FileReader(filePath);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line;

                        while ((line = bufferedReader.readLine()) != null) {
                            if (line.toLowerCase().startsWith(selected_Word)) {
                                result += line + " , ";
                            }
                        }

                        bufferedReader.close();
                        fileReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    outToClient.writeBytes(result + '\n');
                    result = "";
                }
            } catch (Exception e) {
                System.out.println("Client Close Connection!");
            }
        }
    }
}