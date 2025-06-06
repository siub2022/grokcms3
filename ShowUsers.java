import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowUsers {
    // Database credentials
    private static final String URL = "jdbc:postgresql://containers-us-west-123.railway.app/mydatabase";
    private static final String USER = "POSTGRES_USER";
    private static final String PASSWORD = "lywuUzpwKFNHjQzucwzVvNMrERhQcVDH";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {

            System.out.println("User List:");
            System.out.println("==========================");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("--------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
