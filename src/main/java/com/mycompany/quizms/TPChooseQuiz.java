/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.quizms;
import static com.mycompany.quizms.GlobalClass.isAdded;




/**
 *
 * @author tariq
 */
public class TPChooseQuiz extends javax.swing.JFrame {
        static int i;
        static int tIndexC;
    /**
     * Creates new form TPSetQuiz
     */
    public TPChooseQuiz() {
        initComponents();
        switch(Login.subject)
        {
            case "ODE":
                lblSubjectQuiz.setText("ODE Quizzes");
                break;
            case "OOP":
                lblSubjectQuiz.setText("OOP Quizzes");
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    int isAdded()
    {
        //int quiz = SPAttemptQuiz.i;
        if(isAdded[Login.tIndexR][tIndexC]==false)
        {
            return 0;
        } 
        else
        {
            return 1;
        }
    }
    public int checkSubject()
    {
        if(Login.subject.equals("ODE"))
        {
            //System.out.println("checkSubject");
            return 0;
        }
        else
        {
           // System.out.println("checkSubject else");
            return 1;
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBack = new javax.swing.JButton();
        btnQuiz1 = new javax.swing.JButton();
        btnQuiz2 = new javax.swing.JButton();
        btnQuiz3 = new javax.swing.JButton();
        lblTeachersPortal = new javax.swing.JLabel();
        lblSubjectQuiz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teacher Portal");

        lblBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBack.setText("Back");
        lblBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBackActionPerformed(evt);
            }
        });

        btnQuiz1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnQuiz1.setText("Quiz 1");
        btnQuiz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuiz1ActionPerformed(evt);
            }
        });

        btnQuiz2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnQuiz2.setText("Quiz 2");
        btnQuiz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuiz2ActionPerformed(evt);
            }
        });

        btnQuiz3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnQuiz3.setText("Quiz 3");
        btnQuiz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuiz3ActionPerformed(evt);
            }
        });

        lblTeachersPortal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblTeachersPortal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeachersPortal.setText("TEACHER PORTAL");

        lblSubjectQuiz.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblSubjectQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubjectQuiz.setText("subj");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuiz2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuiz1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuiz3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(357, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTeachersPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubjectQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(428, 428, 428))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTeachersPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubjectQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnQuiz1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuiz2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuiz3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(lblBack)
                .addGap(78, 78, 78))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuiz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuiz1ActionPerformed
        // TODO add your handling code here:
        
        
        if(checkSubject()==0)
        {
            i=1;
            tIndexC=i-1;
            if(isAdded()==0)
            {
               TPSetQuestion setQuestion = new TPSetQuestion();
               setQuestion.setVisible(true);
               setVisible(false);
            }
            else{
                QuizAlreadyAdded QAA = new QuizAlreadyAdded();
                QAA.setVisible(true);
                setVisible(false);
            }
        }
        else
        {
            i=4;
            tIndexC=i-1;
            if(isAdded()==0)
            {
               TPSetQuestion setQuestion = new TPSetQuestion();
               setQuestion.setVisible(true);
               setVisible(false);
            }
            else{
                 QuizAlreadyAdded QAA = new QuizAlreadyAdded();
                QAA.setVisible(true);
                setVisible(false);
            }
            
        }
    }//GEN-LAST:event_btnQuiz1ActionPerformed

    private void btnQuiz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuiz2ActionPerformed
        // TODO add your handling code here:
        
        if(checkSubject()==0)
        {
            i=2;
            tIndexC=i-1;
            if(isAdded()==0)
            {
               TPSetQuestion setQuestion = new TPSetQuestion();
               setQuestion.setVisible(true);
               setVisible(false);
            }
            else{
                QuizAlreadyAdded QAA = new QuizAlreadyAdded();
                QAA.setVisible(true);
                setVisible(false);
            }
        }
        else
        {
            i=5;
            tIndexC=i-1;
            if(isAdded()==0)
            {
               TPSetQuestion setQuestion = new TPSetQuestion();
               setQuestion.setVisible(true);
               setVisible(false);
            }
            else{
                QuizAlreadyAdded QAA = new QuizAlreadyAdded();
                QAA.setVisible(true);
                setVisible(false);
            }
        }
    }//GEN-LAST:event_btnQuiz2ActionPerformed

    private void btnQuiz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuiz3ActionPerformed
        // TODO add your handling code here:
       
        if(checkSubject()==0)
        {
            i=3;
            tIndexC=i-1;
            if(isAdded()==0)
            {
               TPSetQuestion setQuestion = new TPSetQuestion();
               setQuestion.setVisible(true);
               setVisible(false);
            }
            else{
                QuizAlreadyAdded QAA = new QuizAlreadyAdded();
                QAA.setVisible(true);
                setVisible(false);
            }
        }
        else
        {
            i=6;
            tIndexC=i-1;
            if(isAdded()==0)
            {
               TPSetQuestion setQuestion = new TPSetQuestion();
               setQuestion.setVisible(true);
               setVisible(false);
            }
            else{
                QuizAlreadyAdded QAA = new QuizAlreadyAdded();
                QAA.setVisible(true);
                setVisible(false);
            }
        }
    }//GEN-LAST:event_btnQuiz3ActionPerformed

    private void lblBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBackActionPerformed
        // TODO add your handling code here:
        TeacherPortal TP = new TeacherPortal();
        TP.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_lblBackActionPerformed

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
            java.util.logging.Logger.getLogger(TPChooseQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPChooseQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPChooseQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPChooseQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TPChooseQuiz().setVisible(true);
                new TPChooseQuiz().setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuiz1;
    private javax.swing.JButton btnQuiz2;
    private javax.swing.JButton btnQuiz3;
    private javax.swing.JButton lblBack;
    private javax.swing.JLabel lblSubjectQuiz;
    private javax.swing.JLabel lblTeachersPortal;
    // End of variables declaration//GEN-END:variables
}
