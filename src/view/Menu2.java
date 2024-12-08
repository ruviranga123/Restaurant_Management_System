
package view;

public class Menu2 {
    private int item_id,stock,price;
    private String item_name,type;
    
    public Menu2(int item_id,int stock,int price,String item_name,String type){
    this.item_id=item_id;
    this.price=price;
    this.stock=stock;
    this.item_name=item_name;
    this.type=type;
    }
    public int getid(){
    return item_id;
    }
    public int getstock(){
    return stock;
    }
    public int getprice(){
    return price;
    }
    public String getname(){
    return item_name;
    }
    public String gettype(){
    return type;
    }
}
