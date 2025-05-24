import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            if (id == -1) break;
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            map.put(id, name);
        }
        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();
        String result = map.get(searchId);
        if (result != null) System.out.println("Name: " + result);
        else System.out.println("ID not found.");
    }
}
