
package model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Date;


public class MInvoice {
    ResultSet rst;
    public ResultSet searchitem(String id)
  {   try{
      Statement st=RmDBConnection.createDBConnection().createStatement();
      rst=st.executeQuery("select * from menu where item_id='"+id+"'");
      }
      catch(Exception e)
      {System.err.println(e.getMessage());
      }
  return rst;
  }
    
    public ResultSet incrementalinno()
  {   try{
      Statement st=RmDBConnection.createDBConnection().createStatement();
      rst=st.executeQuery("select MAX(invoice_No) from payment");
      
      
      
      }
      catch(Exception e)
      {System.err.println(e.getMessage());
      }
  return rst;
  }
    
    public void addpayment(String inno,String date,String type,int amount)
    {try{
    Statement st=RmDBConnection.createDBConnection().createStatement();
    int row_count=st.executeUpdate("insert into payment values('"+inno+"','"+date+"','"+type+"','"+amount+"')");
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
}
