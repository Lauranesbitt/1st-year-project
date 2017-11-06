package Biology;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JOptionPane;

/*
 * CMarkingHigher
 * @author K.Maher
 * 19-Apr-2015
 */

public class CMarkingHigher extends javax.swing.JFrame {
    public CMarkingHigher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        h14Btn = new javax.swing.JButton();
        h13Btn = new javax.swing.JButton();
        h12Btn = new javax.swing.JButton();
        h11Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLbl.setText("Higher Level");

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

        h12Btn.setBackground(new java.awt.Color(255, 51, 51));
        h12Btn.setText("2012");
        h12Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h12BtnActionPerformed(evt);
            }
        });

        h11Btn.setBackground(new java.awt.Color(255, 51, 51));
        h11Btn.setText("2011");
        h11Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h11BtnActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(h12Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .add(h14Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(h13Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .add(h11Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(backBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(titleLbl)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(titleLbl)
                    .add(backBtn))
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(h13Btn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(h14Btn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(h12Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .add(h11Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void h12BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h12BtnActionPerformed
    try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/Marking_Schemes/2012/Leaving_Certificate/Biology/Higher/Paper/Paper%20.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null,"Error, unable to find that marking scheme.");
        }
    }//GEN-LAST:event_h12BtnActionPerformed

    private void h11BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h11BtnActionPerformed
      try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/Marking_Schemes/2011/Leaving_Certificate/Biology/Higher/Paper/Paper%20.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null,"Error, unable to find that marking scheme.");
        }
    }//GEN-LAST:event_h11BtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        CPapers myPapers = new CPapers();
        myPapers.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void h13BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h13BtnActionPerformed
       try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/Marking_Schemes/2013/Leaving_Certificate/Biology/Higher/Paper/Paper%20.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null,"Error, unable to find that marking scheme.");
        }
    }//GEN-LAST:event_h13BtnActionPerformed

    private void h14BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h14BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/markingscheme/e/e38f15c3-082a-48d6-84d1-cb2ca51d9930/e38f15c3-082a-48d6-84d1-cb2ca51d9930.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null,"Error, unable to find that marking scheme.");
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
            java.util.logging.Logger.getLogger(CMarkingHigher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CMarkingHigher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CMarkingHigher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CMarkingHigher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CMarkingHigher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton h11Btn;
    private javax.swing.JButton h12Btn;
    private javax.swing.JButton h13Btn;
    private javax.swing.JButton h14Btn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables

}
