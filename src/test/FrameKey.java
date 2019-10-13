package test;

import com.banorte.BanorteException;
import com.banorte.pinpad.Vx820Segura;
import com.banorte.ConectorBanorte;
import java.util.HashMap;

public class FrameKey extends javax.swing.JFrame {

    /**
     * Creates new form FrameKey
     */
    public FrameKey() {
        initComponents();
        
        TxtID.setText("");
        TxtUser.setText("");
        TxtPass.setText("");
        TxtControl.setText("");
        TxtLan.setText("EN");
        TxtURL.setText("https://via.pagosbanorte.com/InterredesSeguro");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TxtID = new javax.swing.JTextField();
        TxtUser = new javax.swing.JTextField();
        TxtPass = new javax.swing.JTextField();
        TxtControl = new javax.swing.JTextField();
        TxtLan = new javax.swing.JTextField();
        TxtURL = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Carga de Llave");

        jLabel2.setText("ID");

        jLabel3.setText("User");

        jLabel4.setText("Password");

        jLabel5.setText("Control No.");

        jLabel6.setText("Languange");

        jLabel7.setText("URL");

        jButton1.setText("Venta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtID)
                                    .addComponent(TxtUser)
                                    .addComponent(TxtPass)
                                    .addComponent(TxtLan)
                                    .addComponent(TxtURL, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(TxtControl))))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtLan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        test.FrameVenta mvv = new test.FrameVenta();
        mvv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Creamos el objeto pinpad
         Vx820Segura pinpad  = new Vx820Segura("EN");

        //Creamos el HashMap para obtener la información
        HashMap informacion = new HashMap();
        String numeroSerie = "";

        try {
            pinpad.getInformation(informacion);
            numeroSerie = String.valueOf(informacion.get("SERIAL_NUMBER"));
        }
        catch (BanorteException e){
            System.out.println("Falla al obtener la información: " + e.getMessage());
        }

        //Se crea el HashMap para obtener el selector
        HashMap selectorSalida = new HashMap();
        String selector = "";
        
        try {
            pinpad.getSelector(selectorSalida);
            selector = String.valueOf(selectorSalida.get("SELECTOR"));
        }
        catch (BanorteException e){
            System.out.println("Falla al obtener selector: " + e.getMessage());
        }

        //Se crean los HashMaps para solicitor la llave a Banorte
        HashMap llaveEntrada = new HashMap();
        HashMap llaveSalida = new HashMap();
        String resultadoPayw = "";
        String codigoPayw = "";
        String llaveMaestra = "";

        //Llenamos los parámetros de la table
        llaveEntrada.put("MERCHANT_ID", TxtID.getText());
        llaveEntrada.put("USER", TxtUser.getText());
        llaveEntrada.put("PASSWORD", TxtPass.getText());
        llaveEntrada.put("RESPONSE_LANGUAGE", TxtLan.getText());
        llaveEntrada.put("CMD_TRANS", "GET_KEY");
        llaveEntrada.put("CONTROL_NUMBER", TxtControl.getText());
        llaveEntrada.put("BANORTE_URL", "https://via.pagosbanorte.com/InterredesSeguro");
        llaveEntrada.put("SELECTOR", selector);

        //Utilizamos el método sendTransaction para solicitar la llave a Banorte
        try {
            ConectorBanorte.sendTransaction(llaveEntrada, llaveSalida);
        }
        catch (BanorteException e){
            System.out.println("Falla al obtener llave: " + e.getMessage());
        }

        //Obtenemos los datos de la respuesta
        resultadoPayw = String.valueOf(llaveSalida.get("PAYW_RESULT"));
        codigoPayw = String.valueOf(llaveSalida.get("PAYW_CODE"));
        llaveMaestra = String.valueOf(llaveSalida.get("TEXT"));

        //Se valida que se haya obtenido correctamente la llave resutadoPayw = "A"
        if (!"A".equals(resultadoPayw)) {
            HashMap cancelarCarga = new HashMap();
            cancelarCarga.put("SERIAL_NUMBER", numeroSerie);

            //Se cancela carga de la llave
            try {
                pinpad.cancelarCargaLlave(llaveEntrada);
            } 
            catch (BanorteException e){
                System.out.println("Falla al cancelar la carga: " + e.getMessage());
            }
        } 
        else {
            //Se crea el HashMap para cargar la llave en el pinpad
            HashMap cargarLlave = new HashMap();
            cargarLlave.put("SERIAL_NUMBER", numeroSerie);
            cargarLlave.put("MASTER_KEY", llaveMaestra);

            //Realizamos la carga de la llave en el pinpad
            try {
                pinpad.loadMasterKey(cargarLlave);
            } 
            catch (BanorteException e) {
                System.out.println("Falla al cargar llave: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDActionPerformed
        
    }//GEN-LAST:event_TxtIDActionPerformed

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
            java.util.logging.Logger.getLogger(FrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameKey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtControl;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtLan;
    private javax.swing.JTextField TxtPass;
    private javax.swing.JTextField TxtURL;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}