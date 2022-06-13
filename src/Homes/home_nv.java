/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Homes;

import QLKS.UI.ThongTin_ks;
import QLKS.Login.Login_home;
import QLKS.UI.DatPhong;
import QLKS.UI.QLNK;
import QLKS.UI.ThongTin_ks;
import QLKS.UI.ThuePhong;
import QLKS.UI.TraPhong;
import QLKS.UI.TrangChuDichVu;
import QLKS.view.ChiTietHoaDon;
import QLKS.view.Customview;
import QLKS.view.frPhuThu;
import QLKS.view.frSanPham;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tan Tan Chin - K14 - CNTT1 - PHENIKAA
 */

public class home_nv extends javax.swing.JFrame {


    public home_nv() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnTK = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnQLKH = new javax.swing.JLabel();
        btnDP = new javax.swing.JLabel();
        btnTP = new javax.swing.JLabel();
        btnTraPhong = new javax.swing.JLabel();
        btnQLNK = new javax.swing.JLabel();
        btnQLPT = new javax.swing.JLabel();
        btnDV = new javax.swing.JLabel();
        btnSP = new javax.swing.JLabel();
        btnHD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel3.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("PHOENIX HOTEL");

        btnTK.setBackground(new java.awt.Color(255, 255, 255));
        btnTK.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnTK.setForeground(new java.awt.Color(255, 255, 255));
        btnTK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        btnTK.setText("Tài Khoản nhân viên");
        btnTK.setIconTextGap(15);
        btnTK.setMaximumSize(new java.awt.Dimension(172, 48));
        btnTK.setMinimumSize(new java.awt.Dimension(172, 48));
        btnTK.setName(""); // NOI18N
        btnTK.setPreferredSize(new java.awt.Dimension(172, 48));
        btnTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTKMouseClicked(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 102, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        btnExit.setText("Đăng xuất");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setDisabledIcon(null);
        btnExit.setFocusable(false);
        btnExit.setIconTextGap(15);
        btnExit.setMaximumSize(new java.awt.Dimension(172, 48));
        btnExit.setMinimumSize(new java.awt.Dimension(172, 48));
        btnExit.setPreferredSize(new java.awt.Dimension(172, 48));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnExitKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTK, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 357, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(353, 353, 353)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnQLKH.setBackground(new java.awt.Color(255, 255, 255));
        btnQLKH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnQLKH.setText("Quản lý khách hàng");
        btnQLKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLKH.setMaximumSize(new java.awt.Dimension(150, 28));
        btnQLKH.setMinimumSize(new java.awt.Dimension(150, 28));
        btnQLKH.setPreferredSize(new java.awt.Dimension(150, 28));
        btnQLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLKHMouseClicked(evt);
            }
        });

        btnDP.setBackground(new java.awt.Color(255, 255, 255));
        btnDP.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnDP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDP.setText("Đặt phòng");
        btnDP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDP.setMaximumSize(new java.awt.Dimension(150, 28));
        btnDP.setMinimumSize(new java.awt.Dimension(150, 28));
        btnDP.setPreferredSize(new java.awt.Dimension(150, 28));
        btnDP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDPMouseClicked(evt);
            }
        });

        btnTP.setBackground(new java.awt.Color(255, 255, 255));
        btnTP.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnTP.setText("Thuê Phòng");
        btnTP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTP.setMaximumSize(new java.awt.Dimension(150, 28));
        btnTP.setMinimumSize(new java.awt.Dimension(150, 28));
        btnTP.setPreferredSize(new java.awt.Dimension(150, 28));
        btnTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTPMouseClicked(evt);
            }
        });

        btnTraPhong.setBackground(new java.awt.Color(255, 255, 255));
        btnTraPhong.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnTraPhong.setText("Trả phòng");
        btnTraPhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraPhong.setMaximumSize(new java.awt.Dimension(150, 28));
        btnTraPhong.setMinimumSize(new java.awt.Dimension(150, 28));
        btnTraPhong.setPreferredSize(new java.awt.Dimension(150, 28));
        btnTraPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTraPhongMouseClicked(evt);
            }
        });

        btnQLNK.setBackground(new java.awt.Color(255, 255, 255));
        btnQLNK.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnQLNK.setText("Quản lý nhập kho");
        btnQLNK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLNK.setMaximumSize(new java.awt.Dimension(150, 28));
        btnQLNK.setMinimumSize(new java.awt.Dimension(150, 28));
        btnQLNK.setPreferredSize(new java.awt.Dimension(150, 28));
        btnQLNK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLNKMouseClicked(evt);
            }
        });

        btnQLPT.setBackground(new java.awt.Color(255, 255, 255));
        btnQLPT.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnQLPT.setText("Quản lý phụ thu");
        btnQLPT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLPT.setMaximumSize(new java.awt.Dimension(150, 28));
        btnQLPT.setMinimumSize(new java.awt.Dimension(150, 28));
        btnQLPT.setPreferredSize(new java.awt.Dimension(150, 28));
        btnQLPT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLPTMouseClicked(evt);
            }
        });

        btnDV.setBackground(new java.awt.Color(255, 255, 255));
        btnDV.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnDV.setForeground(new java.awt.Color(51, 51, 51));
        btnDV.setText("Dịch vụ");
        btnDV.setIconTextGap(15);
        btnDV.setMaximumSize(new java.awt.Dimension(172, 48));
        btnDV.setMinimumSize(new java.awt.Dimension(172, 48));
        btnDV.setPreferredSize(new java.awt.Dimension(172, 48));
        btnDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDVMouseClicked(evt);
            }
        });

        btnSP.setBackground(new java.awt.Color(255, 255, 255));
        btnSP.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSP.setForeground(new java.awt.Color(51, 51, 51));
        btnSP.setText("Sản phẩm");
        btnSP.setIconTextGap(15);
        btnSP.setMaximumSize(new java.awt.Dimension(172, 48));
        btnSP.setMinimumSize(new java.awt.Dimension(172, 48));
        btnSP.setPreferredSize(new java.awt.Dimension(172, 48));
        btnSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSPMouseClicked(evt);
            }
        });

        btnHD.setBackground(new java.awt.Color(255, 255, 255));
        btnHD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnHD.setForeground(new java.awt.Color(51, 51, 51));
        btnHD.setText("Chi tiết hóa đơn");
        btnHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHD.setIconTextGap(15);
        btnHD.setMaximumSize(new java.awt.Dimension(172, 48));
        btnHD.setMinimumSize(new java.awt.Dimension(172, 48));
        btnHD.setPreferredSize(new java.awt.Dimension(172, 48));
        btnHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)
                        .addComponent(btnDP, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(276, 276, 276)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnTraPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))))
                .addGap(224, 224, 224)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQLNK, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLPT, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLNK, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLPT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTraPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKMouseClicked

    }//GEN-LAST:event_btnTKMouseClicked

    private void btnSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSPMouseClicked

    }//GEN-LAST:event_btnSPMouseClicked

    private void btnDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDVMouseClicked

        new TrangChuDichVu().setVisible(true);
    }//GEN-LAST:event_btnDVMouseClicked

    private void btnHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHDMouseClicked
        try {
           
            new ChiTietHoaDon().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHDMouseClicked

    private void btnQLPTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLPTMouseClicked
      
        try {
            new frPhuThu().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQLPTMouseClicked

    private void btnQLNKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLNKMouseClicked
        
        new QLNK().setVisible(true);
    }//GEN-LAST:event_btnQLNKMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
         Login_home lh = new Login_home();
        lh.setLocationRelativeTo(null);
        lh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExitKeyTyped
        // TODO add your handling code here:
     
               
    }//GEN-LAST:event_btnExitKeyTyped

    private void btnTraPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraPhongMouseClicked
        //        HideMenu();
        //        h.dispose();
        new TraPhong().setVisible(true);
    }//GEN-LAST:event_btnTraPhongMouseClicked

    private void btnTPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTPMouseClicked
        //        HideMenu();
        //        h.dispose();
        new ThuePhong().setVisible(true);
    }//GEN-LAST:event_btnTPMouseClicked

    private void btnDPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDPMouseClicked
        //        HideMenu();
        //        h.dispose();
        new DatPhong().setVisible(true);
    }//GEN-LAST:event_btnDPMouseClicked

    private void btnQLKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLKHMouseClicked
                  // TODO add your handling code here:
                new Customview().setVisible(true);
    }//GEN-LAST:event_btnQLKHMouseClicked

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
            java.util.logging.Logger.getLogger(home_nv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_nv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_nv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_nv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                home_nv hnv = new home_nv();
                hnv.setLocationRelativeTo(null);
                hnv.setVisible(true);             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDP;
    private javax.swing.JLabel btnDV;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnHD;
    private javax.swing.JLabel btnQLKH;
    private javax.swing.JLabel btnQLNK;
    private javax.swing.JLabel btnQLPT;
    private javax.swing.JLabel btnSP;
    private javax.swing.JLabel btnTK;
    private javax.swing.JLabel btnTP;
    private javax.swing.JLabel btnTraPhong;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
