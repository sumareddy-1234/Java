import java.sql.*;

public class JDBCInsertion {
    public static void main(String[] args) throws Exception {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Suma","root","Suma@2207");
        //Statement stm=con.createStatement();
        if(con!=null){
            System.out.println("connected");
        }
        else{
            System.out.println("not connected");
        }
        tring query="create table Employee(Emp_id int,Emp_name varchar(150),Emp_salary int,Designation varchar(150))";
        String query="insert into Employee values(5646,'ram',20000,'tech trainer')";
        String query="insert into Employee values(4634,'ajay',3500,'tech mentor')";
        String query="insert into Employee values(6757,'vinod',8000,'tech trainer')";
        String query="update employee set Emp_salary=50000 where Emp_id=4634";
        String query="delete from employee where Emp_id=5646";
        String query="delete from employee where Emp_id=6757";
        String query="insert into Employee values(6757,'vinod',8000,'tech trainer')";
        String query="insert into Employee values(5646,'ram',20000,'tech trainer')";
        stm.executeUpdate(query);
        stm.executeUpdate(query);
        System.out.println("table created successfully");
        System.out.println("data inserted successfully");
        //String query="select * from employee";
      ResultSet res=stm.executeQuery(query);
      while(res.next()){
        System.out.println(res.getInt("Emp_id")+" "+res.getString("Emp_name")+" "+res.getInt("Emp_salary")+" "+res.getString("designation"));
      }
    }
}