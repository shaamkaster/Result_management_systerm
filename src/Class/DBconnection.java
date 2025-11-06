package Class;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


public class DBconnection {
         public Connection connect(){
        
         Connection con = null;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/result?autoReconnect=false&useSSL=false", "root", "");
            System.out.println(" Database connected ");
            JOptionPane.showMessageDialog(null, "Database is Connected", null, 1);
            
        } catch (Exception e) {
            System.out.println(e+"bllo");
            JOptionPane.showMessageDialog(null, " Database is Not Connected -> / "+e, null, 1);
            
        }
        
    
    
        return con;
    }
}
