/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.*;

/**
 *
 * @author johar
 */
public class pRenew extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public pRenew() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground3 = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        pnlButton = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        pnlBookInfo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRenewDueDate = new javax.swing.JTextField();
        txtRenewCurrentDate = new javax.swing.JTextField();
        txtNewDueDate = new javax.swing.JTextField();
        txtCanBeRenewed = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnRenew = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();
        lblBookID = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblBorrowID = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtBookID = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtBorrowID = new javax.swing.JTextField();
        lblDate1 = new javax.swing.JLabel();
        txtDueDate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnCheckBorrow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VILB Book Management System");
        setResizable(false);

        panelBackground3.setBackground(new java.awt.Color(163, 193, 173));
        panelBackground3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelTitle.setBackground(new java.awt.Color(0, 33, 71));

        lblTitle1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("VILB");
        lblTitle1.setPreferredSize(new java.awt.Dimension(20, 14));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Renew");
        lblTitle.setPreferredSize(new java.awt.Dimension(20, 14));

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlButton.setOpaque(false);
        pnlButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(63, 124, 172));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setMaximumSize(new java.awt.Dimension(100, 50));
        btnBack.setMinimumSize(new java.awt.Dimension(100, 50));
        btnBack.setPreferredSize(new java.awt.Dimension(100, 50));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlButton.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnlBookInfo.setDoubleBuffered(false);
        pnlBookInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pnlBookInfo.setName(""); // NOI18N

        jLabel5.setText("Due Date");

        jLabel6.setText("Current Date");

        jLabel7.setText("Can be renewed?");

        jLabel8.setText("New Due Date");

        txtRenewDueDate.setEditable(false);

        txtRenewCurrentDate.setEditable(false);

        txtCanBeRenewed.setEditable(false);
        txtCanBeRenewed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCanBeRenewedActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Renew Details");

        btnRenew.setBackground(new java.awt.Color(63, 124, 172));
        btnRenew.setForeground(new java.awt.Color(255, 255, 255));
        btnRenew.setText("Renew");
        btnRenew.setEnabled(false);
        btnRenew.setMaximumSize(new java.awt.Dimension(100, 50));
        btnRenew.setMinimumSize(new java.awt.Dimension(100, 50));
        btnRenew.setPreferredSize(new java.awt.Dimension(100, 50));
        btnRenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBookInfoLayout = new javax.swing.GroupLayout(pnlBookInfo);
        pnlBookInfo.setLayout(pnlBookInfoLayout);
        pnlBookInfoLayout.setHorizontalGroup(
            pnlBookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookInfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlBookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(pnlBookInfoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(51, 51, 51))
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(pnlBookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRenew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRenewDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRenewCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCanBeRenewed, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        pnlBookInfoLayout.setVerticalGroup(
            pnlBookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookInfoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addGap(35, 35, 35)
                .addGroup(pnlBookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRenewCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRenewDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCanBeRenewed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnRenew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBookInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNewDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        lblBookID.setText("Book ID");

        lblID.setText("Client ID");

        lblBorrowID.setText("Borrow ID");

        lblDate.setText("Date");

        txtID.setEditable(false);

        txtBookID.setEditable(false);

        txtDate.setEditable(false);

        lblDate1.setText("Due Date");

        txtDueDate.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Borrowing Details");

        btnCheckBorrow.setBackground(new java.awt.Color(63, 124, 172));
        btnCheckBorrow.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckBorrow.setText("Check");
        btnCheckBorrow.setMaximumSize(new java.awt.Dimension(100, 50));
        btnCheckBorrow.setMinimumSize(new java.awt.Dimension(100, 50));
        btnCheckBorrow.setPreferredSize(new java.awt.Dimension(100, 50));
        btnCheckBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckBorrowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(232, Short.MAX_VALUE))
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDate1)
                            .addComponent(lblBookID)
                            .addComponent(lblDate)
                            .addComponent(lblID)
                            .addComponent(lblBorrowID))
                        .addGap(34, 34, 34)
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBookID, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txtDate)
                            .addComponent(txtDueDate)
                            .addComponent(txtID)
                            .addComponent(txtBorrowID, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCheckBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBorrowID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBorrowID)
                    .addComponent(btnCheckBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBookID)
                    .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate1)
                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBackground3Layout = new javax.swing.GroupLayout(panelBackground3);
        panelBackground3.setLayout(panelBackground3Layout);
        panelBackground3Layout.setHorizontalGroup(
            panelBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBackground3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBackground3Layout.createSequentialGroup()
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBookInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBackground3Layout.setVerticalGroup(
            panelBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground3Layout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBookInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCanBeRenewedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCanBeRenewedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCanBeRenewedActionPerformed

    private void btnRenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenewActionPerformed
        Calendar currentDate = Calendar.getInstance();
        currentDate.add(Calendar.DAY_OF_MONTH, 14);
        txtNewDueDate.setText(datef.format(currentDate.getTime())); 
        
        if (txtBorrowID.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No borrow ID found", "No borrow ID found", JOptionPane.ERROR_MESSAGE);
        }else{
            Renew();
        }
    }//GEN-LAST:event_btnRenewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       pMainMenu mainMenuPage = new pMainMenu();
        mainMenuPage.show();
        dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    String dir, borrowID;
    Calendar currentDate = Calendar.getInstance();
    SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
    private void btnCheckBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckBorrowActionPerformed
       
        
        String[] selectedID;
        boolean hasResult = false;
        borrowID = txtBorrowID.getText();
 
        try {
            dir = System.getProperty("user.dir") + "\\src\\DB\\";
            File clienttxt = new File(dir + "borrow_t.txt");
            Scanner inputFile;
            try {
                inputFile = new Scanner(clienttxt);
                
                while (inputFile.hasNext())
                {
                    
                    String nextLine = inputFile.nextLine();
                    
                    selectedID = nextLine.split(":");
                    if (selectedID[0].equals(borrowID)){
                        if ("false".equals(selectedID[7]) && "false".equals(selectedID[6])) {
                            hasResult = true;
                            txtBorrowID.setText(selectedID[0]);
                            txtID.setText(selectedID[1]);
                            txtBookID.setText(selectedID[2]);
                            txtDate.setText(selectedID[3]);
                            txtDueDate.setText(selectedID[4]);
                            
          
                            txtRenewDueDate.setText(txtDueDate.getText());
                            
                           txtRenewCurrentDate.setText(datef.format(currentDate.getTime()));
                           
                           txtNewDueDate.setText("");
                           CheckRenew();
                        }else {
                                JOptionPane.showMessageDialog(null, "Book has already been renewed!", "Book has already been renewed!", JOptionPane.ERROR_MESSAGE);
                                ClearText();
                        }
                       
                    }
                }
                
                if (!hasResult){
                    JOptionPane.showMessageDialog(null, "No borrow ID found", "No borrow ID found", JOptionPane.ERROR_MESSAGE);
                }
                inputFile.close();
                
            } catch (FileNotFoundException ex) {
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            
            //JOptionPane.showMessageDialog(null,e);
            JOptionPane.showMessageDialog(null, "No Borrow ID found!", "No Borrow ID found!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCheckBorrowActionPerformed

    private void CheckRenew(){
            DateTimeFormatter dateFormat = DateTimeFormat.forPattern("dd/MM/yyyy");
           
            LocalDate currentDate = LocalDate.parse(txtRenewCurrentDate.getText(),dateFormat );
            
            LocalDate dueDate = LocalDate.parse(txtDueDate.getText(),dateFormat );
            
            int datediff = Days.daysBetween(currentDate, dueDate).getDays();
            
            if (datediff > 0 ){
                txtCanBeRenewed.setText("Yes");
            
            } else {
                txtCanBeRenewed.setText("No");
            }
            
            if (txtCanBeRenewed.getText().equals("Yes")){
                btnRenew.setEnabled(true);
            } else{
                btnRenew.setEnabled(false);
            }
    }
    
    String saveDir, clientID, bookID;
    private void Renew(){
    
        saveDir = System.getProperty("user.dir") + "\\src\\DB\\";
        
        try {
            
            borrowID = txtBorrowID.getText();
            clientID = txtID.getText();
            bookID = txtBookID.getText(); 
           
            String obdate = txtDate.getText();
            String oddate = txtDueDate.getText();
            
            Calendar bdate = Calendar.getInstance();
            SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
            
            String nbdate = datef.format(bdate.getTime());
            
            bdate.add(Calendar.DAY_OF_MONTH, 14);
            
            String nddate = datef.format(bdate.getTime());
           
                
                File borrow = new File(saveDir + "borrow_t.txt");
                File borrowTemp = new File(saveDir + "borrowTemp_t.txt");

                if (!borrow.exists()){
                    borrowTemp.createNewFile();
                }
             
                borrow.renameTo(borrowTemp);
               
                FileWriter brd = new FileWriter(saveDir + "borrow_t.txt"); 
                
                PrintWriter brdp = new PrintWriter(brd); 
               
                File borrowingtxt = new File(saveDir + "borrowTemp_t.txt");
                
                Scanner inputFile = new Scanner(borrowingtxt);
                
                String[] selectedID;
              
                while (inputFile.hasNext())
                {
                
                    String brEntry = inputFile.nextLine();
               
                    selectedID = brEntry.split(":");
                    
                    if (selectedID[0].equals(borrowID)) {
                        selectedID[3] = nbdate;
                        selectedID[4] = nddate;
                        selectedID[7] = "true";
                    }
                    brdp.println(selectedID[0] + ":" +
                                selectedID[1] + ":" +
                                selectedID[2] + ":" +
                                selectedID[3] + ":" +
                                selectedID[4] + ":" +
                                selectedID[5] + ":" +
                                selectedID[6] + ":" +
                                selectedID[7] + ":" +
                                selectedID[8]);

                }
                
                inputFile.close();
                
                borrowTemp.delete();
            
                brdp.close();
                
                
                JOptionPane.showMessageDialog(null, "Successfully renewed! Please be aware a client can only renew once. Press OK to return to the renewing form.", "Renewing succeeded!", JOptionPane.INFORMATION_MESSAGE);
               
                ClearText();
            } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e);
            }
    }
    
    private void ClearText(){
      txtBorrowID.setText("");
      txtID.setText("");
      txtBookID.setText("");
      txtDate.setText("");
      txtDueDate.setText("");
      txtRenewCurrentDate.setText("");
      txtRenewDueDate.setText("");
      txtNewDueDate.setText("");
      txtCanBeRenewed.setText("");
      btnRenew.setEnabled(false);
    }
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pRenew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pRenew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pRenew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pRenew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pRenew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckBorrow;
    private javax.swing.JButton btnRenew;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblBookID;
    private javax.swing.JLabel lblBorrowID;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDate1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JPanel panelBackground3;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel pnlBookInfo;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtBorrowID;
    private javax.swing.JTextField txtCanBeRenewed;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDueDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNewDueDate;
    private javax.swing.JTextField txtRenewCurrentDate;
    private javax.swing.JTextField txtRenewDueDate;
    // End of variables declaration//GEN-END:variables
}
