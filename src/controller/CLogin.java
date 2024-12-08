
package controller;
import java.sql.ResultSet;
import model.MLogin;
public class CLogin {
    public ResultSet login(String username,String password)
    {
        MLogin msc=new MLogin();
        ResultSet rst=msc.login(username,password);
        return rst;
    }
}
