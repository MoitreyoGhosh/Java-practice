// Add the necessary import statements below so that the program can compile and connect to a database using JDBC.import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
public class W10A1 {
    public static void main(String args[]){
        try {
            Connection conn = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Try to connect to the database
            conn = DriverManager.getConnection(DB_URL);
            System.out.print(conn.isValid(1));

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
