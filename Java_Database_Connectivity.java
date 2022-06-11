import java.sql.*;
class JDBCTest{
   public static void main(String args[])
   {
     Connection con = null;

     //Registering Driver Class
     
     try
     {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("SUCCESS!!");
     }  
     catch(Exception e)
     {
        System.out.println(e);
     }
     
     //Creating Connection
     
     try
     {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cse1?autoReconnect=true&useSSL=false","root","gehu");
        System.out.println("Success!! Connection Established!!");
     }
     catch(Exception e)
     {
        System.out.println("Connection Not Established!!");
     }
     
     //Creating Statement
     try
     {
        Statement st=con.createStatement();
        System.out.println("Success!! Statement created!!");
        st.executeUpdate("insert into emp (id,name)values(7,'anshika')");
        System.out.println("Success!! Query Sent!!");
     }
     catch(Exception e)
     {
         System.out.println("Statement Not created!!");
     }
     
     //Execute queries
     
   }
}
