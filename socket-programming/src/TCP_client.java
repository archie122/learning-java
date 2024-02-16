import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCP_client {
    public static void main (String argv[]) throws Exception {
        String senetence;
        String modifiedSentence;
        int port = 6789;

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        Socket clientSocket = new Socket("localhost", port);

        System.out.println("Client Successfully connected to server at IP:port : "
            + clientSocket.getInetAddress()
            + ":"
            + clientSocket.getPort()
        );

        System.out.println("Enter a word to search: ");

        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        senetence = inFromUser.readLine().toLowerCase();

        while (senetence.toLowerCase().compareTo("exit") != 0) {
            outToServer.writeBytes(senetence + '\n');

            modifiedSentence = inFromServer.readLine();

            System.out.println("The following words start with " + senetence + " : " + modifiedSentence);

            senetence = inFromUser.readLine();

        }



        clientSocket.close();
    }
}
