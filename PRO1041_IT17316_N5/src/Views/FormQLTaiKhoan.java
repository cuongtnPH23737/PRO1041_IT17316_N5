/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Services.ITaiKhoanService;
import Services.Implements.TaiKhoanService;
import ViewModels.TaiKhoanView;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TRUNG DUC
 */
public class FormQLTaiKhoan extends javax.swing.JFrame {

    DefaultTableModel dtm;

    ITaiKhoanService iTaiKhoanService;
    public FormQLTaiKhoan() {
        initComponents();
        setLocationRelativeTo(this);

        dtm = (DefaultTableModel) tblQLTaiKhoan.getModel();

        iTaiKhoanService = new TaiKhoanService();
        loadTbl(iTaiKhoanService.getAll());
    }

    public void loadTbl(ArrayList<TaiKhoanView> list) {
        dtm.setRowCount(0);
        for (TaiKhoanView taiKhoanView : list) {
            dtm.addRow(new Object[]{
                taiKhoanView.getMaTk(),
                taiKhoanView.getEmail(),
                taiKhoanView.getPassword(),
                taiKhoanView.getLoaiTk()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtMaTk = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cbLoaiTk = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQLTaiKhoan = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Lo???i t??i kho???n");

        cbLoaiTk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "khachhang", "nhanvien", "quanly" }));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QU???N L?? T??I KHO???N");

        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        tblQLTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "M?? t??i kho???n", "Email", "Password", "Lo???i t??i kho???n"
            }
        ));
        tblQLTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQLTaiKhoan);

        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("X??a");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel2.setText("M?? t??i kho???n");

        jLabel3.setText("Email");

        jLabel4.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbLoaiTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaTk, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSua)
                                    .addComponent(btnThem)
                                    .addComponent(btnXoa))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbLoaiTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    TaiKhoanView getTaiKhoanView() {
        String matk = txtMaTk.getText();
        String email = txtEmail.getText();
        String pass = txtPassword.getText();
        String loaiTk = cbLoaiTk.getSelectedItem().toString();
        return new TaiKhoanView(matk, email, pass, loaiTk);
    }
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        TaiKhoanView taiKhoanView = getTaiKhoanView();
        try {

            if (iTaiKhoanService.checkTonTai(taiKhoanView)) {
                JOptionPane.showMessageDialog(this, "M?? t??i kho???n ho???c email ???? t???n t???i");
                return;
            }

            if (iTaiKhoanService.them(taiKhoanView)) {
                JOptionPane.showMessageDialog(this, "Th??m th??nh c??ng");
                loadTbl(iTaiKhoanService.getAll());
            } else {
                JOptionPane.showMessageDialog(this, "Th??m th???t b???i");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "L???i th??m");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblQLTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLTaiKhoanMouseClicked
        int i = tblQLTaiKhoan.getSelectedRow();
        txtMaTk.setText(tblQLTaiKhoan.getValueAt(i, 0).toString());
        txtEmail.setText(tblQLTaiKhoan.getValueAt(i, 1).toString());
        txtPassword.setText(tblQLTaiKhoan.getValueAt(i, 2).toString());
        cbLoaiTk.setSelectedItem(tblQLTaiKhoan.getValueAt(i, 3).toString());
    }//GEN-LAST:event_tblQLTaiKhoanMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        TaiKhoanView taiKhoanView = getTaiKhoanView();
        taiKhoanView.setMaTk(null);
        String matk = txtMaTk.getText();
        try {
            if (iTaiKhoanService.checkTonTai(taiKhoanView)) {
                JOptionPane.showMessageDialog(this, "Email ???? t???n t???i");
                return;
            }

            if (iTaiKhoanService.sua(taiKhoanView, matk)) {
                JOptionPane.showMessageDialog(this, "S???a th??nh c??ng");
                loadTbl(iTaiKhoanService.getAll());
            } else {
                JOptionPane.showMessageDialog(this, "S???a th???t b???i");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "L???i s???a");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String matk = txtMaTk.getText();
        try {
            if (iTaiKhoanService.xoa(matk)) {
                JOptionPane.showMessageDialog(this, "X??a th??nh c??ng");
                loadTbl(iTaiKhoanService.getAll());
            } else {
                JOptionPane.showMessageDialog(this, "X??a th???t b???i");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "L???i x??a");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(FormQLTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormQLTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormQLTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormQLTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormQLTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLoaiTk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblQLTaiKhoan;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaTk;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
