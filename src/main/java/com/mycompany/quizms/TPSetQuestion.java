package com.mycompany.quizms;
import static com.mycompany.quizms.GlobalClass.isAdded;
import javax.swing.ButtonGroup;
import static com.mycompany.quizms.GlobalClass.quiz1;
import static com.mycompany.quizms.GlobalClass.quiz2;
import static com.mycompany.quizms.GlobalClass.quiz3;
import static com.mycompany.quizms.GlobalClass.quiz4;
import static com.mycompany.quizms.GlobalClass.quiz5;
import static com.mycompany.quizms.GlobalClass.quiz6;


public class TPSetQuestion extends javax.swing.JFrame {
    int i=0;
    int x=1;
    
    void checkQuiz()
    {
       
        switch(TPChooseQuiz.i)
        {
            case 1:
                quiz(quiz1);
                isAdded[Login.tIndexR][TPChooseQuiz.tIndexC]=true;
                break;
            case 2:
                quiz(quiz2);
                isAdded[Login.tIndexR][TPChooseQuiz.tIndexC]=true;
                break;
            case 3:
                quiz(quiz3);
                isAdded[Login.tIndexR][TPChooseQuiz.tIndexC]=true;
                break;
            case 4:
                 quiz(quiz4);
                 isAdded[Login.tIndexR][TPChooseQuiz.tIndexC]=true;
                 //System.out.println("quiz4");
                break;
            case 5:
                quiz(quiz5);
                isAdded[Login.tIndexR][TPChooseQuiz.tIndexC]=true;
                break;
            case 6:
                quiz(quiz6);
                isAdded[Login.tIndexR][TPChooseQuiz.tIndexC]=true;
                break;
                
        }
        
    }
    void quiz(String quiz[][])
    {
       quiz[i][0]=txtQuestion.getText();  
       quiz[i][1]=txtOption1.getText();
       quiz[i][2]=txtOption2.getText();
       quiz[i][3]=txtOption3.getText();
       quiz[i][4]=txtOption4.getText();
       if(rBtnOption1.isSelected())
       {
           //System.out.println("tp op1");
           quiz[i][5]=txtOption1.getText();
       }
       else if(rBtnOption2.isSelected())
       {
          // System.out.println("tp op2");
           quiz[i][5]=txtOption2.getText();
       }
       else if(rBtnOption3.isSelected())
       {
          // System.out.println("tp op3");
           quiz[i][5]=txtOption3.getText();
       }
       else if(rBtnOption4.isSelected())
       {
          // System.out.println("tp op4");
           quiz[i][5]=txtOption4.getText();
       }
       /*if(txtQuestion.getText().equals("") || txtOption1.getText().equals("") 
             || txtOption2.getText().equals("") || txtOption3.getText().equals("") || 
               txtOption4.getText().equals("") || isNotButtonGroupSelected() )
       {
           TPError error = new TPError();
           error.setVisible(true);
       }*/
       //i++;
      
    } 
        boolean isNotButtonGroupSelected(){
            if(rBtnOption1.isSelected() || rBtnOption2.isSelected() || rBtnOption3.isSelected() || rBtnOption4.isSelected())
                return false;
            return true;
    }
    
    
    /*public boolean error()
    {
        if(txtQuestion.getText().equals("") || txtOption1.getText().equals("") 
             || txtOption2.getText().equals("") || txtOption3.getText().equals("") || 
               txtOption4.getText().equals("") || buttonGroup1.isSelected(null) )
        {
           TPError error = new TPError();
           error.setVisible(true);
           return true;
        }
        return false;
    }*/
    public boolean error()
    {
        if(txtQuestion.getText().equals("") || txtOption1.getText().equals("") 
             || txtOption2.getText().equals("") || txtOption3.getText().equals("") || 
               txtOption4.getText().equals("") || isNotButtonGroupSelected() )
       {
           TPError error = new TPError();
           error.setVisible(true);
           return true;
       }
        return false;
    }
    
    public void nextQuestion()
    {
        i++;
        x++;
        lblQuestion.setText("Enter Question "+x+":");
        txtQuestion.setText(null);
        txtOption1.setText(null);
        txtOption2.setText(null);
        txtOption3.setText(null);
        txtOption4.setText(null);
        //rBtnOption1.setSelected(false);
        //rBtnOption2.setSelected(false);
        //rBtnOption3.setSelected(false);
        //rBtnOption4.setSelected(false);
        buttonGroup1.clearSelection();
    }
    
