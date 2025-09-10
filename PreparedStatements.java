import java.sql.*;

public class PreparedStatements {
    public static void main(String[] args) throws SQLException{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skillupcoder","root","Suma@2207");
        String sql="insert into employee(emp_id,emp_name,emp_salary,designation)values(?,?,?,?)";
        PreparedStatement prep=con.prepareStatement(sql);
        prep.setInt(1,8797);
        prep.setString(2,"Sudha");
        prep.setInt(3,8500);
        prep.setString(4,"Hod");
        prep.executeUpdate();

        prep.setInt(1,8875);
        prep.setString(2,"Yamini");
        prep.setInt(3,7500);
        prep.setString(4,"Technical Trainer");
        prep.executeUpdate();
    }
}
