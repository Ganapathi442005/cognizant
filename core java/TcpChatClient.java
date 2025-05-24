import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TcpChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to server.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.print("Enter message (type 'bye' to quit): ");
            userInput = scanner.nextLine();
            out.println(userInput);

            if ("bye".equalsIgnoreCase(userInput.trim())) {
                break;
            }

            String response = in.readLine();
            System.out.println("Server response: " + response);
        }

        socket.close();
        scanner.close();
    }
}
