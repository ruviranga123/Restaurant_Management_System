/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CMenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.RmDBConnection;
import javax.swing.JOptionPane;
import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;






public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        show_menu();
        txt_in.setDocument(new Textlimit(10));
        txt_id.setDocument(new Textlimit(8));
        txt_pr.setDocument(new Textlimit(8));
        txt_st.setDocument(new Textlimit(8));
    }
    
    public class Textlimit extends PlainDocument{
    
    private int limit;
    
    public Textlimit(int limitation){
    
    this.limit=limitation;   
    }
    
    public void insertString(int offset,String str,AttributeSet set) throws BadLocationException{
    
    if(str == null){
    
    return;
    }else if((getLength()+str.length()<=limit)){
    
    str = str.toUpperCase();
    super.insertString(offset, str, set);
    }
    
    }
    
    }
    
    public ArrayList<Menu2> menuList(){
      ArrayList<Menu2> menuList=new ArrayList<>();
      try{
          String dbloc="jdbc:mysql://localhost:3306/rm";
        Connection con=DriverManager.getConnection(dbloc,"root","");
    Statement st=RmDBConnection.createDBConnection().createStatement();
    ResultSet rst=st.executeQuery("select * from menu");
    Menu2 menu1;
    while(rst.next())
        
    {
    menu1=new Menu2(rst.getInt("item_id"),rst.getInt("stock"),rst.getInt("price"),rst.getString("item_name"),rst.getString("type"));
    menuList.add(menu1);
    }
    }
    catch(Exception e)
    {
    }
      return menuList;
    }
    public void show_menu(){
    ArrayList<Menu2> list=menuList();
        DefaultTableModel model=(DefaultTableModel)menu_table.getModel();
        Object[] row=new Object[5];
        for(int i=0;i<list.size();i++)
        {
        row[0]=list.get(i).getid();
        row[1]=list.get(i).getname();
        row[2]=list.get(i).gettype();
        row[3]=list.get(i).getprice();
        row[4]=list.get(i).getstock();
        model.addRow(row);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_in = new javax.swing.JTextField();
        cmb_ty = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_pr = new javax.swing.JTextField();
        txt_st = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_upd = new javax.swing.JButton();
        btn_cl = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menu_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btn_back.setBackground(new java.awt.Color(0, 204, 204));
        btn_back.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\left-arrow (1).png")); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(555, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel2.setText("Item Name");

        txt_id.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_idKeyPressed(evt);
            }
        });

        txt_in.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        txt_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inActionPerformed(evt);
            }
        });

        cmb_ty.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        cmb_ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Beverage", "Bun" }));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel3.setText("Stock");

        txt_pr.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        txt_pr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_prKeyPressed(evt);
            }
        });

        txt_st.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        txt_st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stActionPerformed(evt);
            }
        });
        txt_st.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_stKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel4.setText("Price (RS)");

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel5.setText("Type");

        btn_add.setBackground(new java.awt.Color(0, 153, 153));
        btn_add.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_upd.setBackground(new java.awt.Color(0, 153, 153));
        btn_upd.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        btn_upd.setText("UPDATE");
        btn_upd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updMouseClicked(evt);
            }
        });
        btn_upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updActionPerformed(evt);
            }
        });

        btn_cl.setBackground(new java.awt.Color(0, 153, 153));
        btn_cl.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        btn_cl.setText("CLEAR");
        btn_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clActionPerformed(evt);
            }
        });

        btn_del.setBackground(new java.awt.Color(0, 153, 153));
        btn_del.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        btn_del.setText("DELETE");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id)
                            .addComponent(txt_in)
                            .addComponent(cmb_ty, 0, 234, Short.MAX_VALUE))
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(btn_upd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_pr, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(txt_st))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_ty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_upd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ITEM MANAGEMENT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        menu_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "item_id", "item_name", "type", "price", "stock"
            }
        ));
        menu_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menu_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void btn_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updActionPerformed
        DefaultTableModel tblmodel =(DefaultTableModel) menu_table.getModel();
        
        
        if(menu_table.getSelectedRowCount() == 1){
            if(txt_id.getText().isEmpty()|| txt_pr.getText().isEmpty() || txt_st.getText().isEmpty() || txt_in.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null,"please enter all data !");
        }else{
        int id=Integer.parseInt(txt_id.getText());
        String name=txt_in.getText();
        String type=cmb_ty.getSelectedItem().toString();
        int price=Integer.parseInt(txt_pr.getText());
        int stock=Integer.parseInt(txt_st.getText());
         CMenu ccus=new CMenu();
        ccus.updatemenu(id,name,type,stock,price);
        
        
        tblmodel.setValueAt(id, menu_table.getSelectedRow(), 0);
        tblmodel.setValueAt(name, menu_table.getSelectedRow(), 1);
        tblmodel.setValueAt(type, menu_table.getSelectedRow(), 2);
        tblmodel.setValueAt(price, menu_table.getSelectedRow(), 3);
        tblmodel.setValueAt(stock, menu_table.getSelectedRow(), 4);
        
        JOptionPane.showMessageDialog(this,"Update Successfully..!");
        }}
        
        else{
        JOptionPane.showMessageDialog(this,"Please Select Sigle Row For Updated.!");
        
        }
        
    }//GEN-LAST:event_btn_updActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        
        DefaultTableModel tblmodel =(DefaultTableModel) menu_table.getModel();
        
        
        //if(menu_table.getSelectedRowCount() == 1){
            if(txt_id.getText().isEmpty()|| txt_pr.getText().isEmpty() || txt_st.getText().isEmpty() || txt_in.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null,"please enter all data !");}
            else{
        int id=Integer.parseInt(txt_id.getText());
        String name=txt_in.getText();
        String type=cmb_ty.getSelectedItem().toString();
        int price=Integer.parseInt(txt_pr.getText());
        int stock=Integer.parseInt(txt_st.getText());
        CMenu ccus=new CMenu();
        ccus.addmenu(id, name, type, stock, price);
        
        JOptionPane.showMessageDialog(this," Updated.!");
        
        String data[]={txt_id.getText(),txt_in.getText(),cmb_ty.getSelectedItem().toString(),txt_pr.getText(),txt_st.getText()};
        DefaultTableModel model=(DefaultTableModel)menu_table.getModel();
        model.addRow(data);
        //JOptionPane.showMessageDialog(this,"Add Data successfuly..!");
        
        txt_id.setText("");
        txt_in.setText("");
        txt_pr.setText("");
        txt_st.setText("");
        }
        
       
       
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inActionPerformed
        
    }//GEN-LAST:event_txt_inActionPerformed

    private void btn_updMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updMouseClicked
        
    }//GEN-LAST:event_btn_updMouseClicked

    private void menu_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_tableMouseClicked
        DefaultTableModel tblmodel=(DefaultTableModel)menu_table.getModel();
        String tblid = tblmodel.getValueAt(menu_table.getSelectedRow(),0).toString();
        String tblname = tblmodel.getValueAt(menu_table.getSelectedRow(),1).toString();
        //String tbltype = tblmodel.getValueAt(menu_table.getSelectedRow(),2).toString();
        String tblstock = tblmodel.getValueAt(menu_table.getSelectedRow(),4).toString();
        String tblprice = tblmodel.getValueAt(menu_table.getSelectedRow(),3).toString();
        
        txt_id.setText(tblid);
        txt_in.setText(tblname);
        txt_pr.setText(tblprice);
        txt_st.setText(tblstock);
    }//GEN-LAST:event_menu_tableMouseClicked

    private void btn_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clActionPerformed
        txt_id.setText("");
        txt_in.setText("");
        txt_pr.setText("");
        txt_st.setText("");
    }//GEN-LAST:event_btn_clActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        DefaultTableModel tblmodel=(DefaultTableModel)menu_table.getModel();
        if(menu_table.getSelectedRowCount()==1){
        tblmodel.removeRow(menu_table.getSelectedRow());
        JOptionPane.showMessageDialog(this,"Delete successfuly..!");
        
        int id=Integer.parseInt(txt_id.getText());
        String name=txt_in.getText();
        String type=cmb_ty.getSelectedItem().toString();
        int price=Integer.parseInt(txt_pr.getText());
        int stock=Integer.parseInt(txt_st.getText());
        CMenu ccus=new CMenu();
        ccus.deletemenu(id,name,type,stock,price);
        }
        else{
        if(menu_table.getRowCount() == 0){
        JOptionPane.showMessageDialog(this,"Table is empty..!");
        }
        else{
        JOptionPane.showMessageDialog(this,"Please Selected Singal Row..!");
        }
        }
        
     
    }//GEN-LAST:event_btn_delActionPerformed

    private void txt_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyPressed
        
                
        char c=evt.getKeyChar();
        if(Character.isLetter(c)){
        
            txt_id.setEditable(false);
            JOptionPane.showMessageDialog(this,"Enter Numbers ONly..!");
        }else
        {
            txt_id.setEditable(true);
        }
    }//GEN-LAST:event_txt_idKeyPressed

    private void txt_stKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stKeyPressed
        char c=evt.getKeyChar();
        if(Character.isLetter(c)){
        
            txt_st.setEditable(false);
            JOptionPane.showMessageDialog(this,"Enter Numbers ONly..!");
        }else
        {
            txt_st.setEditable(true);
        }
    }//GEN-LAST:event_txt_stKeyPressed

    private void txt_prKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prKeyPressed
        char c=evt.getKeyChar();
        if(Character.isLetter(c)){
        
            txt_pr.setEditable(false);
            JOptionPane.showMessageDialog(this,"Enter Numbers ONly..!");
        }else
        {
            txt_pr.setEditable(true);
        }
    }//GEN-LAST:event_txt_prKeyPressed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
            HomePage hp=new HomePage();
            hp.setVisible(true);
            this.hide();
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stActionPerformed
        
    }//GEN-LAST:event_txt_stActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cl;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_upd;
    private javax.swing.JComboBox<String> cmb_ty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menu_table;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_in;
    private javax.swing.JTextField txt_pr;
    private javax.swing.JTextField txt_st;
    // End of variables declaration//GEN-END:variables
}
