import java.sql.*;

public class Delete {
    public static void main(String[] args) throws SQLException{
        Connection con=DriverManager.getConnection(q);
        Statement stm=con.createStatement();
        if(con!=null)
        {
            System.out.println("Connected");
        }else{
            System.out.println("Not Connected");
        }
        String query="delete from employee where Emp_id=4348";
        stm.executeUpdate(query);
        System.out.println("Data Deleted Successfully");
    }
}
