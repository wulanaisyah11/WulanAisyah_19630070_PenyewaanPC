/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19630070;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author Windows 8.1
 */
public class framekomp extends javax.swing.JFrame {
    private String[] JudulKolom={"nama_komputer","keterangan"};
    //ConfigDB praktikum;
    private int[]LebarKolom ={200,200};
    private String SQL="SELECT * FROM komputer";
    String dateChooser;
    /**
     * Creates new form framekomp
     */
    public framekomp() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        new configdb().setJudulTabel(tabel_komputer, JudulKolom);
        new configdb().tampilTabel(tabel_komputer, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_komputer, LebarKolom);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namakomp = new javax.swing.JTextField();
        ketkomp = new javax.swing.JTextField();
        bsave = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        carikomp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_komputer = new javax.swing.JTable();
        bbatal = new javax.swing.JButton();
        bcetakkomp = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("KOMPUTER");

        jLabel2.setText("Nama Komputer");

        jLabel3.setText("Keterangan");

        bsave.setText("Save");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        jLabel4.setText("Cari Data");

        carikomp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                carikompKeyReleased(evt);
            }
        });

        tabel_komputer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_komputer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_komputerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_komputer);

        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        bcetakkomp.setText("Cetak Data");
        bcetakkomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetakkompActionPerformed(evt);
            }
        });

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carikomp, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(149, 149, 149)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bsave)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bubah)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bbatal))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(namakomp)
                                            .addComponent(ketkomp, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bhapus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bcetakkomp))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namakomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ketkomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsave)
                    .addComponent(bubah)
                    .addComponent(bbatal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(carikomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bhapus)
                    .addComponent(bcetakkomp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(keluar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        // TODO add your handling code here:
        String[] Fieldnya ={"nama_komputer","keterangan"};
        String[] Valuenya = {namakomp.getText(),ketkomp.getText()};
        new configdb().Ubah("komputer","nama_komputer",namakomp.getText(), Fieldnya, Valuenya);
        JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
        new configdb().setJudulTabel(tabel_komputer, JudulKolom);
        new configdb().tampilTabel(tabel_komputer, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_komputer, LebarKolom);
                                        
                
    }//GEN-LAST:event_bubahActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        String[] Fieldnya ={"nama_komputer","keterangan"};
        String[] Valuenya = {namakomp.getText(),ketkomp.getText()};
        
        if ( new configdb().DuplikasiPrimeryKey("komputer","nama_komputer",namakomp.getText()))
            {
              JOptionPane.showMessageDialog(null,"Nama Komputer Sudah Ada");
        }else{
                 new configdb().Simpan("komputer",Fieldnya, Valuenya);
                 JOptionPane.showMessageDialog(null,"Data Berhasil di Simpan");
                 new configdb().setJudulTabel(tabel_komputer, JudulKolom);
                 new configdb().tampilTabel(tabel_komputer, JudulKolom, SQL);
                 new configdb().setLebarKolomTabel(tabel_komputer, LebarKolom);
                }
    }//GEN-LAST:event_bsaveActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
        String[] Fieldnya ={"nama_komputer","keterangan"};
        String[] Valuenya = {namakomp.getText(),ketkomp.getText()};
        new configdb().Hapus("komputer","nama_komputer",namakomp.getText());
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        new configdb().setJudulTabel(tabel_komputer, JudulKolom);
        new configdb().tampilTabel(tabel_komputer, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_komputer, LebarKolom);
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        // TODO add your handling code here:
        namakomp.setText("");
        ketkomp.setText("");
    }//GEN-LAST:event_bbatalActionPerformed

    private void tabel_komputerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_komputerMouseClicked
        // TODO add your handling code here:
        int row = tabel_komputer.getSelectedRow();
         
        namakomp.setText(tabel_komputer.getModel().getValueAt(row,0).toString());
        ketkomp.setText(tabel_komputer.getModel().getValueAt(row,1).toString());
    }//GEN-LAST:event_tabel_komputerMouseClicked

    private void carikompKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carikompKeyReleased
        // TODO add your handling code here:
       String SQLCari ="SELECT*FROM komputer WHERE nama_komputer LIKE'%"+carikomp.getText()+"%' OR keterangan LIKE '%"+carikomp.getText()+"%'";
       new configdb().setJudulTabel(tabel_komputer, JudulKolom);
       new configdb().tampilTabel(tabel_komputer, JudulKolom, SQLCari);
       new configdb().setLebarKolomTabel(tabel_komputer, LebarKolom);
    }//GEN-LAST:event_carikompKeyReleased

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void bcetakkompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcetakkompActionPerformed
        // TODO add your handling code here:
        new configdb().tampilLaporan("src/laporan19630070/Lap_DataKomputer.jrxml","SELECT * FROM komputer");
    }//GEN-LAST:event_bcetakkompActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
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
            java.util.logging.Logger.getLogger(framekomp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framekomp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framekomp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framekomp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framekomp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcetakkomp;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsave;
    private javax.swing.JButton bubah;
    private javax.swing.JTextField carikomp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField ketkomp;
    private javax.swing.JTextField namakomp;
    private javax.swing.JTable tabel_komputer;
    // End of variables declaration//GEN-END:variables
}
