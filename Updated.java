import java.sql.*;
public class Updated {
    public static void main(String[] args) throws SQLException{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skillupcoder","root","Suma@2207");
        Statement stm=con.createStatement();
        if(con!=null)
        {
            System.out.println("Connected");
        }else{
            System.out.println("Not Connected");
        }
        String query="update employee set Emp_salary=50000 where Emp_id=4348";
        stm.executeUpdate(query);
        System.out.println("Data Updated Successfully");
    }
    
}
