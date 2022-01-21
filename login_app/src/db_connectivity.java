
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class db_connectivity {
    
    Connection connectDb() {
        
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/loginDb", "root", "root");
            JOptionPane.showMessageDialog(null, "SUCCESSFULLY CONNECTED!");
            return conn;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return null;
        
    }
    
}
