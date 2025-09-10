import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.Statement; // Importing the Statement class

class DataBase
{
    public static void main(String args[])  {
        Connection con = null; // Declare Connection outside the try block
        Statement stm = null;  // Declare Statement outside the try block
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skillupcoder", "root", "Suma@2207");
            if (con != null)
                System.out.println("Connected");
            else
                System.out.println("Failed to connect");

            stm = con.createStatement(); // Use the declared Statement object
            String query = "CREATE TABLE student(stu_name VARCHAR(50), stu_id INT)";
            stm.executeUpdate(query);
            System.out.println("Table Created Successfully");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // Close resources in the finally block
            try {
                if (stm != null) stm.close();
                if (con != null) con.close();
            } catch (Exception e) {
                System.out.println("Error closing resources: " + e);
            }
        }
    }
}

