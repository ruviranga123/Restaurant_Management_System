/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.ResultSet;
import controller.CInvoice;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import controller.CInvoice;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;




public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        invoiceno();
        btn_add.setEnabled(false);
        btn_pb.setEnabled(false);
        txt_tot.setDocument(new Textlimit(9));
        txt_pay.setDocument(new Textlimit(9));
        txt_ic.setDocument(new Textlimit(8));
        
        
        
        
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_ic = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_in = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sp_qt = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txt_pr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_am = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_io = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        item_table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_bill = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_tot = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_pay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_bal = new javax.swing.JTextField();
        btn_pb = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel1.setText("Item Code");

        txt_ic.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        txt_ic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_icActionPerformed(evt);
            }
        });
        txt_ic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_icKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setText("Item Name");

        txt_in.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        txt_in.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setText("QTY");

        sp_qt.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        sp_qt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sp_qt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sp_qt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_qtStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel4.setText("Price");

        txt_pr.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        txt_pr.setEnabled(false);
        txt_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel5.setText("Amount");

        txt_am.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        txt_am.setEnabled(false);
        txt_am.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(0, 0, 0));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel6.setText("INVOICE NO");

        txt_io.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        txt_io.setText("XXXXXXXXXX");

        lbl_type.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        lbl_type.setText("TYPE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ic, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_in, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_qt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pr, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_io, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_am, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addComponent(lbl_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_io, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_type))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_qt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_add)
                .addGap(12, 12, 12))
        );

        item_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name", "QTY", "Price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        item_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                item_tableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(item_table);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        txt_bill.setColumns(20);
        txt_bill.setFont(new java.awt.Font("Palatino Linotype", 1, 13)); // NOI18N
        txt_bill.setRows(5);
        jScrollPane2.setViewportView(txt_bill);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("NET TOTAL");

        txt_tot.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        txt_tot.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("PAY AMOUNT");

        txt_pay.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        txt_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_payActionPerformed(evt);
            }
        });
        txt_pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_payKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("BALANCE");

        txt_bal.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        txt_bal.setEnabled(false);

        btn_pb.setBackground(new java.awt.Color(0, 255, 0));
        btn_pb.setText("PRINT BILL");
        btn_pb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pbActionPerformed(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(51, 255, 0));
        btn_save.setText("KOT");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_tot, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(txt_pay)))
                .addGap(59, 59, 59)
                .addComponent(btn_pb)
                .addGap(18, 18, 18)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(btn_pb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\left-arrow (1).png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_del.setBackground(new java.awt.Color(255, 0, 0));
        btn_del.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        btn_del.setForeground(new java.awt.Color(255, 255, 255));
        btn_del.setText("DELETE");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_icKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_icKeyPressed
        
   
        
    }//GEN-LAST:event_txt_icKeyPressed

    private void txt_icActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_icActionPerformed
        try{
    String id=txt_ic.getText();
    CInvoice csc=new CInvoice();
    ResultSet rst=csc.searchitem(id);
    if(rst.next() == false){
    
    JOptionPane.showMessageDialog(this,"product code not found..!");
    
    }else{
    //JOptionPane.showMessageDialog(this,"product code not found..!");
    txt_in.setText(rst.getString("item_name").trim());
    txt_pr.setText(rst.getString("price").trim());
    }
    
    }
    catch(Exception e)
    {   System.err.println(e.getMessage());
    }
    }//GEN-LAST:event_txt_icActionPerformed

    private void sp_qtStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_qtStateChanged
        int qty=Integer.parseInt(sp_qt.getValue().toString());
        if(qty<0){
        JOptionPane.showMessageDialog(this,"enter valide Qty..!");
        sp_qt.setValue(0);}
        else if(qty==0){btn_add.setEnabled(false);}
        else{
        int price =Integer.parseInt(txt_pr.getText());
        
        int tot = qty *price;
        
        txt_am.setText(String.valueOf(tot));
        
        if(tot>0){
        btn_add.setEnabled(true);
        }
        }
       
    }//GEN-LAST:event_sp_qtStateChanged

    
    public void Balance(){
    
        int total=Integer.parseInt(txt_tot.getText());
        int pay =Integer.parseInt(txt_pay.getText());
        if(total<=pay){
        int bal = pay - total;
        
        txt_bal.setText(String.valueOf(bal));
        btn_pb.setEnabled(true);
        }
        else{
        JOptionPane.showMessageDialog(this,"enter valide amount..!");
        }
        
    }
    
    public void Bill(){
        int total=Integer.parseInt(txt_tot.getText());
        int pay =Integer.parseInt(txt_pay.getText());
        if(total>pay){
        
        //JOptionPane.showMessageDialog(this,"enter valide amount..!");
        
        
        }
        else{
        
        
        
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String dd=sdf.format(d);
        
        LocalDateTime myDateObj = LocalDateTime.now(); 
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        
        
        //String total1=txt_tot.getText();
        //String pay1=txt_pay.getText();
        String bal =txt_bal.getText();
        String ino=txt_io.getText();
        String lbl=lbl_type.getText();
        
         DefaultTableModel model=new DefaultTableModel();
        
        model = (DefaultTableModel)item_table.getModel();
        
        txt_bill.setText(txt_bill.getText()+"***************************************************************\n");
        txt_bill.setText(txt_bill.getText()+"                                             FINAL BILL                      \n");
        txt_bill.setText(txt_bill.getText()+"DATE:"+dd+"                                                    \n");
        txt_bill.setText(txt_bill.getText()+"TIME:"+formattedDate+"                                         \n");
        txt_bill.setText(txt_bill.getText()+"INVOICE NO:"+ino+                                               "\n");
        txt_bill.setText(txt_bill.getText()+"----------------------------------------------------------------------------------------\n");
        txt_bill.setText(txt_bill.getText()+"                                               "+lbl+ "                                     \n");
        txt_bill.setText(txt_bill.getText()+"----------------------------------------------------------------------------------------\n");
        
        txt_bill.setText(txt_bill.getText()+"ITEM"+ "\t" +"QTY" + "\t" + "PRICE" + "\t"+ "AMOUNT" +"\n");
        
        txt_bill.setText(txt_bill.getText()+"----------------------------------------------------------------------------------------\n");
        
        for(int i=0; i<model.getRowCount();i++)
        {
        String itemname=(String)model.getValueAt(i, 1);
        String itemqty=(String)model.getValueAt(i, 2);
        String itemprice=(String)model.getValueAt(i, 3);
        String itemamount=(String)model.getValueAt(i, 4);
        
        txt_bill.setText(txt_bill.getText()+ itemname + "\t" + itemqty  + "\t" +  itemprice  + "\t"+  itemamount  +"\n\n");
        }
        
        txt_bill.setText(txt_bill.getText()+"----------------------------------------------------------------------------------------\n");
        txt_bill.setText(txt_bill.getText()+ "SUB TOTAL :" + "\t" +"\t" + "\t"+  total  +"\n");
        txt_bill.setText(txt_bill.getText()+ "CASH :" + "\t" +"\t" + "\t"+  pay  +"\n");
        txt_bill.setText(txt_bill.getText()+ "BALANCE :" + "\t" +"\t" + "\t"+  bal  +"\n");
        
        txt_bill.setText(txt_bill.getText()+"***************************************************************\n");
        txt_bill.setText(txt_bill.getText()+"                          THANK YOU COME AGAIN                 \n");
        
        btn_pb.setEnabled(false);
        
         String inno=txt_io.getText();
        //String name=lbl_type.getText();
        CInvoice ccus=new CInvoice();
        ccus.addpayment(inno,dd,lbl,total);
        }
    
    }
    
    
    
    public void KotBill(){
        
        
        
        
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String dd=sdf.format(d);
        
        LocalDateTime myDateObj = LocalDateTime.now(); 
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        
        
       
        String ino=txt_io.getText();
        String lbl=lbl_type.getText();
        
         DefaultTableModel model=new DefaultTableModel();
        
        model = (DefaultTableModel)item_table.getModel();
        
        txt_bill.setText(txt_bill.getText()+"***************************************************************\n");
        txt_bill.setText(txt_bill.getText()+"                                             KOT BILL                      \n");
        txt_bill.setText(txt_bill.getText()+"DATE:"+dd+"                                                    \n");
        txt_bill.setText(txt_bill.getText()+"TIME:"+formattedDate+"                                         \n");
        txt_bill.setText(txt_bill.getText()+"INVOICE NO:"+ino+                                               "\n");
        txt_bill.setText(txt_bill.getText()+"----------------------------------------------------------------------------------------\n");
        txt_bill.setText(txt_bill.getText()+"                                              "+lbl+ "                                     \n");
        txt_bill.setText(txt_bill.getText()+"----------------------------------------------------------------------------------------\n");
        
        txt_bill.setText(txt_bill.getText()+"ITEM"+ "\t" + "\t" + "\t"+ "QTY" +"\n");
        
        txt_bill.setText(txt_bill.getText()+"----------------------------------------------------------------------------------------\n");
        
        for(int i=0; i<model.getRowCount();i++)
        {
        String itemname=(String)model.getValueAt(i, 1);
        String itemqty=(String)model.getValueAt(i, 2);
        
        
        txt_bill.setText(txt_bill.getText()+ itemname + "\t" + "\t" + "\t"+  itemqty   +"\n\n");
        }
        
        txt_bill.setText(txt_bill.getText()+"----------------------------------------------------------------------------------------\n");
        
        txt_bill.setText(txt_bill.getText()+"***************************************************************\n");
        txt_bill.setText(txt_bill.getText()+"                          THANK YOU COME AGAIN                 \n");
        
        btn_save.setEnabled(false);
  
    }
  
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        DefaultTableModel model=new DefaultTableModel();
        
        model = (DefaultTableModel)item_table.getModel();
        
        model.addRow(new Object[]{
            txt_ic.getText(),
            txt_in.getText(),
            sp_qt.getValue().toString(),
            txt_pr.getText(),
            txt_am.getText(),
        });
        int sum = 0;
        for(int i=0; i< item_table.getRowCount(); i++)
        {
        sum=sum + Integer.parseInt(item_table.getValueAt(i, 4).toString());
        }
        
        txt_tot.setText(Integer.toString(sum));
        
        txt_ic.setText("");
            txt_in.setText("");
            sp_qt.setValue(0);
            txt_pr.setText("");
            txt_am.setText("");
    }//GEN-LAST:event_btn_addActionPerformed

    public void invoiceno(){
    
    try{
    CInvoice csc=new CInvoice();
    ResultSet rst=csc.incrementalinon();
    rst.next();
    txt_io.setText(rst.getString(1));
    
    rst.getString("MAX(invoice_No)");
      
      if(rst.getString("MAX(invoice_No)") == null){
      
       txt_io.setText("E00001");
      }
      else{
       
      long id= Long.parseLong(rst.getString("MAX(invoice_No)").substring(2,rst.getString("MAX(invoice_No)").length()));
      id++;
      txt_io.setText("E"+String.format("%05d", id));
      }
    }
    catch(Exception e)
    {   System.err.println(e.getMessage());
    }
    }
    
    
    
    
    
    
    
    private void btn_pbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pbActionPerformed
       if(txt_pay.getText().isEmpty()|| txt_tot.getText().isEmpty()){
       //JOptionPane.showMessageDialog(this,"enter valide amount..!");
       }
       else{
        Balance();
        Bill();
       }
       
        
        
      
    }//GEN-LAST:event_btn_pbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePage l=new HomePage();
             l.setVisible(true);
             this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        DefaultTableModel tblmodel=(DefaultTableModel)item_table.getModel();
        if(item_table.getSelectedRowCount()==1){
        tblmodel.removeRow(item_table.getSelectedRow());
        JOptionPane.showMessageDialog(this,"Delete successfuly..!");
    
        }
        else{
        if(item_table.getRowCount() == 0){
        JOptionPane.showMessageDialog(this,"Table is empty..!");
        }
        else{
        JOptionPane.showMessageDialog(this,"Please Selected Singal Row..!");
        }}
    }//GEN-LAST:event_btn_delActionPerformed

    private void txt_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_payActionPerformed
        DefaultTableModel tblmodel=(DefaultTableModel)item_table.getModel();
        if(item_table.getSelectedRowCount()==1){
        txt_pay.setEnabled(true);
   
        }
        else{
        if(item_table.getRowCount() == 0){
        txt_pay.setEnabled(false);
        }
        else{
        txt_pay.setEnabled(false);
        }}
    }//GEN-LAST:event_txt_payActionPerformed

    private void txt_amActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amActionPerformed
        
    }//GEN-LAST:event_txt_amActionPerformed

    private void txt_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prActionPerformed
        
    }//GEN-LAST:event_txt_prActionPerformed

    private void item_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_item_tableKeyPressed
        
    }//GEN-LAST:event_item_tableKeyPressed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        
        DefaultTableModel tblmodel=(DefaultTableModel)item_table.getModel();
        if(item_table.getRowCount()>=1){
        
        JOptionPane.showMessageDialog(this,"save successfuly..!");
        KotBill();
        btn_pb.setEnabled(true);
        }
        else{
        if(item_table.getRowCount() == 0){
        JOptionPane.showMessageDialog(this,"Table is empty..!");
        }
        }
     
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_payKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_payKeyPressed
        char c=evt.getKeyChar();
        if(Character.isLetter(c)){
        
            txt_pay.setEditable(false);
            JOptionPane.showMessageDialog(this,"Enter Numbers ONly..!");
        }else
        {
            txt_pay.setEditable(true);
        }
    }//GEN-LAST:event_txt_payKeyPressed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
        
         
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_pb;
    private javax.swing.JButton btn_save;
    private javax.swing.JTable item_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lbl_type;
    private javax.swing.JSpinner sp_qt;
    private javax.swing.JTextField txt_am;
    private javax.swing.JTextField txt_bal;
    private javax.swing.JTextArea txt_bill;
    private javax.swing.JTextField txt_ic;
    private javax.swing.JTextField txt_in;
    private javax.swing.JLabel txt_io;
    private javax.swing.JTextField txt_pay;
    private javax.swing.JTextField txt_pr;
    private javax.swing.JTextField txt_tot;
    // End of variables declaration//GEN-END:variables
}
