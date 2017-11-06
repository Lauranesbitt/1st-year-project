package Biology;

/*
 * MainMenu
 * @author K.Maher
 * 20-Apr-20F15
 */
public class MainMenu extends javax.swing.JFrame {

    //Creates new form MainMenu
    public MainMenu() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studyoflifebtn = new javax.swing.JButton();
        cellbtn = new javax.swing.JButton();
        fieldstudybtn = new javax.swing.JButton();
        organismbtn = new javax.swing.JButton();
        textlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studyoflifebtn.setBackground(new java.awt.Color(255, 153, 0));
        studyoflifebtn.setText("Study of Life");
        studyoflifebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyoflifebtnActionPerformed(evt);
            }
        });

        cellbtn.setBackground(new java.awt.Color(255, 51, 51));
        cellbtn.setText("The Cell");
        cellbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellbtnActionPerformed(evt);
            }
        });

        fieldstudybtn.setBackground(new java.awt.Color(51, 153, 255));
        fieldstudybtn.setText("Field Study");
        fieldstudybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldstudybtnActionPerformed(evt);
            }
        });

        organismbtn.setBackground(new java.awt.Color(102, 204, 0));
        organismbtn.setText("The Organism");
        organismbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organismbtnActionPerformed(evt);
            }
        });

        textlabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textlabel.setText("Biology");
        textlabel.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(organismbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(studyoflifebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cellbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldstudybtn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(textlabel)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studyoflifebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(cellbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(organismbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(fieldstudybtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studyoflifebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyoflifebtnActionPerformed
        SGUI mySGUI = new SGUI();
        mySGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_studyoflifebtnActionPerformed

    private void organismbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organismbtnActionPerformed
        OGUI myOGUI = new OGUI();
        myOGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_organismbtnActionPerformed

    private void fieldstudybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldstudybtnActionPerformed
        FfieldstudyGUI myFfieldstudyGUI = new FfieldstudyGUI();
        myFfieldstudyGUI.setVisible(true);
        dispose();

    }//GEN-LAST:event_fieldstudybtnActionPerformed

    private void cellbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellbtnActionPerformed
        CGUI myCGUI = new CGUI();
        myCGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_cellbtnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cellbtn;
    private javax.swing.JButton fieldstudybtn;
    private javax.swing.JButton organismbtn;
    private javax.swing.JButton studyoflifebtn;
    private javax.swing.JLabel textlabel;
    // End of variables declaration//GEN-END:variables
}
