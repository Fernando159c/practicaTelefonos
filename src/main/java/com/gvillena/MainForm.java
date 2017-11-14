/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.ListModel;
import javax.swing.border.Border;

/**
 *
 * @author alumno
 */
public class MainForm extends javax.swing.JFrame {

    ArrayList<TelefonoMovil> ListaTMClaro;
    ArrayList<PlanPostPago> ListaPPClaro;
    
    
    
    private void test() {
      
        String cadena = "abc";
        char ctr = 'a' + 'a';
        String str = cadena + 13;
        System.out.println(str);
        System.out.println(ctr);
        
        ArrayList<PlanPostPago> listaPlanes = new ArrayList<PlanPostPago>();
        
        PlanPostPago plan01 = new PlanPostPago();
        plan01.setNombrePlan("Claro MAX 169");
        plan01.setInternet(100);
        plan01.setMinutos(1000);
        plan01.setRpc(1000);        
        
        PlanPostPago plan02 = new PlanPostPago();
        plan02.setNombrePlan("Claro MAX 189");
        plan02.setInternet(1000);
        plan02.setMinutos(600);
        plan02.setRpc(500);        
        
        listaPlanes.add(plan01);
        listaPlanes.add(plan02);
               
        Gson gson = new Gson();        
        String json = gson.toJson(listaPlanes);
        System.out.println(json);        
        
        JsonWriter writer;
        try         {
            writer = new JsonWriter(new FileWriter("C:\\unifacil\\jsonPlanes.txt"));
            writer.jsonValue(json);
                    writer.flush();
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
            
    
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        
        initComponents();
        test();
        
        // Inicializando
        ListaTMClaro = new ArrayList<TelefonoMovil>();
        ListaPPClaro = new ArrayList<PlanPostPago>();        
                              
        // Obteniendo Valores Claro 
        String jsonClaro = "";
        String jsonPlanes = "";
        
        try {
            Scanner scannerClaro = new Scanner(new FileReader("C:\\unifacil\\jsonClaro.txt"));                                    
            Scanner scannerPlanes = new Scanner(new FileReader("C:\\unifacil\\jsonPlanes.txt"));
            
            StringBuilder sb = new StringBuilder();            
            while (scannerClaro.hasNext()) {
                sb.append(scannerClaro.next());                
            }
            jsonClaro = sb.toString();
            
            sb = new StringBuilder();            
            while (scannerPlanes.hasNext()) {
                sb.append(scannerPlanes.next());                
            }
            jsonPlanes = sb.toString();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Gson gson = new Gson();
        TelefonoMovil[] listaClaro = gson.fromJson(jsonClaro, TelefonoMovil[].class);                 
        
        for (int i = 0; i < listaClaro.length; i++) {                        
            ListaTMClaro.add(listaClaro[i]);
        }
        
        gson = new Gson();
        PlanPostPago[] listaPlan = gson.fromJson(jsonPlanes, PlanPostPago[].class);                 
        
        for (int i = 0; i < listaPlan.length; i++) {                        
            ListaPPClaro.add(listaPlan[i]);
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTEquiposMoviles = new javax.swing.JLabel();
        pblEquiposMovilles = new javax.swing.JScrollPane();
        lstEquiposMoviles = new javax.swing.JList();
        lblDescripcion = new javax.swing.JLabel();
        plPantalla = new javax.swing.JPanel();
        lblPantallaImg = new javax.swing.JLabel();
        lblPantalla = new javax.swing.JLabel();
        lblTPantalla = new javax.swing.JLabel();
        plCamara = new javax.swing.JPanel();
        lblCamara = new javax.swing.JLabel();
        lblTCamara = new javax.swing.JLabel();
        lblCamaraImg = new javax.swing.JLabel();
        plProcesador = new javax.swing.JPanel();
        lblProcesador = new javax.swing.JLabel();
        lblTProcesador = new javax.swing.JLabel();
        lblProcesadorImg = new javax.swing.JLabel();
        jPanelPlan = new javax.swing.JPanel();
        jlabelTituloPlan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelSms = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelRpc = new javax.swing.JLabel();
        jLabelSms2 = new javax.swing.JLabel();
        jComboBoxPlan = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(168, 234, 249));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 38, 45));
        jLabel1.setText("TIENDA CLARO");

        lblTEquiposMoviles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTEquiposMoviles.setForeground(new java.awt.Color(31, 151, 174));
        lblTEquiposMoviles.setText("EQUIPOS DISPONIBLES");

        lstEquiposMoviles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEquiposMoviles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEquiposMovilesValueChanged(evt);
            }
        });
        pblEquiposMovilles.setViewportView(lstEquiposMoviles);

        lblDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        plPantalla.setBackground(new java.awt.Color(168, 234, 249));
        plPantalla.setPreferredSize(new java.awt.Dimension(250, 159));
        plPantalla.setLayout(new java.awt.GridBagLayout());

        lblPantallaImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPantallaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-pantalla.png"))); // NOI18N
        lblPantallaImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        plPantalla.add(lblPantallaImg, gridBagConstraints);

        lblPantalla.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblPantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPantalla.setText("-");
        lblPantalla.setFocusable(false);
        lblPantalla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        plPantalla.add(lblPantalla, gridBagConstraints);

        lblTPantalla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTPantalla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTPantalla.setText("PANTALLA");
        lblTPantalla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTPantalla.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        plPantalla.add(lblTPantalla, gridBagConstraints);

        plCamara.setBackground(new java.awt.Color(168, 234, 249));
        plCamara.setPreferredSize(new java.awt.Dimension(250, 159));
        plCamara.setLayout(new java.awt.GridBagLayout());

        lblCamara.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblCamara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCamara.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        plCamara.add(lblCamara, gridBagConstraints);

        lblTCamara.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTCamara.setText("CAMARA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        plCamara.add(lblTCamara, gridBagConstraints);

        lblCamaraImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-camara.png"))); // NOI18N
        plCamara.add(lblCamaraImg, new java.awt.GridBagConstraints());

        plProcesador.setBackground(new java.awt.Color(168, 234, 249));
        plProcesador.setPreferredSize(new java.awt.Dimension(250, 159));
        plProcesador.setLayout(new java.awt.GridBagLayout());

        lblProcesador.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblProcesador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcesador.setText("-");
        lblProcesador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        plProcesador.add(lblProcesador, gridBagConstraints);

        lblTProcesador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTProcesador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTProcesador.setText("PROCESADOR");
        lblTProcesador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        plProcesador.add(lblTProcesador, gridBagConstraints);

        lblProcesadorImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-procesador.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        plProcesador.add(lblProcesadorImg, gridBagConstraints);

        jPanelPlan.setBackground(new java.awt.Color(168, 234, 249));

        jlabelTituloPlan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlabelTituloPlan.setText("jLabel3");

        jLabel3.setBackground(new java.awt.Color(133, 133, 133));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("SMS:");

        jLabelSms.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSms.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSms.setText("jLabel4");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("RPC:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("INTERNET:");

        jLabelRpc.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRpc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRpc.setText("jLabel4");

        jLabelSms2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSms2.setText("jLabel4");

        javax.swing.GroupLayout jPanelPlanLayout = new javax.swing.GroupLayout(jPanelPlan);
        jPanelPlan.setLayout(jPanelPlanLayout);
        jPanelPlanLayout.setHorizontalGroup(
            jPanelPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addGroup(jPanelPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(168, 168, 168)
                .addGroup(jPanelPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRpc)
                    .addComponent(jLabelSms)
                    .addComponent(jLabelSms2))
                .addGap(40, 40, 40))
            .addGroup(jPanelPlanLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jlabelTituloPlan)
                .addGap(149, 149, 149))
        );
        jPanelPlanLayout.setVerticalGroup(
            jPanelPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelTituloPlan)
                .addGap(20, 20, 20)
                .addGroup(jPanelPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlanLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addGap(52, 79, Short.MAX_VALUE))
                    .addGroup(jPanelPlanLayout.createSequentialGroup()
                        .addGroup(jPanelPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelPlanLayout.createSequentialGroup()
                                .addComponent(jLabelSms)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelRpc)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelSms2)
                                .addGap(6, 6, 6))
                            .addGroup(jPanelPlanLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jComboBoxPlan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione plan" }));
        jComboBoxPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPlanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(31, 151, 174));
        jLabel2.setText("¡Elige el mejor plan para ti!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pblEquiposMovilles, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(plPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBoxPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addComponent(jPanelPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblTEquiposMoviles)))
                        .addGap(251, 251, 251)
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(696, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(lblTEquiposMoviles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pblEquiposMovilles, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plPantalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plProcesador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plCamara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPlan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBoxPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        DefaultListModel<String> listaEquiposClaroModel = new DefaultListModel<String>();
        
        for (TelefonoMovil telefonoMovil : ListaTMClaro) {
            listaEquiposClaroModel.addElement(telefonoMovil.getDescripcion());
        }        
                
        lstEquiposMoviles.setModel(listaEquiposClaroModel);
        
        for (PlanPostPago plan : ListaPPClaro) {
            System.out.println("plan: "+plan.toString());
            jComboBoxPlan.addItem(plan.getNombrePlan());
        }
        
        jPanelPlan.setVisible(false);
           
    }//GEN-LAST:event_formWindowOpened

    private void lstEquiposMovilesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEquiposMovilesValueChanged

        if (!evt.getValueIsAdjusting()) {
            int indiceSeleccionado = lstEquiposMoviles.getSelectedIndex();
            if (indiceSeleccionado != -1) {

                TelefonoMovil telMovSel = ListaTMClaro.get(indiceSeleccionado);

                String descripcion = telMovSel.getDescripcion();
                String pantalla = telMovSel.getPantalla();
                String camara = telMovSel.getCamara();
                String procesador = telMovSel.getProcesador();
                String urlImage = telMovSel.getUrlImage();

                //                lblDescripcion.setText(descripcion);
                lblPantalla.setText(pantalla);
                lblCamara.setText(camara);
                lblProcesador.setText(procesador);
                System.out.println(" url image "+urlImage);
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/img/"+urlImage));
                Image image = imageIcon.getImage(); // transform it
                Image newimg = image.getScaledInstance(240, 240,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
                imageIcon = new ImageIcon(newimg);  // transform it back
                lblDescripcion.setIcon(imageIcon);

            }
        }

        //
        //        if (!evt.getValueIsAdjusting()) {
            //            if (btnClaro.isSelected()) {
                //                switch (lstEquiposMoviles.getSelectedIndex()) {
                    //                    case 0:
                    //                        System.out.println("CLARO 0");
                    //                        lblPantalla.setText("4.3\"");
                    //                        lblCamara.setText("6MP");
                    //                        lblProcesador.setText("1.3GHz");
                    //                        lblDescripcion.setText("Galaxy S7 (Claro)");
                    //                        break;
                    //                    case 1:
                    //                        System.out.println("CLARO 1");
                    //                        lblPantalla.setText("6.2\"");
                    //                        lblCamara.setText("8MP");
                    //                        lblProcesador.setText("2.3GHz");
                    //                        lblDescripcion.setText("iPhone 7 (Claro)");
                    //                        break;
                    //                    case 2:
                    //                        System.out.println("CLARO 2");
                    //                        lblPantalla.setText("7.3\"");
                    //                        lblCamara.setText("10MP");
                    //                        lblProcesador.setText("2.7GHz");
                    //                        lblDescripcion.setText("LG k8 (Claro)");
                    //                        break;
                    //                }
                //            }
            //            else if (btnMovistar.isSelected())
            //            {
                //                switch (lstEquiposMoviles.getSelectedIndex()) {
                    //                    case 0:
                    //                        System.out.println("MOVISTAR 0");
                    //                        lblPantalla.setText("6.3\"");
                    //                        lblCamara.setText("5MP");
                    //                        lblProcesador.setText("1.7GHz");
                    //                        lblDescripcion.setText("Galaxy S7 (Movistar)");
                    //                        break;
                    //                    case 1:
                    //                        System.out.println("MOVISTAR 1");
                    //                        lblPantalla.setText("4.3\"");
                    //                        lblCamara.setText("4MP");
                    //                        lblProcesador.setText("2.2GHz");
                    //                        lblDescripcion.setText("iPhone 7 (Movistar)");
                    //                        break;
                    //                    case 2:
                    //                        System.out.println("MOVISTAR 2");
                    //                        lblPantalla.setText("5.1\"");
                    //                        lblCamara.setText("7MP");
                    //                        lblProcesador.setText("1.2GHz");
                    //                        lblDescripcion.setText("LG k8 (Movistar)");
                    //                        break;
                    //                }
                //            }
            //        }

    }//GEN-LAST:event_lstEquiposMovilesValueChanged

    private void jComboBoxPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPlanActionPerformed

        JComboBox comboBox = (JComboBox) evt.getSource();
        Object selected = comboBox.getSelectedItem();

        PlanPostPago planSelecionado=null;
        for (PlanPostPago plan : ListaPPClaro) {
            if(plan.getNombrePlan().equalsIgnoreCase(selected.toString())){
                planSelecionado = plan;
            }
        }

        if(planSelecionado!=null){
            Color colorNegro = new Color(0, 0, 0);
            jlabelTituloPlan.setText(planSelecionado.getNombrePlan());
            jlabelTituloPlan.setForeground(colorNegro);
            jLabelSms.setText(planSelecionado.getSms());
            jLabelSms.setForeground(colorNegro);
            jLabelRpc.setText(planSelecionado.getRpc());
            jLabelRpc.setForeground(colorNegro);
            jLabelSms2.setText(planSelecionado.getInternet());
            jLabelSms2.setForeground(colorNegro);

            jPanelPlan.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1.0f)));
            jPanelPlan.setBackground(new Color(168,234,249));
            jPanelPlan.setVisible(true);
        }else{
            jPanelPlan.setVisible(false);
        }

    }//GEN-LAST:event_jComboBoxPlanActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelRpc;
    private javax.swing.JLabel jLabelSms;
    private javax.swing.JLabel jLabelSms2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelPlan;
    private javax.swing.JLabel jlabelTituloPlan;
    private javax.swing.JLabel lblCamara;
    private javax.swing.JLabel lblCamaraImg;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblPantalla;
    private javax.swing.JLabel lblPantallaImg;
    private javax.swing.JLabel lblProcesador;
    private javax.swing.JLabel lblProcesadorImg;
    private javax.swing.JLabel lblTCamara;
    private javax.swing.JLabel lblTEquiposMoviles;
    private javax.swing.JLabel lblTPantalla;
    private javax.swing.JLabel lblTProcesador;
    private javax.swing.JList lstEquiposMoviles;
    private javax.swing.JScrollPane pblEquiposMovilles;
    private javax.swing.JPanel plCamara;
    private javax.swing.JPanel plPantalla;
    private javax.swing.JPanel plProcesador;
    // End of variables declaration//GEN-END:variables

    
}