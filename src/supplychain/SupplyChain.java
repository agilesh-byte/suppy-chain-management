package supplychain;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class SupplyChain {

   
    public static Connection connectDb() {
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/supplychain","root","");
          System.out.println("Database Connected");
          return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
