import java.sql.*; // Required for JDBC classes
import java.util.*; // Required for Scanner input

public class W10A5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            // Read input values
            int roll = sc.nextInt();
            sc.nextLine(); // consume newline
            String name = sc.nextLine();

            // Set SQLite temp directory to avoid native driver errors in restricted environments
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Connect to SQLite database
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/tempfs/db");

            // Ensure the 'students' table exists (create it if it doesn't)
            Statement stmt = conn.createStatement();
            String createTableQuery = "CREATE TABLE IF NOT EXISTS students (roll INTEGER, name VARCHAR(30))";
            stmt.executeUpdate(createTableQuery);

            // SQL insert statement with placeholders
            String sql = "INSERT INTO students VALUES(?, ?)";

            // Prepare the SQL statement
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set values to the placeholders
            pstmt.setInt(1, roll);     // First '?' is replaced with roll number
            pstmt.setString(2, name);  // Second '?' is replaced with name

            // Execute the insert operation using the PreparedStatement
            pstmt.executeUpdate();

            // If insert is successful, print a confirmation message
            System.out.println("inserted");

            // Close resources after use
            pstmt.close();
            conn.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
