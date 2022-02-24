/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizms;
import static com.mycompany.quizms.GlobalClass.isAttempted;
import static com.mycompany.quizms.GlobalClass.quiz1;
import static com.mycompany.quizms.GlobalClass.quiz2;
import static com.mycompany.quizms.GlobalClass.quiz3;
import static com.mycompany.quizms.GlobalClass.quiz4;
import static com.mycompany.quizms.GlobalClass.quiz5;
import static com.mycompany.quizms.GlobalClass.quiz6;
import static com.mycompany.quizms.GlobalClass.result;


/**
 *
 * @author HP
 */
public class SPAttemptQuestion extends javax.swing.JFrame {

    /**
     * Creates new form AttemptQuiz
     */
    int i=0;
    int x=1, s;
    String[][] tempArray;
    int score=0;
    private void checkQuiz()
    {
       s=SPChooseQuiz.i;
       isAttempted[Login.index][SPChooseQuiz.indexC]=true;
        switch(s)
        {
            
            case 1:
                tempArray = quiz1.clone();
              /*  if (x==1){setValues(tempArray);}
                else if(x==5){quiz(tempArray);  
                setValues(tempArray);  
                quiz(tempArray);}  
                else {quiz(tempArray);   
                setValues(tempArray);} 
                isAttempted[Login.index][SPChooseQuiz.indexC]=true;*/
                break;
            case 2:
                tempArray = quiz2.clone();
                /*if (x==1){setValues(tempArray);}
                else if(x==5){quiz(tempArray);
                setValues(tempArray);
                quiz(tempArray);}
                else {quiz(tempArray);
                setValues(tempArray);}
                isAttempted[Login.index][SPChooseQuiz.indexC]=true;*/
                break;
            case 3:
                tempArray = quiz3.clone();
               /* if (x==1){setValues(tempArray);}
                else if(x==5){quiz(tempArray);
                setValues(tempArray);
                quiz(tempArray);}
                else {quiz(tempArray);
                setValues(tempArray);}
                isAttempted[Login.index][SPChooseQuiz.indexC]=true;*/
                break;
            case 4:
                tempArray = quiz4.clone();
              /*  if (x==1){setValues(tempArray);}
                else if(x==5){quiz(tempArray);
                setValues(tempArray);
                quiz(tempArray);}
                else {quiz(tempArray);
                setValues(tempArray);}
                isAttempted[Login.index][SPChooseQuiz.indexC]=true;*/
                break;
            case 5:
                tempArray = quiz5.clone();
                /*if (x==1){setValues(tempArray);}
                else if(x==5){quiz(tempArray);
                setValues(tempArray);
                quiz(tempArray);}
                else {quiz(tempArray);
                setValues(tempArray);}
                isAttempted[Login.index][SPChooseQuiz.indexC]=true;*/
                break;
            case 6:
                tempArray = quiz6.clone();
               /* if (x==1){setValues(tempArray);}
                else if(x==5){quiz(tempArray);
                setValues(tempArray);
                quiz(tempArray);}
                else {quiz(tempArray);
                setValues(tempArray);}
                isAttempted[Login.index][SPChooseQuiz.indexC]=true;*/
                break;
                
        }
        
    }
    
    void setValues(String quiz[][])
    {
       lblQuestionStatement.setText(quiz[i][0]);
       rBtnOption1.setText(quiz[i][1]);
       rBtnOption2.setText(quiz[i][2]);
       rBtnOption3.setText(quiz[i][3]);
       rBtnOption4.setText(quiz[i][4]);
    }
    
    
    void quiz(String quiz[][])
    {  
       if(rBtnOption1.isSelected())
       {
          // System.out.println(quiz[i][5]+" "+rBtnOption1.getText());
           if(rBtnOption1.getText().equals(quiz[i][5]))
           {
               score++;
               //System.out.println(score);
               result[Login.index][SPChooseQuiz.indexC]=String.valueOf(score);
           }
           else
           {
              // System.out.println(score);
               //System.out.println("wrong");
               result[Login.index][SPChooseQuiz.indexC]=String.valueOf(score);
           }
       }
       if(rBtnOption2.isSelected())
       {
           //System.out.println(quiz[i][5]+" "+rBtnOption2.getText());
           if(rBtnOption2.getText().equals(quiz[i][5]))
           {
               score++;
               //System.out.println(score);
               result[Login.index][SPChooseQuiz.indexC]=String.valueOf(score);
           }
           else
           {
              // System.out.println(score);
               //System.out.println("wrong");
               result[Login.index][SPChooseQuiz.indexC]=String.valueOf(score);
           }
       }
       if(rBtnOption3.isSelected())
       {
           //System.out.println(quiz[i][5]+" "+rBtnOption3.getText());
           if(rBtnOption3.getText().equals(quiz[i][5]))
           {
               score++;
              // System.out.println(score);
               result[Login.index][SPChooseQuiz.indexC]=String.valueOf(score);
           }
           else
           {
               //System.out.println(score);
              // System.out.println("wrong");
               result[Login.index][SPChooseQuiz.indexC]=String.valueOf(score);
           }
       }
       if(rBtnOption4.isSelected())
       {
           //System.out.println(quiz[i][5]+" "+rBtnOption4.getText());
           if(rBtnOption4.getText().equals(quiz[i][5]))
           {
               score++;
              // System.out.println(score);
               result[Login.index][SPChooseQuiz.indexC]=String.valueOf(score);
           }
           else
           {
               //System.out.println(score);
               //System.out.println("wrong");
               result[Login.index][SPChooseQuiz.indexC]=String.valueOf(score);
           }
       }
       i++;
      
    } 
    
   
    
