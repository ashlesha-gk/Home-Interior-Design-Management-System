package home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeInteriorDatabase {

    public static void main(String[] args) {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HomeInterior", "root", "mysqldbms04");
            
            // Print connection status
            System.out.println("Connection established: " + con);
            
            // Close connection
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HomeInteriorDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
