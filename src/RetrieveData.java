import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveData {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_db",
                    "root",
                    "sanjay@2004");

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM register");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("yname : " + rs.getString("yname"));
                System.out.println("Gmail : " + rs.getString("gmail"));
                System.out.println("Gender : " + rs.getString("gender"));
                System.out.println("City : " + rs.getString("city"));
                System.out.println("----------------------");
            
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}