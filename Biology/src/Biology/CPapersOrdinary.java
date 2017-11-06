package Biology;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JOptionPane;

/*
 * CPapersOrdinary
 * @author K.Maher
 * 20-Apr-2015
 */
public class CPapersOrdinary extends javax.swing.JFrame {

    public CPapersOrdinary() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        o14Btn = new javax.swing.JButton();
        o13Btn = new javax.swing.JButton();
        o12Btn = new javax.swing.JButton();
        o11Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLbl.setText("Ordinary Level");

        o14Btn.setBackground(new java.awt.Color(255, 51, 51));
        o14Btn.setText("2014");
        o14Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o14BtnActionPerformed(evt);
            }
        });

        o13Btn.setBackground(new java.awt.Color(255, 51, 51));
        o13Btn.setText("2013");
        o13Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o13BtnActionPerformed(evt);
            }
        });

        o12Btn.setBackground(new java.awt.Color(255, 51, 51));
        o12Btn.setText("2012");
        o12Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o12BtnActionPerformed(evt);
            }
        });

        o11Btn.setBackground(new java.awt.Color(255, 51, 51));
        o11Btn.setText("2011");
        o11Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o11BtnActionPerformed(evt);
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
                            .addComponent(o12Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(o14Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(o13Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(o11Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(o13Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o14Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(o12Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(o11Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        CPapers myPapers = new CPapers();
        myPapers.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void o11BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o11BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/exam_papers/2011/leaving_certificate/biology/ordinary/paper/paper.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error, unable to find that exam paper.");
        }
    }//GEN-LAST:event_o11BtnActionPerformed

    private void o12BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o12BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/exam_papers/2012/LeavingCertificate/Biology/Ordinary/Paper/Paper%20.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error, unable to find that exam paper.");
        }
    }//GEN-LAST:event_o12BtnActionPerformed

    private void o13BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o13BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/exam_papers/2013/leaving_certificate/biology/ordinary/paper/paper.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error, unable to find that exam paper.");
        }
    }//GEN-LAST:event_o13BtnActionPerformed

    private void o14BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o14BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/Exam_Papers/2014/Leaving_Certificate/Biology/Ordinary/Paper/Paper%20.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error, unable to find that exam paper.");
        }
    }//GEN-LAST:event_o14BtnActionPerformed

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
            java.util.logging.Logger.getLogger(CPapersOrdinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CPapersOrdinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CPapersOrdinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CPapersOrdinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CPapersOrdinary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton o11Btn;
    private javax.swing.JButton o12Btn;
    private javax.swing.JButton o13Btn;
    private javax.swing.JButton o14Btn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
