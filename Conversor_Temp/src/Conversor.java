
import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class Conversor extends javax.swing.JFrame {

   
    public Conversor() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        Lbl_Conversor = new javax.swing.JLabel();
        Lbl_Ingrese = new javax.swing.JLabel();
        Txt_Ingreso = new javax.swing.JTextField();
        Rbtn_fahrenheith = new javax.swing.JRadioButton();
        RbtnKelvin = new javax.swing.JRadioButton();
        RbtnCelcius = new javax.swing.JRadioButton();
        RbtnRadian = new javax.swing.JRadioButton();
        BtnConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio 2 - De Celcius a Farenheit");

        Lbl_Conversor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Lbl_Conversor.setText("   Conversor de Temperatura");
        Lbl_Conversor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Lbl_Ingrese.setText("Ingrese Temperatura en Grados");

        Txt_Ingreso.setText(" ");
        Txt_Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IngresoActionPerformed(evt);
            }
        });

        buttonGroup1.add(Rbtn_fahrenheith);
        Rbtn_fahrenheith.setText("A Fahrenheith");

        buttonGroup1.add(RbtnKelvin);
        RbtnKelvin.setText("A Kelvin");

        buttonGroup1.add(RbtnCelcius);
        RbtnCelcius.setText("A Celcius");

        buttonGroup1.add(RbtnRadian);
        RbtnRadian.setText("A Radianes");

        BtnConvertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/icons8-aprobar-y-actualizar-48.png"))); // NOI18N
        BtnConvertir.setText("CONVERTIR");
        BtnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lbl_Conversor, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BtnConvertir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 17, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Rbtn_fahrenheith)
                                        .addComponent(RbtnKelvin))
                                    .addGap(127, 127, 127))))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RbtnCelcius)
                            .addComponent(Lbl_Ingrese, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(RbtnRadian)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(Txt_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Lbl_Conversor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_Ingrese, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rbtn_fahrenheith)
                    .addComponent(RbtnCelcius))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbtnRadian)
                    .addComponent(RbtnKelvin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IngresoActionPerformed
        
        //String Nro = Txt_Ingreso.getText().trim();
        
    }//GEN-LAST:event_Txt_IngresoActionPerformed

    private void BtnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConvertirActionPerformed
        try {
             String Nro = Txt_Ingreso.getText().trim();
        double nro_double = Double.valueOf(Nro);
        double conver;
        
       
        
       
        if(Rbtn_fahrenheith.isSelected()){
            conver = nro_double * 9/5 + 32;
            JOptionPane.showMessageDialog(this, " Se convirtio a: Fahrenheith " + conver);                                    
        }
        else if(RbtnKelvin.isSelected()){
            conver = nro_double + 273.15;
                        JOptionPane.showMessageDialog(this, " Se convirtio a: Kelvin " + conver);
        }
        else if(RbtnRadian.isSelected()){
            conver = (nro_double + 273.15) * 9/5 ;
                         JOptionPane.showMessageDialog(this, " Se convirtio a: Radian " + conver);
        }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa NUMEROS (Ej: 1 2 3)");
        }
//      String seleccion = buttonGroup1.getSelection().getActionCommand();
//      double conver;   
//            switch (seleccion){
//                    case "A Fahrenheith":
//                        conver = nro_double * 9/5 + 32;
//                         System.out.println(" Se convirtio a: Fahrenheith " + conver);
//                        break;
//                    case "A Kelvin":
//                        conver = nro_double + 273.15;
//                         System.out.println(" Se convirtio a: Kelvin " + conver);
//                        break;
//                    case "A Radianes":
//                        conver = (nro_double + 273.15) * 9/5 ;
//                         System.out.println(" Se convirtio a: Radianes " + conver);
//                        break;
//                    default: 
//                        break;
//            }
        
        
    }//GEN-LAST:event_BtnConvertirActionPerformed

    
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConvertir;
    private javax.swing.JLabel Lbl_Conversor;
    private javax.swing.JLabel Lbl_Ingrese;
    private javax.swing.JRadioButton RbtnCelcius;
    private javax.swing.JRadioButton RbtnKelvin;
    private javax.swing.JRadioButton RbtnRadian;
    private javax.swing.JRadioButton Rbtn_fahrenheith;
    private javax.swing.JTextField Txt_Ingreso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
