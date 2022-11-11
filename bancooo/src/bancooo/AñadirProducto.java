/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bancooo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AñadirProducto extends javax.swing.JFrame {
    TarjetaCredito nuevo;
    TarjetaDebito nuevoo;
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<TarjetaCredito> tarjetasC;
    ArrayList<TarjetaDebito> tarjetasD;
    ArrayList numeros = new ArrayList();
    String strid;
    

    public AñadirProducto(ArrayList<TarjetaCredito> tarjetasdecredito,ArrayList<TarjetaDebito> tarjetasdedebito) {
        initComponents();
        tarjetasC = tarjetasdecredito;
        tarjetasD = tarjetasdedebito;
        this.setTitle("Opciones");
        
        
    }
    public AñadirProducto() {
        initComponents();
        tarjetasC = new ArrayList();
        tarjetasD = new ArrayList();
        
    }

    public ArrayList<TarjetaCredito> getTarjetasC() {
        return tarjetasC;
    }

    public void setTarjetasC(ArrayList<TarjetaCredito> tarjetasC) {
        this.tarjetasC = tarjetasC;
    }

    public ArrayList<TarjetaDebito> getTarjetasD() {
        return tarjetasD;
    }

    public void setTarjetasD(ArrayList<TarjetaDebito> tarjetasD) {
        this.tarjetasD = tarjetasD;
    }
    
    public void refrescarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        
            Object a[] = new Object[3];
            a[0] = CrearUsuario.txt1.getText();
            a[1] = cbo9.getSelectedItem().toString();
            a[2] = strid;
            modelo.addRow(a);

        jTable1.setModel(modelo);
    }
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt6 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        cbo9 = new javax.swing.JComboBox<>();
        txt7 = new javax.swing.JLabel();
        txt8 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Recuerde que este producto se hará bajo su nombre");

        jLabel2.setText("Si desea generar un producto a nombre de alguien diferente");

        jLabel3.setText("Debe volver al menú principal y crear un nuevo usuario");

        jButton1.setText("Menú principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de producto que desea añadir");

        txt6.setText("jPasswordField1");

        jLabel5.setText("La opción que solicita está protegida por seguridad, ");

        jLabel6.setText("por esta razón te solicitamos que ingreses nuevamente tu contraseña");

        jButton2.setText("Añadir Producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cbo9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de crédito", "Tarjeta Débito" }));

        txt7.setText("Para TC ingrese su salario mensual, para TD ingrese monto a inicializar");

        txt8.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(197, 197, 197)
                                        .addComponent(jButton2))
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(txt7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))
                            .addComponent(cbo9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt7)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        CrearUsuario cu = new CrearUsuario();
        cu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (InicioSesion.cbo3.getText().equals(txt6.getText())) {
            //genera 15 numeros aleatorios 
            for (int i = 1; i <= 15; i++) {
                int numero = (int) (Math.random() * 9 + 1);
                numeros.add(numero);
            }

            String a = String.valueOf((numeros.get(0)));
            String b = String.valueOf((numeros.get(1)));
            String c = String.valueOf((numeros.get(2)));
            String d = String.valueOf((numeros.get(3)));
            String e = String.valueOf((numeros.get(4)));
            String f = String.valueOf((numeros.get(5)));
            String g = String.valueOf((numeros.get(6)));
            String h = String.valueOf((numeros.get(7)));
            String i = String.valueOf((numeros.get(8)));
            String j = String.valueOf((numeros.get(9)));
            String k = String.valueOf((numeros.get(10)));
            String l = String.valueOf((numeros.get(11)));
            String m = String.valueOf((numeros.get(12)));
            String n = String.valueOf((numeros.get(13)));
            String o = String.valueOf((numeros.get(14)));

            //el numero aleatorio de 15 digitos
            strid = (a + b + c + d + e + f + g + h + i + j + k + l + m + n + o);

            if (cbo9.getSelectedItem().toString().equals("Tarjeta de crédito")) {
                nuevo = new TarjetaCredito(CrearUsuario.txt1.getText(), 0.0, (Double.parseDouble(txt8.getText())*4), strid);
                tarjetasC.add(nuevo);
                //System.out.println(tarjetasC.toString());
                

                JOptionPane.showMessageDialog(null, "Usted acaba de adquirir una tarjeta de crédito con número:\n" + "                                   " + strid + "\n                    Gracias por confiar en nosotros.");
            } else {
                nuevoo = new TarjetaDebito(CrearUsuario.txt1.getText(), 0.0, Double.parseDouble(txt8.getText()), strid);
                tarjetasD.add(nuevoo);
                //System.out.println(tarjetasD.toString());
                

                JOptionPane.showMessageDialog(null, "Usted acaba de adquirir una tarjeta débito con número:\n" + "                                   " + strid + "\n                    Gracias por confiar en nosotros.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "ERROR, LA CONTRASEÑA NO COINCIDE");
        }
        refrescarTabla();

        Opciones acceso = new Opciones();
        acceso.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Opciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cbo9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField txt6;
    private javax.swing.JLabel txt7;
    public static javax.swing.JTextField txt8;
    // End of variables declaration//GEN-END:variables
}
