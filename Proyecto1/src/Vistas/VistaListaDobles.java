/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.ListaDoble;
import controlador.Cliente;
import java.awt.Component;
import javax.swing.JOptionPane;


/**
 *
 * @author geovanny
 */
public class VistaListaDobles extends javax.swing.JFrame {

    /**
     * Creates new form VistaListaDobles
     */
    private ListaDoble lista;
    
    public void setLocationRelativeTo(Component c) {
        super.setLocationRelativeTo(c);
    }

    
    public VistaListaDobles() {
        this.setTitle("Listas Doblemente Enlazadas");
        initComponents();
        lista = new ListaDoble();
        setLocationRelativeTo(this);
    }
    

    public void establecerClientePos(){
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de nodo predecesor:")) ;
        Cliente client = new Cliente(cedula.getText(),apellido.getText(),nombre.getText(),sexo.getSelectedItem().toString(),edad.getText());
        lista.insertarPosicion(client, valor);
        JOptionPane.showMessageDialog(null,"Se agrego un elemento a la lista");
        cedula.setText(null);
        apellido.setText(null);
        nombre.setText(null);
        edad.setText(null);
        panel.setViewportView(new DibujoNodoDoble(lista.size(), "", lista));
        
     }
    
    public void establecerClienteFin(){
        Cliente client = new Cliente(cedula.getText(),apellido.getText(),nombre.getText(),sexo.getSelectedItem().toString(),edad.getText());
        lista.insertarFinal(client);
        JOptionPane.showMessageDialog(null,"Se agrego un elemento al final de la lista");
        cedula.setText(null);
        apellido.setText(null);
        nombre.setText(null);
        edad.setText(null);
        panel.setViewportView(new DibujoNodoDoble(lista.size(), "", lista));
        
    }
    public void establecerClienteInicio(){
        Cliente client = new Cliente(cedula.getText(),apellido.getText(),nombre.getText(),sexo.getSelectedItem().toString(),edad.getText());
        lista.insertarInicio(client);
        JOptionPane.showMessageDialog(null,"Se agrego un elemento al principio de la lista");
        cedula.setText(null);
        apellido.setText(null);
        nombre.setText(null);
        edad.setText(null);
        panel.setViewportView(new DibujoNodoDoble(lista.size(), "", lista));
        
     }
    
//    public void buscar(){
//        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave de nodo a buscar")) ;
//        if(lista.buscar(valor)!= null)
//        JOptionPane.showMessageDialog(null,lista.buscar(valor).dato );
//        else
//            JOptionPane.showMessageDialog(null,"elemento no existe" );
//    }
    
    public void buscarCedula(){
        String cedula =JOptionPane.showInputDialog("Ingrese cedula de nodo a buscar") ;
        if(lista.buscar(cedula) != null)
        JOptionPane.showMessageDialog(null,lista.buscar(cedula).dato);
        else
            JOptionPane.showMessageDialog(null,"elemento no existe" );
    }
    
    
    
    public void mostrar(){
        jTextArea1.setText(lista.leer());
        panel.setViewportView(new DibujoNodoDoble(lista.size(), "", lista));
    }
    //Eliminar por posicion
    public void eliminar(){
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de nodo a eliminar")) ;
        lista.eliminar(valor);
        panel.setViewportView(new DibujoNodoDoble(lista.size(), "", lista));
        JOptionPane.showMessageDialog(null, "Se Elimino el elemento");
        
    }
    //eliminar nodo final
    public void eliminar2(){
        lista.eliminarFinal();
        panel.setViewportView(new DibujoNodoDoble(lista.size(), "", lista));
        JOptionPane.showMessageDialog(null, "Elemento Eliminada");
    }
    public void modificar(){
    String valor =JOptionPane.showInputDialog("ingrese cedula del elemento");
            Cliente client = new Cliente(cedula.getText(),apellido.getText(),nombre.getText(),sexo.getSelectedItem().toString(),edad.getText());
            lista.modificar(valor, client);
            JOptionPane.showMessageDialog(rootPane,"Elemento Modificado");
            panel.setViewportView(new DibujoNodoDoble(lista.size(), "", lista));
            cedula.setText(null);
            apellido.setText(null);
            nombre.setText(null);
            edad.setText(null);
    }
//    public void buscarEle(){
//        String s = JOptionPane.showInputDialog("Ingrese cedula del elemento a buscar");
//        if(lista.Buscar(s)== true){
//            JOptionPane.showMessageDialog(null, "El elemento existe");
//        }else{
//            JOptionPane.showMessageDialog(null, "El elemento no existe");
//        }
//    }
    
    
    public void operacioneComboBox() {
        if (menuoperaciones.getSelectedItem().equals("eliminar por posicion")) {
            eliminar();
           
        } 
        
        if (menuoperaciones.getSelectedItem().equals("eliminar inicio")) {
            lista.eliminarInicio();
            panel.setViewportView(new DibujoNodoDoble(lista.size(), "", lista));
            JOptionPane.showMessageDialog(null, "Elemento Eliminado");
        }
        if (menuoperaciones.getSelectedItem().equals("eliminar final")) {
            eliminar2();
           
        }

        if(menuoperaciones.getSelectedItem().equals("insertar por posicion")){
            establecerClientePos();
            
        }
        
        if(menuoperaciones.getSelectedItem().equals("insertar inicio")){
            establecerClienteInicio();
            
        }
        
        if(menuoperaciones.getSelectedItem().equals("contar nodos")){
            JOptionPane.showMessageDialog(null, "el tamaño de la lista es :" + (lista.size()));
        }
        
        if(menuoperaciones.getSelectedItem().equals("modificar")){
            modificar();
        }
        
        if(menuoperaciones.getSelectedItem().equals("buscar por cedula")){
            
            buscarCedula();
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

        cedula = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        sexo = new javax.swing.JComboBox();
        edad = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        mostrar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        menuoperaciones = new javax.swing.JComboBox();
        calcular = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel = new javax.swing.JScrollPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino", " ", " " }));

        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        agregar.setText("Agregar Fin");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        menuoperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "insertar por posicion", "insertar inicio", "eliminar por posicion", "eliminar inicio", "eliminar final", "contar nodos", "modificar", "buscar por cedula", " " }));
        menuoperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuoperacionesActionPerformed(evt);
            }
        });

        calcular.setText("calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel1.setText("cedula:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Nombres:");

        jLabel4.setText("sexo");

        jLabel5.setText("edad");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Listas Doblemente Enlazada");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(205, 46, 46));
        jLabel7.setText("Grafico:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(salir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel5))
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29)
                                .addComponent(buscar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(108, 108, 108))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel6)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(menuoperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(agregar)
                        .addComponent(buscar)
                        .addComponent(jButton3))
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mostrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(33, 33, 33)
                        .addComponent(salir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuoperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular))
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void menuoperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuoperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuoperacionesActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_mostrarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        establecerClienteFin();
    }//GEN-LAST:event_agregarActionPerformed
    //eliminar
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        eliminar2();
    }//GEN-LAST:event_jButton3ActionPerformed
    //limpiar
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        operacioneComboBox();
    }//GEN-LAST:event_calcularActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        buscarCedula();
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaListaDobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaListaDobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaListaDobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaListaDobles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaListaDobles().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JToggleButton calcular;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField edad;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox menuoperaciones;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombre;
    private javax.swing.JScrollPane panel;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox sexo;
    // End of variables declaration//GEN-END:variables
}
