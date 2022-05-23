/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package barbarloan.layout;

/**
 *
 * @author Ansori San
 */
public class DashboardAdmin extends javax.swing.JFrame {

    /**
     * Creates new form DashboardAdmin
     */
    public DashboardAdmin() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reqTable = new javax.swing.JTable();
        tvRequest = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        Data = new javax.swing.JMenu();
        employees = new javax.swing.JMenuItem();
        tools = new javax.swing.JMenuItem();
        User = new javax.swing.JMenu();
        Log = new javax.swing.JMenu();
        borrow = new javax.swing.JMenuItem();
        returns = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Dashboard");

        jPanel1.setBackground(java.awt.Color.white);

        reqTable.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        reqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "Req ID", "Employee Name", "Tools", "Status", "Borrow Date", "Duration"
            }
        ));
        jScrollPane1.setViewportView(reqTable);

        tvRequest.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        tvRequest.setText("Request");

        Logout.setFont(new java.awt.Font("Product Sans", 1, 12)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(tvRequest)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(tvRequest)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logout)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jMenuBar2.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        Data.setText("Data");
        Data.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        employees.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        employees.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        employees.setText("Employees");
        employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeesMouseClicked(evt);
            }
        });
        employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesActionPerformed(evt);
            }
        });
        Data.add(employees);

        tools.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        tools.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        tools.setText("Tools");
        tools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolsActionPerformed(evt);
            }
        });
        Data.add(tools);

        jMenuBar2.add(Data);

        User.setText("User");
        User.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        jMenuBar2.add(User);

        Log.setText("Log");
        Log.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N

        borrow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        borrow.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        borrow.setText("Borrow");
        borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowActionPerformed(evt);
            }
        });
        Log.add(borrow);

        returns.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        returns.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        returns.setText("Return");
        returns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnsActionPerformed(evt);
            }
        });
        Log.add(returns);

        jMenuBar2.add(Log);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnsActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeesActionPerformed

    private void employeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_employeesMouseClicked

    private void toolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toolsActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void borrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrowActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DashboardAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Data;
    private javax.swing.JMenu Log;
    private javax.swing.JButton Logout;
    private javax.swing.JMenu User;
    private javax.swing.JMenuItem borrow;
    private javax.swing.JMenuItem employees;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reqTable;
    private javax.swing.JMenuItem returns;
    private javax.swing.JMenuItem tools;
    private javax.swing.JLabel tvRequest;
    // End of variables declaration//GEN-END:variables
}
