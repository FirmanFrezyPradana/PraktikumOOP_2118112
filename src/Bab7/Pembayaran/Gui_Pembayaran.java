/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bab7.Pembayaran;

import javax.swing.JOptionPane;

/**
 *
 * @author icornermalang
 */
public class Gui_Pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form Gui_Pembayaran
     */
    public Gui_Pembayaran() {
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

        tot_belanja = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_kode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_cash = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        cmb_metode = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_jenisMember = new javax.swing.JTextField();
        btn_bayar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Masukkan tota Belanja");

        jLabel2.setText("Masukkan Kode Member");

        jLabel3.setText("Nama Member");

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        jLabel4.setText("Saldo Tersisa");

        jLabel5.setText("Alamat");

        txt_alamat.setColumns(20);
        txt_alamat.setRows(5);
        jScrollPane1.setViewportView(txt_alamat);

        jLabel6.setText("Metode bayar");

        cmb_metode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saldo", "Cash", " " }));
        cmb_metode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_metodeActionPerformed(evt);
            }
        });

        jLabel7.setText("Jenis Member");

        btn_bayar.setText("Bayar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(100, 100, 100)
                                .addComponent(tot_belanja))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(147, 147, 147)
                                .addComponent(txt_nama))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(150, 150, 150)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4)
                                    .addComponent(txt_jenisMember)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addComponent(cmb_metode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_cash, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                                            .addComponent(btn_bayar))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86)
                        .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cari)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_belanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_jenisMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_metode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(txt_cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_bayar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
//        Pembayaran Payment;
//
//        Payment = new S0001();
//        S0001 s0001 = (S0001) Payment;
//        Payment.CekKode(txt_kode.getText());
//
//        Payment = new G0001();
//        G0001 g0001 = (G0001) Payment;
//        Payment.CekKode(txt_kode.getText());
//
//        Payment = new P0001();
//        P0001 p0001 = (P0001) Payment;
//        Payment.CekKode(txt_kode.getText());
//
//        if (s0001.hasil() != 0) {
//            JOptionPane.showMessageDialog(null, "Anda tergolong member " + Payment.Member(s0001));
//            txt_nama.setText(s0001.name);
//            txt_jenisMember.setText(Payment.Member(p0001));
//            jTextField4.setText(Integer.toString(s0001.saldo));
//            txt_alamat.append(s0001.alamat);
//
//        } else if (p0001.hasil() != 0) {
//            JOptionPane.showMessageDialog(null, "Anda tergolong member " + Payment.Member(p0001));
//            txt_nama.setText(p0001.name);
//            txt_jenisMember.setText(Payment.Member(p0001));
//            jTextField4.setText(Integer.toString(p0001.saldo));
//            txt_alamat.append(p0001.alamat);
//        } else if (g0001.hasil() != 0) {
//            JOptionPane.showMessageDialog(null, "Anda tergolong member " + Payment.Member(g0001));
//            txt_nama.setText(g0001.name);
//            txt_jenisMember.setText(Payment.Member(g0001));
//            jTextField4.setText(Integer.toString(g0001.saldo));
//            txt_alamat.append(g0001.alamat);
//        } else {
//            JOptionPane.showMessageDialog(null, "Anda bukan tergolong member");
//        }


    }//GEN-LAST:event_btn_cariActionPerformed

    private void cmb_metodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_metodeActionPerformed
        // TODO add your handling code here:
//        Pembayaran Payment;
//
//        Payment = new S0001();
//        S0001 s0001 = (S0001) Payment;
//        S0001 Payment1 = (S0001) Payment;
////        Payment.CekKode(txt_kode.getText());
//
//        Payment = new G0001();
//        G0001 g0001 = (G0001) Payment;
//        Payment.CekKode(txt_kode.getText());
//
//        Payment = new P0001();
//        P0001 p0001 = (P0001) Payment;
//        Payment.CekKode(txt_kode.getText());
//
//        int total = Integer.parseInt(tot_belanja.getText());
//        if (cmb_metode.getSelectedIndex() == 0) {
//            if (s0001.hasil() != 0) {
//                Payment.CekKode(txt_kode.getText());
//                Payment.HitPembayaran(total);
//                JOptionPane.showMessageDialog(null, "Pembayaran Berhasil ");
//
////                txt_cash.setText(Double.toString(Payment1.PotSaldo()));
//            } else if (p0001.hasil() != 0) {
//                JOptionPane.showMessageDialog(null, "Pembayaran Berhasil ");
//
//            } else if (g0001.hasil() != 0) {
//                JOptionPane.showMessageDialog(null, "Pembayaran Berhasil ");
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Anda bukan tergolong member");
//            }
//        }

    }//GEN-LAST:event_cmb_metodeActionPerformed

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
            java.util.logging.Logger.getLogger(Gui_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_Pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bayar;
    private javax.swing.JButton btn_cari;
    private javax.swing.JComboBox<String> cmb_metode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField tot_belanja;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_cash;
    private javax.swing.JTextField txt_jenisMember;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
