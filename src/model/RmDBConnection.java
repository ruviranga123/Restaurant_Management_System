
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class RmDBConnection {
    private static Connection con;
    public static Connection createDBConnection()
    {
        try{
        String dbloc="jdbc:mysql://localhost:3306/rm";
        con=DriverManager.getConnection(dbloc,"root","");
        
        
        }
        catch(SQLException e)
        {
        System.err.println(e.getMessage());
        }
        return con;
    
    }
}
