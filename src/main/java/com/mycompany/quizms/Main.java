/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.quizms;

import javax.swing.ImageIcon;


/**
 *
 * @author tariq
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        imageIcon();
    }
    public void imageIcon()
    {
        ImageIcon t_icon=new ImageIcon("C:\\Users\\HP\\Downloads\\img\\teacher5 icon.jpg");
        imgTeacher.setIcon(t_icon);
        ImageIcon s_icon=new ImageIcon("C:\\Users\\HP\\Downloads\\img\\student2 icon.jpg");
        imgStudent.setIcon(s_icon);
    }
    
    static String str;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnTeachersPortal = new javax.swing.JButton();
        btnStudentsPortal = new javax.swing.JButton();
        imgTeacher = new javax.swing.JLabel();
        imgStudent = new javax.swing.JLabel();
        lblQMS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");

        btnTeachersPortal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTeachersPortal.setText("Teacher Portal");
        btnTeachersPortal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeachersPortalActionPerformed(evt);
            }
        });

        btnStudentsPortal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnStudentsPortal.setText("Student Portal");
        btnStudentsPortal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsPortalActionPerformed(evt);
            }
        });

        imgTeacher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        imgStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblQMS.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblQMS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQMS.setText("QUIZ MANAGEMENT SYSTEM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnTeachersPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(btnStudentsPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(imgStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(lblQMS, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblQMS, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTeachersPortal)
                    .addComponent(btnStudentsPortal))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentsPortalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsPortalActionPerformed
        // TODO add your handling code here:
        Login login= new Login();
        str="Student";
        login.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_btnStudentsPortalActionPerformed

    private void btnTeachersPortalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeachersPortalActionPerformed
        // TODO add your handling code here:
        Login login= new Login();
        login.setVisible(true);
        setVisible(false);
        str="Teacher";
    }//GEN-LAST:event_btnTeachersPortalActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                new Main().setLocationRelativeTo(null);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStudentsPortal;
    private javax.swing.JButton btnTeachersPortal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imgStudent;
    private javax.swing.JLabel imgTeacher;
    private javax.swing.JLabel lblQMS;
    // End of variables declaration//GEN-END:variables
}
