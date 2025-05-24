import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Change to your DB URL
        String user = "root";
        String pass = "password"; // Change to your password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL driver
            Connection conn = DriverManager.getConnection(url, user, pass);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, name FROM students");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("name"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