    private void nextQuestion()
    {
        setValues(tempArray);
        buttonGroup1.clearSelection();
        x++;
        lblQuestion.setText("Question "+x+":");
    }
    
    public SPAttemptQuestion() {
        initComponents();
        switch(SPChooseSubject.subject)
        {
            case "ODE":
                lblQuiz.setText("ODE Quiz");
                break;
            case "OOP":
                lblQuiz.setText("OOP Quiz");
                break;
        }
        checkQuiz();
        btnSubmit.setVisible(false);
        lblQuestion.setText("Question "+x+":");
        setValues(tempArray);
    }
    
    void isButtonGroupSelected(){
        if(rBtnOption1.isSelected() ||rBtnOption2.isSelected() || rBtnOption3.isSelected() || rBtnOption4.isSelected() )
        {
            System.out.println("");
        }
        else{
            //System.out.println("not selected");
            SPError error=new SPError();
            error.setVisible(true);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblQuestion = new javax.swing.JLabel();
        lblOptions = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        rBtnOption1 = new javax.swing.JRadioButton();
        rBtnOption2 = new javax.swing.JRadioButton();
        rBtnOption3 = new javax.swing.JRadioButton();
        rBtnOption4 = new javax.swing.JRadioButton();
        lblQuiz = new javax.swing.JLabel();
        lblStudentsPortal = new javax.swing.JLabel();
        lblQuestionStatement = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attempt Quiz");

        lblQuestion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblQuestion.setText("Question:");

        lblOptions.setFont(new java.awt.Font("Tahoma", 0, 116)); // NOI18N
        lblOptions.setText("Optons:");

        btnNext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBtnOption1);
        rBtnOption1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rBtnOption1.setText("jRadioButton5");

        buttonGroup1.add(rBtnOption2);
        rBtnOption2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rBtnOption2.setText("jRadioButton6");

        buttonGroup1.add(rBtnOption3);
        rBtnOption3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rBtnOption3.setText("jRadioButton7");

        buttonGroup1.add(rBtnOption4);
        rBtnOption4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rBtnOption4.setText("jRadioButton8");

        lblQuiz.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuiz.setText("ODE Quiz");

        lblStudentsPortal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblStudentsPortal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentsPortal.setText("STUDENT PORTAL");

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rBtnOption3)
                            .addComponent(rBtnOption4)
                            .addComponent(rBtnOption2)
                            .addComponent(rBtnOption1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuestionStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblStudentsPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(321, 321, 321))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(412, 412, 412))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblStudentsPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuiz)
                .addGap(40, 40, 40)
                .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuestionStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rBtnOption1)
                .addGap(18, 18, 18)
                .addComponent(rBtnOption2)
                .addGap(18, 18, 18)
                .addComponent(rBtnOption3)
                .addGap(18, 18, 18)
                .addComponent(rBtnOption4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        /*if(x==6)
        {
            btnNext.setText("back");
            StudentPortal SP = new StudentPortal();
            SP.setVisible(true);
            setVisible(false);
        }*/
        isButtonGroupSelected();
        if(x==4)
        {
            btnSubmit.setVisible(true);
            btnNext.setVisible(false);
        }
        if(x<=4)
        {
            quiz(tempArray);
            nextQuestion();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        quiz(tempArray);
        isButtonGroupSelected();
        SPQuizResult result=new SPQuizResult();
        result.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(SPAttemptQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPAttemptQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPAttemptQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPAttemptQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPAttemptQuestion().setVisible(true);
                new SPAttemptQuestion().setLocationRelativeTo(null);

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblOptions;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblQuestionStatement;
    private javax.swing.JLabel lblQuiz;
    private javax.swing.JLabel lblStudentsPortal;
    private javax.swing.JRadioButton rBtnOption1;
    private javax.swing.JRadioButton rBtnOption2;
    private javax.swing.JRadioButton rBtnOption3;
    private javax.swing.JRadioButton rBtnOption4;
    // End of variables declaration//GEN-END:variables
}
