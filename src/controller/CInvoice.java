
package controller;

import java.sql.ResultSet;
import java.util.Date;
import model.MInvoice;
import java.util.Date;


public class CInvoice {
    public ResultSet searchitem(String id)
    {   MInvoice msc=new MInvoice();
        ResultSet rst=msc.searchitem(id);
        return rst;
    }
    
    public ResultSet incrementalinon() 
    {   MInvoice msc=new MInvoice();
        ResultSet rst=msc.incrementalinno();
        return rst;
    } 
    
    public void addpayment(String inno,String date,String type,int amount)
    {
    MInvoice mcus=new MInvoice();
    mcus.addpayment(inno,date,type,amount);
    }
}
