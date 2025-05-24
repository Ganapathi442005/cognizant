import java.io.*;
import java.net.*;

public class TcpChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);
        System.out.println("Waiting for client...");
        Socket socket = server.accept();
        System.out.println("Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Client says: " + line);
            out.println("Echo: " + line);
            if (line.equalsIgnoreCase("bye")) break;
        }
        socket.close();
        server.close();
    }
}
