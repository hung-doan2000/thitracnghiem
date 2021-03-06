/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuongTrinhTracNghiem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class KetQua extends javax.swing.JFrame {

    /**
     * Creates new form KetQua
     */
    List<diemso> list = new ArrayList<>();
    int cauDung;
    int cauSai;
    String kq;
    public KetQua() {
        list = (List<diemso>) XFile.readObject("diemso.txt");
        initComponents();
        setLocationRelativeTo(null);
        txtCauDung.setText(String.valueOf(list.get(0).cauDung));
        txtCauSai.setText(String.valueOf(list.get(0).cauSai));
        if(list.get(0).cauDung >= 16){
            kq = "Đạt";
        }
        else{
            kq = "Không đạt";
        }
        txtResult.setText(kq);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCauDung = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCauSai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bạn đã hoàn thành bài thi trắc nghiệm");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 9, 350, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Số câu đúng:");
        jLabel2.setAlignmentX(0.5F);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 65, 100, 40));

        txtCauDung.setEditable(false);
        txtCauDung.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCauDung.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCauDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 310, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Số câu sai:");
        jLabel3.setAlignmentX(0.5F);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 145, 100, 40));

        txtCauSai.setEditable(false);
        txtCauSai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCauSai.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCauSai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 310, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kết quả:");
        jLabel4.setAlignmentX(0.5F);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 225, 100, 40));

        txtResult.setEditable(false);
        txtResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtResult.setForeground(new java.awt.Color(255, 51, 32));
        txtResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 310, 50));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("KẾT THÚC");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 494, 358));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KetQua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCauDung;
    private javax.swing.JTextField txtCauSai;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
