
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class db_connectivity {
    
    public Connection connectDb() {
    
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/voting_db", "root", "root");
            JOptionPane.showMessageDialog(null, "Successfully connected to the database!");
            return conn;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return null;
        
    }
    
}
