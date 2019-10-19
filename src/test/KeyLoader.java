package test;

import com.banorte.BanorteException;
import com.banorte.pinpad.Vx820Segura;
import com.banorte.ConectorBanorte;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JTextField;

public class KeyLoader extends javax.swing.JFrame {

    /**
     * Constructor of FrameKey class
     */
    public KeyLoader() {
        initComponents();
        
        txtId.setText("");
        txtUser.setText("");
        txtPassword.setText("");
        txtControlNumber.setText("");
        txtLanguage.setText("EN");
        txtUrl.setText("https://via.pagosbanorte.com/InterredesSeguro");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        titlePanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblControlNumber = new javax.swing.JLabel();
        txtControlNumber = new javax.swing.JTextField();
        lblLanguage = new javax.swing.JLabel();
        txtLanguage = new javax.swing.JTextField();
        lblUrl = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        btnSale = new javax.swing.JButton();
        btnCharge = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JPinpad v0.1");
        setMinimumSize(new java.awt.Dimension(600, 350));
        setName("frmKey"); // NOI18N

        titlePanel.setMinimumSize(new java.awt.Dimension(600, 20));
        titlePanel.setName("titlePanel"); // NOI18N
        titlePanel.setPreferredSize(new java.awt.Dimension(600, 20));
        titlePanel.setLayout(new java.awt.BorderLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Carga de Llave");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTitle.setName("lblTitle"); // NOI18N
        titlePanel.add(lblTitle, java.awt.BorderLayout.NORTH);

        getContentPane().add(titlePanel, java.awt.BorderLayout.NORTH);

        mainPanel.setMinimumSize(new java.awt.Dimension(600, 330));
        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setPreferredSize(new java.awt.Dimension(600, 330));
        mainPanel.setLayout(new java.awt.GridBagLayout());

        lblId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblId.setText("Id");
        lblId.setName("lblId"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        mainPanel.add(lblId, gridBagConstraints);

        txtId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtId.setMinimumSize(new java.awt.Dimension(100, 30));
        txtId.setName("txtId"); // NOI18N
        txtId.setPreferredSize(new java.awt.Dimension(100, 30));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtId, gridBagConstraints);

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUser.setText("User");
        lblUser.setName("lblUser"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        mainPanel.add(lblUser, gridBagConstraints);

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUser.setMinimumSize(new java.awt.Dimension(200, 30));
        txtUser.setName("txtUser"); // NOI18N
        txtUser.setPreferredSize(new java.awt.Dimension(200, 30));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtUser, gridBagConstraints);

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPassword.setText("Password");
        lblPassword.setName("lblPassword"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        mainPanel.add(lblPassword, gridBagConstraints);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.setMinimumSize(new java.awt.Dimension(200, 30));
        txtPassword.setName("txtPassword"); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(200, 30));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtPassword, gridBagConstraints);

        lblControlNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblControlNumber.setText("Control No.");
        lblControlNumber.setName("lblControlNumber"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        mainPanel.add(lblControlNumber, gridBagConstraints);

        txtControlNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtControlNumber.setMinimumSize(new java.awt.Dimension(200, 30));
        txtControlNumber.setName("txtControlNumber"); // NOI18N
        txtControlNumber.setPreferredSize(new java.awt.Dimension(200, 30));
        txtControlNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtControlNumberKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtControlNumber, gridBagConstraints);

        lblLanguage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLanguage.setText("Languange");
        lblLanguage.setName("lblLanguage"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        mainPanel.add(lblLanguage, gridBagConstraints);

        txtLanguage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLanguage.setMinimumSize(new java.awt.Dimension(100, 30));
        txtLanguage.setName("txtLanguage"); // NOI18N
        txtLanguage.setPreferredSize(new java.awt.Dimension(100, 30));
        txtLanguage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLanguageKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtLanguage, gridBagConstraints);

        lblUrl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUrl.setText("URL");
        lblUrl.setName("lblUrl"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        mainPanel.add(lblUrl, gridBagConstraints);

        txtUrl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUrl.setMinimumSize(new java.awt.Dimension(400, 30));
        txtUrl.setName("txtUrl"); // NOI18N
        txtUrl.setPreferredSize(new java.awt.Dimension(400, 30));
        txtUrl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUrlKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtUrl, gridBagConstraints);

        btnSale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sale.png"))); // NOI18N
        btnSale.setText("Venta");
        btnSale.setMaximumSize(new java.awt.Dimension(100, 33));
        btnSale.setMinimumSize(new java.awt.Dimension(100, 33));
        btnSale.setName("btnSale"); // NOI18N
        btnSale.setPreferredSize(new java.awt.Dimension(100, 33));
        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleActionPerformed(evt);
            }
        });
        btnSale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaleKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(btnSale, gridBagConstraints);

        btnCharge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCharge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/load.png"))); // NOI18N
        btnCharge.setText("Cargar");
        btnCharge.setMaximumSize(new java.awt.Dimension(100, 33));
        btnCharge.setMinimumSize(new java.awt.Dimension(100, 33));
        btnCharge.setName("btnCharge"); // NOI18N
        btnCharge.setPreferredSize(new java.awt.Dimension(100, 33));
        btnCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChargeActionPerformed(evt);
            }
        });
        btnCharge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnChargeKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(btnCharge, gridBagConstraints);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed
        openSaleWindow();
    }//GEN-LAST:event_btnSaleActionPerformed

    private void btnChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChargeActionPerformed
        load();
    }//GEN-LAST:event_btnChargeActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        setFocus(evt);
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        setFocus(evt);
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        setFocus(evt);
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtControlNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtControlNumberKeyPressed
        setFocus(evt);
    }//GEN-LAST:event_txtControlNumberKeyPressed

    private void txtLanguageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLanguageKeyPressed
        setFocus(evt);
    }//GEN-LAST:event_txtLanguageKeyPressed

    private void txtUrlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUrlKeyPressed
        setFocus(evt);
    }//GEN-LAST:event_txtUrlKeyPressed

    private void btnChargeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnChargeKeyPressed
        setFocus(evt);
    }//GEN-LAST:event_btnChargeKeyPressed

    private void btnSaleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaleKeyPressed
        setFocus(evt);
    }//GEN-LAST:event_btnSaleKeyPressed

    /**
     * Sets the key where the cursor must be located
     * @param evt the key event
     */
    public void setFocus(java.awt.event.KeyEvent evt) {
        String key = getKeySource(evt);
        int keyCode = evt.getKeyCode();
        
        if(keyCode == 40) {                        
            switch(key){
                case "txtId": txtUser.requestFocusInWindow(); break;
                case "txtUser": txtPassword.requestFocusInWindow(); break;
                case "txtPassword": txtControlNumber.requestFocusInWindow(); break;
                case "txtControlNumber": txtLanguage.requestFocusInWindow(); break;
                case "txtLanguage": txtUrl.requestFocusInWindow(); break;
                case "txtUrl": btnCharge.requestFocusInWindow(); break;
            }
        }
        else if(keyCode == 38){
            switch(key){                
                case "txtUser": txtId.requestFocusInWindow(); break;
                case "txtPassword": txtUser.requestFocusInWindow(); break;
                case "txtControlNumber": txtPassword.requestFocusInWindow(); break;
                case "txtLanguage": txtControlNumber.requestFocusInWindow(); break;
                case "txtUrl": txtLanguage.requestFocusInWindow(); break;
                case "btnCharge": 
                case "btnSale": txtUrl.requestFocusInWindow(); break;
            }
        }
        else if(keyCode == 10 && key.equals("btnCharge")){
            load();
        }
        else if(keyCode == 10 && key.equals("btnSale")){
            openSaleWindow();
        }
        else if(keyCode == 37 && key.equals("btnCharge")){
            btnSale.requestFocusInWindow();
        }
        else if(keyCode == 39 && key.equals("btnSale")){
            btnCharge.requestFocusInWindow();
        }
    }
    
    /**
     * Gets the name of the key event source.
     * @param evt the key event
     * @return the name of the source where the event is found
     */
    public String getKeySource(java.awt.event.KeyEvent evt) {
        String keySource = evt.getSource().getClass().getSimpleName();
        String key = null;
        
        if(keySource.equals("JTextField"))
            key = ((JTextField)evt.getSource()).getName();
        else if(keySource.equals("JButton"))
            key = ((JButton)evt.getSource()).getName();
        
        return key;
    }
    
    /**
     * Performs the information load
     */
    public void load(){
        Vx820Segura pinpad  = new Vx820Segura("EN");

        HashMap information = new HashMap();
        
        String serialNumber = "";

        try {
            pinpad.getInformation(information);
            
            serialNumber = String.valueOf(information.get("SERIAL_NUMBER"));
        }
        catch (BanorteException e){
            System.out.println("Information retrieval failed: " + e.getMessage());
        }

        //Creation of HashMap to get the selector
        HashMap outgoingSelector = new HashMap();
        
        String selector = "";
        
        try {
            pinpad.getSelector(outgoingSelector);
            
            selector = String.valueOf(outgoingSelector.get("SELECTOR"));
        }
        catch (BanorteException e){
            System.out.println("Selector retrieval failed: " + e.getMessage());
        }

        //Creation of HashMaps to get the key
        HashMap incomingKey = new HashMap();
        HashMap outgoingKey = new HashMap();                        

        //Setting the incomingKey HashMap parameters
        incomingKey.put("MERCHANT_ID", txtId.getText());
        incomingKey.put("USER", txtUser.getText());
        incomingKey.put("PASSWORD", txtPassword.getText());
        incomingKey.put("RESPONSE_LANGUAGE", txtLanguage.getText());
        incomingKey.put("CMD_TRANS", "GET_KEY");
        incomingKey.put("CONTROL_NUMBER", txtControlNumber.getText());
        incomingKey.put("BANORTE_URL", "https://via.pagosbanorte.com/InterredesSeguro");
        incomingKey.put("SELECTOR", selector);

        //Using sendTransaction method to request the key
        try {
            ConectorBanorte.sendTransaction(incomingKey, outgoingKey);
        }
        catch (BanorteException e){
            System.out.println("Key retrieval failed: " + e.getMessage());
        }

        //Getting response information
        String payworksResult = String.valueOf(outgoingKey.get("PAYW_RESULT"));
        String payworksCode = String.valueOf(outgoingKey.get("PAYW_CODE"));        
        String masterKey = String.valueOf(outgoingKey.get("TEXT"));

        //payworksResult correctness validation ("A")        
        if (!payworksResult.equals("A")) {
            HashMap loadCancellation = new HashMap();
            
            loadCancellation.put("SERIAL_NUMBER", serialNumber);

            //Key load cancellation
            try {
                pinpad.cancelarCargaLlave(incomingKey);
            }
            catch (BanorteException e){
                System.out.println("Charge cancellation failed: " + e.getMessage());
            }
        } 
        else {
            //HashMap creation to load the pinpad key
            HashMap keyLoad = new HashMap();
            
            keyLoad.put("SERIAL_NUMBER", serialNumber);
            keyLoad.put("MASTER_KEY", masterKey);

            //Charging Pinpad key
            try {
                pinpad.loadMasterKey(keyLoad);
            } 
            catch (BanorteException e) {
                System.out.println("Key charge failed: " + e.getMessage());
            }
        }     
    }
    
    /**
     * Opens the FrameVenta window
     */
    public void openSaleWindow(){
        Sales mvv = new Sales();
        
        mvv.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(KeyLoader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KeyLoader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KeyLoader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KeyLoader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeyLoader().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCharge;
    private javax.swing.JButton btnSale;
    private javax.swing.JLabel lblControlNumber;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUrl;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField txtControlNumber;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUrl;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}