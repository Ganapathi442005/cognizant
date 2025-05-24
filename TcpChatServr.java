import java.io.*;
import java.net.*;

public class TcpChatServr {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server started. Waiting for client...");
        
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected: " + clientSocket.getInetAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String message;
        while ((message = in.readLine()) != null) {
            System.out.println("Received from client: " + message);
            out.println("Server echoes: " + message);
            if ("bye".equalsIgnoreCase(message.trim())) {
                break;
            }
        }
        
        System.out.println("Client disconnected.");
        clientSocket.close();
        serverSocket.close();
    }
}
