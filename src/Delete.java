import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) throws ClassNotFoundException {

        String Gmail = "good@gmail.com";

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Connection build");

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_db",
                    "root",
                    "sanjay@2004");

            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM register WHERE Gmail = ?");

            ps.setString(1, Gmail);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record deleted");

            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}