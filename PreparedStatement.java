import java.sql.*;
class JDBCTest2{
   public static void main(String args[])
   {
     Connection con = null;
     PreparedStatement ps = null;
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
        ps=con.prepareStatement("insert into emp (id,name)values(?,?)");
        System.out.println("Success!! Statement created!!");
        
        ps.setInt(1,Integer.parseInt(args[0]));
        ps.setString(2,args[1]);
        ps.executeUpdate();
      
     }
     catch(Exception e)
     {
         System.out.println("Statement Not created!!");
     }
     
     //Executing ResultSet commands
     try
     {
         ResultSet rs = ps.executeQuery("select * from emp");
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
