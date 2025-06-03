import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class display {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:/sqlite/cms.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT mobilenumber, usercode FROM users");

                // Display the results
                while (rs.next()) {
                    System.out.println("Mobile Number: " + rs.getString("mobilenumber") +
                                       ", User Code: " + rs.getString("usercode"));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}