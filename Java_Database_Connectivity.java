import java.sql.*;
class JDBCTest{
   public static void main(String args[])
   {
     Connection con = null;
     Statement st = null;
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
        st=con.createStatement();
        System.out.println("Success!! Statement created!!");
        st.executeUpdate("insert into emp (id,name)values(7,'anshika')");
        st.executeUpdate("insert into emp (id,name)values(16,'deeksha')");
        st.executeUpdate("insert into emp (id,name)values(21,'bhavya')");
        st.executeUpdate("insert into emp (id,name)values(42,'prakhar')");
        st.executeUpdate("insert into emp (id,name)values(43,'pranjali')");
        
        System.out.println("Success!! Query Sent!!");
     }
     catch(Exception e)
     {
         System.out.println("Statement Not created!!");
     }
     
     //Executing ResultSet commands  --  Displaying data from database
     try
     {
         ResultSet rs = st.executeQuery("select * from emp");
         while(rs.next())
         {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
         }
     }
      catch(Exception e)
     {
         System.out.println("ResultSet Commands failed!!");
     }
   }
}
