
package controller;

import model.MMenu;
public class CMenu {
    public void addmenu(int id,String name,String type,int stock,int price)
    {
    MMenu mcus=new MMenu();
    mcus.addmenu(id,name,type,stock,price);
    }
    
    public void updatemenu(int id,String name,String type,int stock,int price)
    {
    MMenu mcus=new MMenu();
    mcus.updatemenu(id, name, type, stock, price);
    }
    
    public void deletemenu(int id,String name,String type,int stock,int price)
    {
    MMenu mcus=new MMenu();
    mcus.deletemenu(id, name, type, stock, price);
    }
    
   
}
