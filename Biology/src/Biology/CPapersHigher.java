package Biology;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JOptionPane;

/*
 * CPapers Higher
 * @author K.Maher
 * 20-Apr-2015
 */


public class CPapersHigher extends javax.swing.JFrame {
    public CPapersHigher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        h14Btn = new javax.swing.JButton();
        h13Btn = new javax.swing.JButton();
        h12Btn3 = new javax.swing.JButton();
        h11Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLbl.setText("Higher Level");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        h14Btn.setBackground(new java.awt.Color(255, 51, 51));
        h14Btn.setText("2014");
        h14Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h14BtnActionPerformed(evt);
            }
        });

        h13Btn.setBackground(new java.awt.Color(255, 51, 51));
        h13Btn.setText("2013");
        h13Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h13BtnActionPerformed(evt);
            }
        });

        h12Btn3.setBackground(new java.awt.Color(255, 51, 51));
        h12Btn3.setText("2012");
        h12Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h12Btn3ActionPerformed(evt);
            }
        });

        h11Btn.setBackground(new java.awt.Color(255, 51, 51));
        h11Btn.setText("2011");
        h11Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h11BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(h12Btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(h14Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(h13Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(h11Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(titleLbl)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLbl)
                    .addComponent(backBtn))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h13Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h14Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(h12Btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(h11Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void h12Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h12Btn3ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2012/LC025ALP000EV.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null,"Error, unable to find that exam paper.");
        }
    }//GEN-LAST:event_h12Btn3ActionPerformed

    private void h11BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h11BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2011/LC025ALP000EV.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null,"Error, unable to find that exam paper.");
        }
    }//GEN-LAST:event_h11BtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        CPapers myPapers = new CPapers();
        myPapers.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void h13BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h13BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2013/LC025ALP000EV.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null,"Error, unable to find that exam paper.");
        }
    }//GEN-LAST:event_h13BtnActionPerformed

    private void h14BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h14BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2014/LC025ALP000EV.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null,"Error, unable to find that exam paper.");
        }
    }//GEN-LAST:event_h14BtnActionPerformed

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
            java.util.logging.Logger.getLogger(CPapersHigher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CPapersHigher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CPapersHigher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CPapersHigher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CPapersHigher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton h11Btn;
    private javax.swing.JButton h12Btn3;
    private javax.swing.JButton h13Btn;
    private javax.swing.JButton h14Btn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
