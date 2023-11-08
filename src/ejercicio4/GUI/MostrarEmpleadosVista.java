/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio4.GUI;

import ejercicio4.Analista;
import ejercicio4.ESaldoNoValido;
import ejercicio4.Empleado;
import ejercicio4.Lista;
import ejercicio4.Lista.Nodo;
import ejercicio4.Programador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Rodri
 */
public class MostrarEmpleadosVista extends javax.swing.JFrame {

    public static Lista listaEmpleados;
    VistaPrincipal vista = new VistaPrincipal();

    public MostrarEmpleadosVista(Lista listaEmpleados) {
        initComponents();

        this.listaEmpleados = listaEmpleados;
        
        //crearAnalistas();
        listaEmpleados.mostrarLista();
        
        //crearProgramadores();

        jPanelProgramador1.setVisible(false);
        jPanelAnalista.setVisible(false);
        jPanel2.setVisible(true);

        //ocultarBotonesProgramador();
        // ocultarBotonesAnalista();
    }

    public void crearProgramadores() {
        
        try {
            Programador prog1 = new Programador(1, "Rodrigo", "Masculino", 2000, 100, 4000);
            Programador prog2 = new Programador(4, "Jesus", "Masculino", 1500, 200, 4000);
            Programador prog3 = new Programador(6, "Maria", "Femenino", 1200, 150, 4000);
            Programador prog4 = new Programador(2, "Steven", "Masculino", 2000, 200, 4000);
            listaEmpleados.insertar(prog1);
            listaEmpleados.insertar(prog2);
            listaEmpleados.insertar(prog3);
            listaEmpleados.insertar(prog4);

        } catch (ESaldoNoValido ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    public void mostrarProgramadores() {

       

        listaEmpleados.mostrarLista();

        listaEmpleados.getActual(); // Obtén el nodo o empleado actual

        Programador EmpleadoActualAux = (Programador) listaEmpleados.getActual().getPrincipal();
        txtNumeroEmpleadoProg1.setText(Integer.toString(EmpleadoActualAux.getNumeroEmple()));
        txtNombreProg1.setText(EmpleadoActualAux.getNombre());
        txtSueldoProg1.setText(Double.toString(EmpleadoActualAux.getSueldo()));
        txtSueldoMaxProg1.setText(Double.toString(EmpleadoActualAux.getSueldoMax()));
        txtSueldoExtrMensualProg1.setText(Double.toString(EmpleadoActualAux.getSueldoExtraMensual()));
        txtGeneroProg1.setText(EmpleadoActualAux.getGenero());
        txtFechaAltaProg1.setText(EmpleadoActualAux.getFechaAlta().getTime().toString());

    }

    public void crearAnalistas() {

        try {
            Analista analista1 = new Analista(9, "JuanAntonio", 3, 2000, 2500, 3050);
            Analista analista2 = new Analista(12, "Tomás", 5, 2500, 3000, 4050);
            Analista analista3 = new Analista(14, "Miguel", 1, 3000, 2000, 5000);
            listaEmpleados.insertar(analista1);
            listaEmpleados.insertar(analista2);
            listaEmpleados.insertar(analista3);

        } catch (ESaldoNoValido ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mostrarAnalistas() {

        listaEmpleados.getActual(); // Obtén el nodo o empleado actual

        Analista EmpleadoActualAux2 = (Analista) listaEmpleados.getActual().getPrincipal();
        txtNumeroEmpleadoAnalista.setText(Integer.toString(EmpleadoActualAux2.getNumeroEmple()));
        txtNombreAnalista.setText(EmpleadoActualAux2.getNombre());
        txtSueldoAnalista.setText(Double.toString(EmpleadoActualAux2.getSueldo()));
        txtSueldoMaxAnalista.setText(Double.toString(EmpleadoActualAux2.getSueldoMax()));
        txtAñosTrabajadosAnalista.setText(Double.toString(EmpleadoActualAux2.getAñosTrabajados()));
        txtPlusAnualAnalista.setText(Double.toString(EmpleadoActualAux2.getPlusAnual()));
        txtFechaAltaAnalista.setText(EmpleadoActualAux2.getFechaAlta().getTime().toString());

        //listaEmpleados.mostrarLista();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanelProgramador1 = new javax.swing.JPanel();
        txtLabelNumeroEmpleadoProgramador1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNumeroEmpleadoProg1 = new javax.swing.JTextField();
        txtNombreProg1 = new javax.swing.JTextField();
        txtSueldoProg1 = new javax.swing.JTextField();
        txtSueldoMaxProg1 = new javax.swing.JTextField();
        txtFechaAltaProg1 = new javax.swing.JTextField();
        txtSueldoExtrMensualProg1 = new javax.swing.JTextField();
        txtGeneroProg1 = new javax.swing.JTextField();
        txtlabelProgramador1 = new javax.swing.JLabel();
        jPanelAnalista = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNumeroEmpleadoAnalista = new javax.swing.JTextField();
        txtNombreAnalista = new javax.swing.JTextField();
        txtSueldoAnalista = new javax.swing.JTextField();
        txtSueldoMaxAnalista = new javax.swing.JTextField();
        txtFechaAltaAnalista = new javax.swing.JTextField();
        txtPlusAnualAnalista = new javax.swing.JTextField();
        txtAñosTrabajadosAnalista = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnAtrasVisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(102, 0, 255));

        jPanelProgramador1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        txtLabelNumeroEmpleadoProgramador1.setText("Numero Empleado");

        jLabel10.setText("Nombre:");

        jLabel11.setText("Sueldo:");

        jLabel12.setText("Sueldo Max:");

        jLabel13.setText("FechaDeAlta");

        jLabel14.setText("SueldoExtraMensual");

        jLabel15.setText("Género");

        txtlabelProgramador1.setFont(new java.awt.Font("Square721 BdEx BT", 0, 12)); // NOI18N
        txtlabelProgramador1.setText("PROGRAMADOR");
        txtlabelProgramador1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout jPanelProgramador1Layout = new javax.swing.GroupLayout(jPanelProgramador1);
        jPanelProgramador1.setLayout(jPanelProgramador1Layout);
        jPanelProgramador1Layout.setHorizontalGroup(
            jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgramador1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLabelNumeroEmpleadoProgramador1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaAltaProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldoExtrMensualProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldoMaxProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldoProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroEmpleadoProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneroProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanelProgramador1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(txtlabelProgramador1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProgramador1Layout.setVerticalGroup(
            jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProgramador1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtlabelProgramador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelNumeroEmpleadoProgramador1)
                    .addComponent(txtNumeroEmpleadoProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtNombreProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtSueldoProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtSueldoMaxProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtFechaAltaProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtSueldoExtrMensualProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgramador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtGeneroProg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelAnalista.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        jLabel16.setText("Numero Empleado");

        jLabel17.setText("Nombre:");

        jLabel18.setText("Sueldo:");

        jLabel19.setText("Sueldo Max:");

        jLabel20.setText("Fecha de alta");

        jLabel21.setText("Plus anual");

        jLabel22.setText("Años Trabajados");

        jLabel23.setBackground(new java.awt.Color(0, 102, 102));
        jLabel23.setFont(new java.awt.Font("Square721 BdEx BT", 0, 12)); // NOI18N
        jLabel23.setText("ANALISTA");
        jLabel23.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout jPanelAnalistaLayout = new javax.swing.GroupLayout(jPanelAnalista);
        jPanelAnalista.setLayout(jPanelAnalistaLayout);
        jPanelAnalistaLayout.setHorizontalGroup(
            jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnalistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPlusAnualAnalista, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtFechaAltaAnalista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSueldoMaxAnalista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSueldoAnalista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumeroEmpleadoAnalista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreAnalista, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAñosTrabajadosAnalista))
                .addContainerGap())
            .addGroup(jPanelAnalistaLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAnalistaLayout.setVerticalGroup(
            jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAnalistaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNumeroEmpleadoAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNombreAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtSueldoAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtSueldoMaxAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(txtFechaAltaAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(txtPlusAnualAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAnalistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(txtAñosTrabajadosAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnSiguiente.setBackground(new java.awt.Color(255, 153, 0));
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Anterior");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analista", "Programador", " " }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel1.setText("Selecciona un tipo de empleado");

        btnAtrasVisualizar.setBackground(new java.awt.Color(255, 153, 0));
        btnAtrasVisualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnAtrasVisualizar.setText("Atrás");
        btnAtrasVisualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        btnAtrasVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanelProgramador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanelAnalista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtrasVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelAnalista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProgramador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtrasVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        JComboBox Desple = (JComboBox) evt.getSource();

        if (Desple.getSelectedIndex() == 0) {

            jPanelProgramador1.setVisible(false);
            jPanelAnalista.setVisible(true);
            mostrarAnalistas();

        } else {

            jPanelAnalista.setVisible(false);
            jPanelProgramador1.setVisible(true);
            //mostrarProgramadores();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnAtrasVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasVisualizarActionPerformed

        vista.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasVisualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        do {
            listaEmpleados.avanzar();
            mostrarAnalistas();
        } while (listaEmpleados.getFin()== null);

    }//GEN-LAST:event_btnSiguienteActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarEmpleadosVista(listaEmpleados).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasVisualizar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAnalista;
    private javax.swing.JPanel jPanelProgramador1;
    private javax.swing.JTextField txtAñosTrabajadosAnalista;
    private javax.swing.JTextField txtFechaAltaAnalista;
    private javax.swing.JTextField txtFechaAltaProg1;
    private javax.swing.JTextField txtGeneroProg1;
    private javax.swing.JLabel txtLabelNumeroEmpleadoProgramador1;
    private javax.swing.JTextField txtNombreAnalista;
    private javax.swing.JTextField txtNombreProg1;
    private javax.swing.JTextField txtNumeroEmpleadoAnalista;
    private javax.swing.JTextField txtNumeroEmpleadoProg1;
    private javax.swing.JTextField txtPlusAnualAnalista;
    private javax.swing.JTextField txtSueldoAnalista;
    private javax.swing.JTextField txtSueldoExtrMensualProg1;
    private javax.swing.JTextField txtSueldoMaxAnalista;
    private javax.swing.JTextField txtSueldoMaxProg1;
    private javax.swing.JTextField txtSueldoProg1;
    private javax.swing.JLabel txtlabelProgramador1;
    // End of variables declaration//GEN-END:variables
}
