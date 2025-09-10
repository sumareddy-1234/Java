import java.sql.*;
public class JDBCExample1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws SQLException{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skillupcoder","root","Suma@2207");
        Statement stm=con.createStatement();
        if(con!=null)
        {
            System.out.println("Connected");
        }else{
            System.out.println("Not Connected");
        }
        String query="create table Employee(Emp_id int,Emp_name varchar(150),Emp_salary int,Designation varchar(150))";
        stm.executeUpdate(query);
        System.out.println("Table created Successfully");
    }
}
