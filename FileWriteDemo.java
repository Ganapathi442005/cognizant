import java.util.*;
import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to write to file: ");
        String input = sc.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(input);
        }
        System.out.println("Data written to output.txt");
    }
}
