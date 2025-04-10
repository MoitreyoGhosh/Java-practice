import java.sql.*;
public class W11A2 {
    public static void main(String args[]) {
        try {
            // Set SQLite temp directory (necessary in NPTEL environment)
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Connect to SQLite database file
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/tempfs/db");

            // Create a Statement object to run SQL queries
            Statement stmt = conn.createStatement();

            // Create the table if it does not already exist
            String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
            stmt.executeUpdate(CREATE_TABLE_SQL);

            // Clean up old data and insert one row
            stmt.executeUpdate("DELETE FROM players");
            stmt.executeUpdate("INSERT INTO players VALUES(2, 'John', 'Mayer', 22)");

            // Prepare SQL update query with placeholders ( ? )
            String sql = "UPDATE players SET Age = ? WHERE UID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set the first placeholder to the new age
            pstmt.setInt(1, 23);
            // Set the second placeholder to the UID of the player to be updated
            pstmt.setInt(2,2);
            // Execute the update command
            pstmt.executeUpdate();

            // Check the updated row by selecting and printing it
            ResultSet rs = stmt.executeQuery("SELECT * FROM players WHERE UID = 2");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " +
                        rs.getString(2) + "  " +
                        rs.getString(3) + "  " +
                        rs.getInt(4));
            }

            // Close the connection
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}