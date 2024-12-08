
package model;


import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MMenu {
    public void addmenu(int id,String name,String type,int stock,int price)
    {try{
    Statement st=RmDBConnection.createDBConnection().createStatement();
    int row_count=st.executeUpdate("insert into menu values('"+id+"','"+name+"','"+type+"','"+stock+"','"+price+"')");
    if(row_count>0)
    {
    JOptionPane.showMessageDialog(null, "DATA INSERTRED SUCCESSFULLY..!");
    }
    
    
    }
    catch(Exception e)
    {
        System.err.println(e.getMessage());
    }
    }
    
    public void updatemenu(int id,String name,String type,int stock,int price)
    {try{
    Statement st=RmDBConnection.createDBConnection().createStatement();
    int row_count=st.executeUpdate("Update menu set item_name ='"+name+"',type='"+type+"',stock='"+stock+"',price='"+price+"' where item_id='"+id+"'" );
    if(row_count>0)
    {
    //JOptionPane.showMessageDialog(null, "sunera");
    }
    }
    catch(Exception e)
    {
    }
    }
    
    public void deletemenu(int id,String name,String type,int stock,int price)
    {try{
    Statement st=RmDBConnection.createDBConnection().createStatement();
    int row_count=st.executeUpdate("Delete from menu where item_id='"+id+"'" );
    if(row_count>0)
    {
    //JOptionPane.showMessageDialog(null, "sunera");
    }
    }
    catch(Exception e)
    {
    }
    }
    
    

    
}