    public TPSetQuestion() {
        initComponents();
        switch(Login.subject)
        {
            case "ODE":
                lblSubjectQuiz.setText("ODE Quiz");
                break;
            case "OOP":
                lblSubjectQuiz.setText("OOP Quiz");
                break;
        }
        lblQuestion.setText("Enter Question "+x+":");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblQuestion = new javax.swing.JLabel();
        txtQuestion = new javax.swing.JTextField();
        lblOptions = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        rBtnOption2 = new javax.swing.JRadioButton();
        rBtnOption1 = new javax.swing.JRadioButton();
        rBtnOption3 = new javax.swing.JRadioButton();
        rBtnOption4 = new javax.swing.JRadioButton();
        txtOption1 = new javax.swing.JTextField();
        txtOption2 = new javax.swing.JTextField();
        txtOption3 = new javax.swing.JTextField();
        txtOption4 = new javax.swing.JTextField();
        lblSubjectQuiz = new javax.swing.JLabel();
        lblTeachersPortal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Set Quiz");

        lblQuestion.setText("Enter Question");

        txtQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuestionActionPerformed(evt);
            }
        });

        lblOptions.setText("Enter Options:");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBtnOption2);
        rBtnOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnOption2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBtnOption1);
        rBtnOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnOption1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBtnOption3);

        buttonGroup1.add(rBtnOption4);

        txtOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption1ActionPerformed(evt);
            }
        });

        txtOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption2ActionPerformed(evt);
            }
        });

        lblSubjectQuiz.setText("ODE Quiz");

        lblTeachersPortal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTeachersPortal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeachersPortal.setText("Teacher's Portal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuestion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOptions)
                            .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rBtnOption4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtOption4))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rBtnOption1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtOption1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rBtnOption2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtOption2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rBtnOption3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(72, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addComponent(lblSubjectQuiz)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTeachersPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(379, 379, 379))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTeachersPortal)
                .addGap(18, 18, 18)
                .addComponent(lblSubjectQuiz)
                .addGap(32, 32, 32)
                .addComponent(lblQuestion)
                .addGap(18, 18, 18)
                .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblOptions)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rBtnOption1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOption1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rBtnOption2)
                            .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(rBtnOption3))
                    .addComponent(txtOption3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rBtnOption4)
                    .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuestionActionPerformed
     
        
        
   
    
    }//GEN-LAST:event_txtQuestionActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        
    
        
        if(x<=3)
        {
            checkQuiz();
            if(error()==false)
            {
                nextQuestion();
            }
            //nextQuestion();
        //buttonGroup1.clearSelection();

        }
        else if(x==4)
        {
            checkQuiz(); 
            //btnNext.setVisible(false);
            if(error()==false)
            {
                nextQuestion();
            }
            //nextQuestion();
            
        }
        else
        {
            checkQuiz();
            error();
            /*if(error()==false)
            {
                nextQuestion();
            }*/
            //nextQuestion();
            QuizAdded QA = new QuizAdded();
            QA.setVisible(true);
            setVisible(false);
            
        }
        
        
        /*if(x==6)
        {
            setVisible(false);
        }*/
        
        //System.out.println(quiz1[0][5]);
        //System.out.println(quiz1[1][5]);
        //System.out.println(quiz1[2][5]);
        //System.out.println(quiz1[3][5]);
        //System.out.println(quiz1[4][5]);
       
        /*ButtonGroup g1 = new ButtonGroup();
        g1.add(rBtnOption1);
        g1.add(rBtnOption2);
        
         System.out.println(g1.getSelection().getActionCommand());*/
        
        
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void rBtnOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBtnOption1ActionPerformed

    private void rBtnOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnOption2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBtnOption2ActionPerformed

    private void txtOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOption2ActionPerformed

    private void txtOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOption1ActionPerformed

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
            java.util.logging.Logger.getLogger(TPSetQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPSetQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPSetQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPSetQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TPSetQuestion().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblOptions;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblSubjectQuiz;
    private javax.swing.JLabel lblTeachersPortal;
    private javax.swing.JRadioButton rBtnOption1;
    private javax.swing.JRadioButton rBtnOption2;
    private javax.swing.JRadioButton rBtnOption3;
    private javax.swing.JRadioButton rBtnOption4;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables
}
