import java.sql.*;
public class W10A2{
    public static void main(String[] args) {
        try {

            // Load the JDBC driver class for SQLite using Class.forName
            Class.forName("org.sqlite.JDBC");

            System.out.println(true);

        } catch (Exception e) {
            // If there is any error in loading the driver, this line will execute.
            System.out.println(false);
        }
    }
}
