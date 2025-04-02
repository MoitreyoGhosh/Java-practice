import java.sql.*; // Required for JDBC classes like Connection and DriverManager

public class W10A3 {
    public static void main(String[] args) {
        try {

            // Set up a Connection reference to hold the database connection
            Connection conn = null;

            // JDBC URL string pointing to the SQLite database path
            String DB_URL = "jdbc:sqlite:/tempfs/studentdb";

            // This line sets a temporary directory for SQLite to avoid permission issues
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Establish a connection to the database using DriverManager.getConnection
            conn = DriverManager.getConnection(DB_URL);

            // If the connection is successful, conn.isValid(1) will return true
            System.out.println(conn.isValid(1));

            // Always close the connection after use
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}