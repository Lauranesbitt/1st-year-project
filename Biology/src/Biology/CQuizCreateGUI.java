package Biology;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/* 
 * CQuizCreateGUI
 * @author K.Maher
 * 18-Apr-2015
 */
public class CQuizCreateGUI extends javax.swing.JFrame {

//declare and create ArrayList
    private ArrayList<CQuizCreate> aList;
    //intialise varaibles
    private String qs, chap, ans;
    private double percent;
    private int count;

    //constructor
    public CQuizCreateGUI() {
        initComponents();
        //create ArrayList
        aList = new ArrayList<>();
        //declare varaibles
        qs = new String();
        chap = new String();
        ans = new String();
        percent = 0.0;
        count = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        qsLbl = new javax.swing.JLabel();
        ansLbl = new javax.swing.JLabel();
        chapLbl = new javax.swing.JLabel();
        percentLbl = new javax.swing.JLabel();
        qsTf = new javax.swing.JTextField();
        ansTf = new javax.swing.JTextField();
        chapTf = new javax.swing.JTextField();
        percentTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        readBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLbl.setText("Create a Quiz");

        qsLbl.setText("Type a Question:");

        ansLbl.setText("Type an Answer:");

        chapLbl.setText("Choose a Chapter:");

        percentLbl.setText("Question is worth (%):");

        qsTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qsTfActionPerformed(evt);
            }
        });

        ansTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansTfActionPerformed(evt);
            }
        });

        chapTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chapTfActionPerformed(evt);
            }
        });

        percentTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentTfActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 102, 255));
        addBtn.setText("Add this Question to Quiz");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        displayBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        displayBtn.setForeground(new java.awt.Color(0, 102, 255));
        displayBtn.setText("Display All Questions");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 102, 255));
        searchBtn.setText("Search By Chapter");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 102, 255));
        deleteBtn.setText("Delete this Question from Quiz");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 102, 255));
        saveBtn.setText("Save Quiz for Later");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        readBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        readBtn.setForeground(new java.awt.Color(0, 102, 255));
        readBtn.setText("View Saved Quiz");
        readBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(displayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(readBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(percentTf)
                            .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qsTf)
                            .addComponent(chapTf)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(qsLbl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ansLbl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chapLbl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ansTf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(percentLbl, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(titleLbl)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLbl)
                    .addComponent(backBtn))
                .addGap(18, 18, 18)
                .addComponent(qsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qsTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ansLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ansTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chapLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chapTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(percentLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(percentTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(addBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(readBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        CQuiz myQuiz = new CQuiz();
        myQuiz.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void qsTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qsTfActionPerformed

    }//GEN-LAST:event_qsTfActionPerformed

    private void chapTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chapTfActionPerformed

    }//GEN-LAST:event_chapTfActionPerformed

    private void percentTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentTfActionPerformed

    }//GEN-LAST:event_percentTfActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        //ADD QUESTION TO QUIZ
        //get user input (text) from text fields
        qs = qsTf.getText();
        chap = chapTf.getText();
        ans = ansTf.getText();
        percent = Double.parseDouble(percentTf.getText());

        //declare and create new object, a
        CQuizCreate a = new CQuizCreate();
        //add details to object
        a.setName(qs);
        a.setType(chap);
        a.setAns(ans);
        a.setWeighting(percent);

        //add object to ArrayList
        aList.add(a);

        //increase counter
        count++;
    }//GEN-LAST:event_addBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        //DISPLAY ALL QUESTIONS
        //loop through ArrayList to print all the contents from it
        for (CQuizCreate x : aList) {
            JOptionPane.showMessageDialog(null, "Question: " + x.getName() + "\n Answer: " + x.getAns() + "\n Chapter: " + x.getType() + "\n % Marks: " + x.getWeighting() + "%");
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        //SEARCH BY CHAPTER
        //declare and create variables
        String searchType = JOptionPane.showInputDialog(null, "Please enter the chapter you wish to search for: ");

        //loop through ArrayList - go through each value at a time and store it in x
        /*declare an instance of the object and call it x,
         and traverse through the ArrayList called aList*/
        for (CQuizCreate x : aList) {
            if (searchType.equalsIgnoreCase(x.getType())) {
                JOptionPane.showMessageDialog(null, "Question: " + x.getName() + "\n Answer: " + x.getAns() + "\n Chapter: " + x.getType() + "\n % Marks: " + x.getWeighting() + "%");
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //DELETE QUESTION FROM QUIZ
        //if any fields are empty
        if (qsTf.getText().equals("") || ansTf.getText().equals("") || chapTf.getText().equals("") || percentTf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter question, answer, chapter and percent to delete.");
        } //if the size of the ArrayList is 0 (ie empty)
        else if (count == 0) {
            JOptionPane.showMessageDialog(null, "Sorry, there are no items to delete at this time.");
        } //if all fields hold data
        else {
            //check if all fields have data entered into them
            qs = qsTf.getText();
            chap = chapTf.getText();
            ans = ansTf.getText();
            percent = Double.parseDouble(percentTf.getText());

            //loop through ArrayList to find what needs to be deleted
            for (int i = 0; i < aList.size(); i++) {
                //if a match is found
                if (aList.get(i).getName().equals(qs) && aList.get(i).getAns().equals(ans) && aList.get(i).getType().equals(chap) & aList.get(i).getWeighting() == (percent)) {
                    aList.remove(i);
                    count = count - 1;
                    JOptionPane.showMessageDialog(null, "Question deleted successfully.");
                    break;
                }
                //if a match is not found
                if (i == count - 1) {
                    JOptionPane.showMessageDialog(null, "Sorry, that item cannot be found.");
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // SAVE QUIZ FOR LATER (WRITE QUIZ TO FILE)
        //declare objects
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        //manage exceptions
        try {
            //instantiate objects
            //outfile is a new file
            outFile = new File("output.data");
            //take outfile as a parameter
            fStream = new FileOutputStream(outFile);
            //take ostream as a parameter - write object to file
            oStream = new ObjectOutputStream(fStream);

            //write object a
            oStream.writeObject(aList);

            //output success message
            JOptionPane.showMessageDialog(null, "Quiz saved successfully!");

            //close stream
            oStream.close();

        } //manage catch
        catch (IOException e) {
            //print error message
            JOptionPane.showMessageDialog(null, "Error, unable the write to file.");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void readBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readBtnActionPerformed
        //VIEW SAVED QUIZ (READ SAVED QUIZ FROM FILE)
        //Identify the file with the correct question
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        //manage exceptions
        try {
            //instantiate objects
            //create Byte Stream to read data from file
            inFile = new File("output.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            //declare and create Array of Assessments
            ArrayList<CQuizCreate> xList;
            //read the object and cast it as an ArrayList of Assessments
            xList = (ArrayList<CQuizCreate>) oStream.readObject();

            //traverse the ArrayList to pull out all values
            for (CQuizCreate x : xList) {
                JOptionPane.showMessageDialog(null, "Question: " + x.getName() + "\n Answer: " + x.getAns() + "\n Chapter: " + x.getType() + "\n % Marks: " + x.getWeighting() + "%");
            }
            //close the object stream
            oStream.close();
            //manage catch
        } catch (IOException e) {
            //print error message
            JOptionPane.showMessageDialog(null, "Sorry, the file cannot be found.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_readBtnActionPerformed

    private void ansTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansTfActionPerformed

    }//GEN-LAST:event_ansTfActionPerformed

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
            java.util.logging.Logger.getLogger(CQuizCreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CQuizCreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CQuizCreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CQuizCreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CQuizCreateGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel ansLbl;
    private javax.swing.JTextField ansTf;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel chapLbl;
    private javax.swing.JTextField chapTf;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JLabel percentLbl;
    private javax.swing.JTextField percentTf;
    private javax.swing.JLabel qsLbl;
    private javax.swing.JTextField qsTf;
    private javax.swing.JButton readBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
