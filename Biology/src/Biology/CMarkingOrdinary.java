package Biology;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JOptionPane;

/*
 * CMarkingOrdinary
 * @author K.Maher
 * 19-Apr-2015
 */
public class CMarkingOrdinary extends javax.swing.JFrame {

    public CMarkingOrdinary() {
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

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(o12Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .add(o14Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(o13Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .add(o11Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .add(o13Btn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(o14Btn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(o12Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .add(o11Btn, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void o12BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o12BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/Marking_Schemes/2012/Leaving_Certificate/Biology/Ordinary/Paper/Paper%20.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error, unable to find that marking scheme.");
        }
    }//GEN-LAST:event_o12BtnActionPerformed

    private void o13BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o13BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/Marking_Schemes/2013/Leaving_Certificate/Biology/Ordinary/Paper/Paper%20.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error, unable to find that marking scheme.");
        }
    }//GEN-LAST:event_o13BtnActionPerformed

    private void o14BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o14BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/markingscheme/c/c902e7ee-9dda-4015-bc0f-6df46f76bb56/c902e7ee-9dda-4015-bc0f-6df46f76bb56.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error, unable to find that marking scheme.");
        }
    }//GEN-LAST:event_o14BtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        CPapers myPapers = new CPapers();
        myPapers.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void o11BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o11BtnActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://www.studyclix.ie/Content/Marking_Schemes/2011/Leaving_Certificate/Biology/Ordinary/Paper/Paper%20.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error, unable to find that marking scheme.");
        }
    }//GEN-LAST:event_o11BtnActionPerformed

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
            java.util.logging.Logger.getLogger(CMarkingOrdinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CMarkingOrdinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CMarkingOrdinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CMarkingOrdinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CMarkingOrdinary().setVisible(true);
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
