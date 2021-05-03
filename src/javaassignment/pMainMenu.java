/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

/**
 *
 * @author johar
 */
public class pMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public pMainMenu() {
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
        btnLogout = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnBorrow = new javax.swing.JButton();
        btnRenew = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnManageBook = new javax.swing.JButton();

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
        lblTitle.setText("MAIN MENU");
        lblTitle.setPreferredSize(new java.awt.Dimension(20, 14));

        btnLogout.setBackground(new java.awt.Color(63, 124, 172));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setMaximumSize(new java.awt.Dimension(100, 50));
        btnLogout.setMinimumSize(new java.awt.Dimension(100, 50));
        btnLogout.setPreferredSize(new java.awt.Dimension(100, 50));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlContent.setOpaque(false);
        pnlContent.setLayout(new java.awt.GridLayout(2, 4, 20, 20));

        btnRegister.setBackground(new java.awt.Color(63, 124, 172));
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register User");
        btnRegister.setMaximumSize(new java.awt.Dimension(100, 50));
        btnRegister.setMinimumSize(new java.awt.Dimension(100, 50));
        btnRegister.setPreferredSize(new java.awt.Dimension(100, 50));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        pnlContent.add(btnRegister);

        btnBorrow.setBackground(new java.awt.Color(63, 124, 172));
        btnBorrow.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrow.setText("Borrow");
        btnBorrow.setMaximumSize(new java.awt.Dimension(100, 50));
        btnBorrow.setMinimumSize(new java.awt.Dimension(100, 50));
        btnBorrow.setPreferredSize(new java.awt.Dimension(100, 50));
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });
        pnlContent.add(btnBorrow);

        btnRenew.setBackground(new java.awt.Color(63, 124, 172));
        btnRenew.setForeground(new java.awt.Color(255, 255, 255));
        btnRenew.setText("Renew");
        btnRenew.setMaximumSize(new java.awt.Dimension(100, 50));
        btnRenew.setMinimumSize(new java.awt.Dimension(100, 50));
        btnRenew.setPreferredSize(new java.awt.Dimension(100, 50));
        btnRenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewActionPerformed(evt);
            }
        });
        pnlContent.add(btnRenew);

        btnReturn.setBackground(new java.awt.Color(63, 124, 172));
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("Return");
        btnReturn.setMaximumSize(new java.awt.Dimension(100, 50));
        btnReturn.setMinimumSize(new java.awt.Dimension(100, 50));
        btnReturn.setPreferredSize(new java.awt.Dimension(100, 50));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        pnlContent.add(btnReturn);

        btnManageBook.setBackground(new java.awt.Color(63, 124, 172));
        btnManageBook.setForeground(new java.awt.Color(255, 255, 255));
        btnManageBook.setText("Add Book");
        btnManageBook.setMaximumSize(new java.awt.Dimension(100, 50));
        btnManageBook.setMinimumSize(new java.awt.Dimension(100, 50));
        btnManageBook.setPreferredSize(new java.awt.Dimension(100, 50));
        btnManageBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBookActionPerformed(evt);
            }
        });
        pnlContent.add(btnManageBook);

        javax.swing.GroupLayout panelBackground3Layout = new javax.swing.GroupLayout(panelBackground3);
        panelBackground3.setLayout(panelBackground3Layout);
        panelBackground3Layout.setHorizontalGroup(
            panelBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackground3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBackground3Layout.setVerticalGroup(
            panelBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground3Layout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        pBorrow borrowPage = new pBorrow();
        borrowPage.show();
        dispose();
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void btnManageBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBookActionPerformed
        pManageBook managePage = new pManageBook();
        managePage.show();
        dispose();
    }//GEN-LAST:event_btnManageBookActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        pRegisterSelection RegisterSelectionPage = new pRegisterSelection();
        RegisterSelectionPage.show();
        dispose();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenewActionPerformed
        pRenew renewPage = new pRenew();
        renewPage.show();
        dispose();
    }//GEN-LAST:event_btnRenewActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        pReturn returnPage = new pReturn();
        returnPage.show();
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        pLogin loginPage = new pLogin();
        loginPage.show();
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(pMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageBook;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRenew;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JPanel panelBackground3;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}