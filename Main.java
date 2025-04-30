import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://server;databaseName=Resturant;encrypt=true;trustServerCertificate=true";
        String user = "sa";
        String password = "password2310";

        // Use try-with-resources to automatically close resources
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement()) {

            String sql = "INSERT INTO Category (categoryName, status) VALUES (N'მარილი', 1)";
            st.executeUpdate(sql);

            System.out.println("inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
