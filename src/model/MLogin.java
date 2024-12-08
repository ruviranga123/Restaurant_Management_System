
package model;

import java.sql.*;
import javax.swing.JOptionPane;
import view.HomePage;



public class MLogin {
   ResultSet rst;
  public ResultSet login(String username,String password)
  {   try{
      Statement st=RmDBConnection.createDBConnection().createStatement();
      rst=st.executeQuery("select * from login where username='"+username+"' and password='"+password+"'");
      
      if(rst.next()){
       HomePage hp=new HomePage();
       hp.setVisible(true);
            
      }
      else if(username.isEmpty() || password.isEmpty())
      {
      JOptionPane.showMessageDialog(null, "Username / Password should not be empty", "Error",JOptionPane.ERROR_MESSAGE);
      }
      else
      {
      JOptionPane.showMessageDialog(null, "Username / password is invalide", "Error",JOptionPane.ERROR_MESSAGE);
      }
      
      }
      catch(Exception e)
      {System.err.println(e.getMessage());
      }
  return rst;
    
    
}
}
