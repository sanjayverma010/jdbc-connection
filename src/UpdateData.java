import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_db",
                    "root",
                    "sanjay@2004");

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE register SET city = ? WHERE yname = ?");

            ps.setString(1, "Agra");
            ps.setString(2, "Shivani");

            int rows = ps.executeUpdate();

            System.out.println(rows + " record updated");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}