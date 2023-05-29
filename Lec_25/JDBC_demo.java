package Lec_25;
import java.sql.*;
public class JDBC_demo {
    public static void main(String[] args) throws ClassNotFoundException {
        //STEP 1:LOAD DRIVER CLASS
        String driveClassName="sun.jdbc.odbc.JdbcOdbcDriver";

        Class.forName(driveClassName);
        try{
            //STEP 2:Obtain a connection
            String url="jdbc:mysql://localhost:3306/hellodb";
            String username="root";
            String password="abc100@";
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connection successful");
            //STEP 3:Obtain a statement

            Statement st=con.createStatement();
            //STEP 4:Execute a query
            String query1="select * from customers";
            System.out.println("Data extracted");
            //STEP 5:Connection close
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
