/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio4.GUI;

import ejercicio4.Analista;
import ejercicio4.ESaldoNoValido;
import ejercicio4.Empleado;
import ejercicio4.Lista;
import ejercicio4.Programador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodri
 */
public class VistaPrincipal extends javax.swing.JFrame {

    static Lista listaEmpleados = new Lista();

    public VistaPrincipal() {
        initComponents();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnCargarEmple = new javax.swing.JButton();
        btnGuardarEmple = new javax.swing.JButton();
        btnInsertarEmple = new javax.swing.JButton();
        btnVisualizarEmple = new javax.swing.JButton();
        btnCreadoMasivo = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        btnCargarEmple.setText("CARGAR EMPLEADO");
        btnCargarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarEmpleActionPerformed(evt);
            }
        });

        btnGuardarEmple.setText("GUARDAR EMPLEADO");
        btnGuardarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleActionPerformed(evt);
            }
        });

        btnInsertarEmple.setText("NUEVO O INSERTAR");
        btnInsertarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarEmpleActionPerformed(evt);
            }
        });

        btnVisualizarEmple.setText("VISUALIZAR EMPLEADO");
        btnVisualizarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarEmpleActionPerformed(evt);
            }
        });

        btnCreadoMasivo.setText("CREADO MASIVO");

        btnOrdenar.setText("ORDENAR");

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Primero");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Ultimo");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCreadoMasivo)
                        .addComponent(btnVisualizarEmple)
                        .addComponent(btnInsertarEmple)
                        .addComponent(btnOrdenar)
                        .addComponent(btnGuardarEmple)
                        .addComponent(btnCargarEmple))
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnCargarEmple)
                    .addGap(18, 18, 18)
                    .addComponent(btnGuardarEmple)
                    .addGap(18, 18, 18)
                    .addComponent(btnInsertarEmple)
                    .addGap(18, 18, 18)
                    .addComponent(btnVisualizarEmple)
                    .addGap(18, 18, 18)
                    .addComponent(btnCreadoMasivo)
                    .addGap(18, 18, 18)
                    .addComponent(btnOrdenar)
                    .addContainerGap(129, Short.MAX_VALUE)))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodri\\Documents\\GRADO-SUPERIOR-2024\\PROYECTOS-JAVA-PSP-HLC\\klipartz.com (3).png")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(554, 512));

        jLabel1.setFont(new java.awt.Font("Txt_IV50", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLEADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarEmpleActionPerformed

        CargarEmpleadoVista VistaCargarEmpleado = new CargarEmpleadoVista(listaEmpleados);
        VistaCargarEmpleado.setVisible(true);


    }//GEN-LAST:event_btnCargarEmpleActionPerformed

    private void btnInsertarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarEmpleActionPerformed

        InsertarEmpleadosVista VistaInsertarEmpleado = new InsertarEmpleadosVista(listaEmpleados); // Pasa la referencia de la lista
        VistaInsertarEmpleado.setVisible(true);
        //VistaEmpleado.show();
        dispose();

        /*VistaEmpleado.setVisible(true);
        VistaEmpleado.setLocationRelativeTo(null);*/
    }//GEN-LAST:event_btnInsertarEmpleActionPerformed

    private void btnVisualizarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarEmpleActionPerformed

        MostrarEmpleadosVista VistaMostrarEmpleado = new MostrarEmpleadosVista(listaEmpleados);
        VistaMostrarEmpleado.setVisible(true);


    }//GEN-LAST:event_btnVisualizarEmpleActionPerformed

    private void btnGuardarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleActionPerformed

        try {
            Empleado empleado1 = new Empleado(1, "Juan", 3000.0, 5000.0);
            Empleado empleado2 = new Empleado(2, "Maria", 3500.0, 5500.0);
            listaEmpleados.insertar(empleado1);
            listaEmpleados.insertar(empleado2);
            listaEmpleados.GuardarLista(listaEmpleados);
            listaEmpleados.serialization();

        } catch (ESaldoNoValido ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnGuardarEmpleActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                VistaPrincipal vista = new VistaPrincipal();
                InsertarEmpleadosVista vistaEmple = new InsertarEmpleadosVista(listaEmpleados);
                vista.show();

                Lista listaEmpleados = new Lista();
                
                // averiguar como pasar los empleados creados aqui para llevarlos a otros FRAMES (visualizar)

            try {
            Programador prog1 = new Programador(1, "Rodrigo", "Masculino", 2000, 100, 4000);
            Programador prog2 = new Programador(4, "Jesus", "Masculino", 1500, 200, 4000);
            Programador prog3 = new Programador(6, "Maria", "Femenino", 1200, 150, 4000);
            Programador prog4 = new Programador(2, "Steven", "Masculino", 2000, 200, 4000);
            listaEmpleados.insertar(prog1);
            listaEmpleados.insertar(prog2);
            listaEmpleados.insertar(prog3);
            listaEmpleados.insertar(prog4);
            
            listaEmpleados.mostrarLista();

        } catch (ESaldoNoValido ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

            }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarEmple;
    private javax.swing.JButton btnCreadoMasivo;
    private javax.swing.JButton btnGuardarEmple;
    private javax.swing.JButton btnInsertarEmple;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnVisualizarEmple;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
