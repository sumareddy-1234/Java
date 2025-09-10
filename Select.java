import java.sql.*;

public class Select {
    public static void main(String[] args) throws SQLException{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skillupcoder","root","Suma@2207");
        Statement stm=con.createStatement();
        if(con!=null)
        {
            System.out.println("Connected");
        }else{
            System.out.println("Not Connected");
        }
        String query="select*from employee";
        ResultSet res=stm.executeQuery(query);
        while(res.next()){
            //int id=res.getInt("Emp_id");
            System.out.println(res.getInt("Emp_id")+" "+res.getString("Emp_name")+" "+res.getInt("Emp_salary")+" "+res.getString("designation"));

        }
    }
}
