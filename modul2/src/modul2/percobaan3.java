/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul2;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class percobaan3 extends javax.swing.JFrame {

    /**
     * Creates new form percobaan3
     */
    public percobaan3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eUser = new javax.swing.JTextField();
        ePassword = new javax.swing.JPasswordField();
        jLogin = new javax.swing.JButton();
        jBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User");

        jLabel2.setText("Password");

        eUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eUserActionPerformed(evt);
            }
        });

        jLogin.setText("Login");
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });

        jBatal.setText("Batal");
        jBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLogin)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBatal)
                    .addComponent(eUser)
                    .addComponent(ePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(eUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLogin)
                    .addComponent(jBatal))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
         // TODO add your handling code here
        String Username, UPassword = new String("");
        Username = eUser.getText();
        UPassword = new String(ePassword.getPassword());
        boolean Pernyataan = Username.equals("sahrul") && 
        UPassword.equals("123");
        if(Pernyataan == true){ 
         JOptionPane.showMessageDialog(null, "Username: "+Username+"\n Password: "+UPassword, "Pesan", JOptionPane.INFORMATION_MESSAGE);
        }else{ 
        JOptionPane.showConfirmDialog(null, " Maaf user dan Password Salah", "Login", JOptionPane.DEFAULT_OPTION);
        }

    }//GEN-LAST:event_jLoginActionPerformed
    NewJFrame modul = new NewJFrame();
    modul.setVisible(true);
    this.dispose();
    
    private void eUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eUserActionPerformed

    private void jBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatalActionPerformed
        // TODO add your handling code here:
        eUser.setText("");
        ePassword.setText("");

    }//GEN-LAST:event_jBatalActionPerformed

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
            java.util.logging.Logger.getLogger(percobaan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(percobaan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(percobaan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(percobaan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new percobaan3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ePassword;
    private javax.swing.JTextField eUser;
    private javax.swing.JButton jBatal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLogin;
    // End of variables declaration//GEN-END:variables
}
