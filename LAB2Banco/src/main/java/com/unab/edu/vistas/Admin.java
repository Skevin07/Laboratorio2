/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.vistas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import com.unab.edu.entidades.cuentasUsuario;
import com.unab.edu.entidades.usuario;
import com.unab.edu.dao.clsUsuario;
import com.unab.edu.dao.clscuentausuario;
import java.util.function.ToDoubleFunction;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author landa
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    
    usuario user;
    
    public Admin() {
        initComponents();  
        Date date = new Date();
        user = Loguin.usua;
        lblWelcome.setText("Bienvenido " + user.getUsuario());
        Calendar Cal = Calendar.getInstance();
        jDateChooser1.setCalendar(Cal);
        DisplayMember();
         
    }
    
    String ValueMember[];
    int contador = 1;

    void DisplayMember() {
        setLocationRelativeTo(this);
        Date date = new Date();
        DefaultComboBoxModel cbde = new DefaultComboBoxModel();
        clsUsuario usua = new clsUsuario();
        ArrayList<usuario> users = usua.TraerUsuarios();
        ValueMember = new String[users.size() + 1];
        
        String filas[] = new String[5];
        cbde.addElement("");
        for (var iterarDatosusuario : users) {
            
            filas[0] = String.valueOf(iterarDatosusuario.getIdUsuario());
            filas[1] = iterarDatosusuario.getUsuario();
            ValueMember[contador] = filas[0];
            cbdefault.addElement(filas[1]);
            contador++;
            
        }
        
        cbxDepositante.setModel(cbdefault);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPicture1 = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        lblAbono = new javax.swing.JLabel();
        txtAbono = new javax.swing.JTextField();
        lblAbono1 = new javax.swing.JLabel();
        cbxDepositante = new javax.swing.JComboBox<>();
        lblAbono2 = new javax.swing.JLabel();
        btnAbonar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPicture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coins.png"))); // NOI18N

        lblBienvenida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblBienvenida.setText("BANCO CENTRAL SALVADOREÑO");

        lblAbono.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAbono.setText("Cantidad A Abonar :   $");

        txtAbono.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        lblAbono1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAbono1.setText("FECHA");

        cbxDepositante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAbono2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAbono2.setText("Depositante :");

        btnAbonar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnAbonar.setText("ABONAR");
        btnAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonarActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblWelcome.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPicture1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAbono1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAbono2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxDepositante, 0, 186, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(txtAbono, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblBienvenida)
                        .addGap(86, 86, 86))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbonar)
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPicture1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcome)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAbono1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAbono)
                            .addComponent(txtAbono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxDepositante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAbono2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnAbonar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonarActionPerformed
        
         try {
            clscuentausuario cuentausu = new clscuentausuario();
            cuentasusuario cuentausua = new cuentasusuario();
            
            cuentausua.setIdUsuario(Integer.parseInt(ValueMember[cbxDepositante.getSelectedIndex()]));
            cuentausua.setSaldo(Double.parseDouble(txtAbono.getText()));
            cuentausua.setFecha(jDateChooser1.getDate());
            cuentausua.setTransaccion(1);
            cuentausu.agregarTransaccion(cuentausuar);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
        
    }//GEN-LAST:event_btnAbonarActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbonar;
    private javax.swing.JComboBox<String> cbxDepositante;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel lblAbono;
    private javax.swing.JLabel lblAbono1;
    private javax.swing.JLabel lblAbono2;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblPicture1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField txtAbono;
    // End of variables declaration//GEN-END:variables

   
}
