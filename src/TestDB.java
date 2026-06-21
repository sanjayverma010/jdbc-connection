import java.sql.Connection;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestDB {
    public static void main(String[] args) {
        String name = "good";
        String mail = "good@gmail.com";
        String Gender = "m";
        String city = "Harda";
        
     //    Scanner sc = new Scanner(System.in);
        
        
        
       //  String good;
		
        
       //  Class.forName("com.mysql.cj.jdbc.Driver");
        // System.out.println("connection build suscessfully");

        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "sanjay@2004");
            System.out.println("connection sucssesfull");

            // PreparedStatement ps= con.prepareStatement("insert into register values('sanjay','sanjay@gmail.com','M','harda')");
            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?)");
            ps.setString(1,name);
            ps.setString(2,mail);
            ps.setString(3,Gender);
             ps.setString(4,city);
            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("sucsessfully update");
            } else {
                System.out.println("faile");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
