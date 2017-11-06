/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Biology;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author x13481152
 */
public class FNotesGUI extends javax.swing.JFrame {

    /**
     * Creates new form writeupsGUI
     */
    public FNotesGUI() {
        initComponents();
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        notesreturnbutton = new javax.swing.JButton();
        teacherbutton = new javax.swing.JButton();
        LCBiologybutton = new javax.swing.JButton();
        SkoolButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Notes");

        notesreturnbutton.setText("Back");
        notesreturnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notesreturnbuttonActionPerformed(evt);
            }
        });

        teacherbutton.setBackground(new java.awt.Color(51, 153, 255));
        teacherbutton.setText("Bio Notes");
        teacherbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherbuttonActionPerformed(evt);
            }
        });

        LCBiologybutton.setBackground(new java.awt.Color(51, 153, 255));
        LCBiologybutton.setText("LCBiology");
        LCBiologybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LCBiologybuttonActionPerformed(evt);
            }
        });

        SkoolButton.setBackground(new java.awt.Color(51, 153, 255));
        SkoolButton.setText("Skool.ie");
        SkoolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkoolButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(notesreturnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SkoolButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teacherbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LCBiologybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(240, 240, 240))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(notesreturnbutton))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LCBiologybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SkoolButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //declare buttons
    //return button
    private void notesreturnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notesreturnbuttonActionPerformed

        FfieldstudyGUI fs = new FfieldstudyGUI();
        fs.setVisible(true); 
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_notesreturnbuttonActionPerformed

    //teacher button
    private void teacherbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherbuttonActionPerformed
try { Desktop.getDesktop().browse(new URL("http://www.thephysicsteacher.ie/leavingcertbiologyhome.html").toURI()); 
} 
catch (URISyntaxException | IOException e) { 
}        // TODO add your handling code here:
    }//GEN-LAST:event_teacherbuttonActionPerformed

    //LCBiology button
    private void LCBiologybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LCBiologybuttonActionPerformed
        // TODO add your handling code here:
        try
            { Desktop.getDesktop().browse(new URL("http://leavingbio.net/").toURI()); 
} 
catch (URISyntaxException | IOException e) { 
}      
    }//GEN-LAST:event_LCBiologybuttonActionPerformed
    //skool button
    private void SkoolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkoolButtonActionPerformed
    try
        { Desktop.getDesktop().browse(new URL("http://www.skoool.ie/examcentre_senior.asp?id=2093").toURI()); 
} 
catch (URISyntaxException | IOException e) { 
}   // TODO add your handling code here:
    }//GEN-LAST:event_SkoolButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FNotesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FNotesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FNotesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FNotesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LCBiologybutton;
    private javax.swing.JButton SkoolButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton notesreturnbutton;
    private javax.swing.JButton teacherbutton;
    // End of variables declaration//GEN-END:variables
}
