/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.TadLista;

/**
 *
 * @author usuario
 */
public class parqueaderoveh extends javax.swing.JFrame {

    /**
     * Creates new form parqueaderoveh
     */
    TadLista lista = new TadLista();

    public parqueaderoveh() {
        initComponents();
        this.setLocationRelativeTo(null);
        nomostrardisp();
        lista.mostrarVeh();
        mostrardisp();
    }
    public void nomostrardisp(){
        v1.setVisible(false);
        v2.setVisible(false);
        v3.setVisible(false);
        v4.setVisible(false);
        v5.setVisible(false);
        v6.setVisible(false);
        v7.setVisible(false);
        v8.setVisible(false);
        v9.setVisible(false);
        v10.setVisible(false);
        v11.setVisible(false);
        v12.setVisible(false);
        
        
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        p11.setVisible(false);
        p12.setVisible(false);
        
        pl1.setVisible(false);
        pl2.setVisible(false);
        pl3.setVisible(false);
        pl4.setVisible(false);
        pl5.setVisible(false);
        pl6.setVisible(false);
        pl7.setVisible(false);
        pl8.setVisible(false);
        pl9.setVisible(false);
        pl10.setVisible(false);
        pl11.setVisible(false);
        pl12.setVisible(false);
    }
    public void mostrardisp() {

        for (int i = 0; i < TadLista.veh.size(); i++) {
            if (TadLista.veh.get(i).getPlaca() == (null)) {

            } else {
                if (i == 0) {
                    v1.setVisible(true);
                    pl1.setText(TadLista.veh.get(i).getPlaca());
                    p1.setVisible(true);
                    pl1.setVisible(true);

                } else {
                    if (i == 1) {
                        v2.setVisible(true);
                        pl2.setText(TadLista.veh.get(i).getPlaca());
                        p2.setVisible(true);
                        pl2.setVisible(true);

                    } else {
                        if (i == 2) {
                            v3.setVisible(true);
                            pl3.setText(TadLista.veh.get(i).getPlaca());
                            p3.setVisible(true);
                            pl3.setVisible(true);
                        } else {
                            if (i == 3) {
                                v4.setVisible(true);
                                pl4.setText(TadLista.veh.get(i).getPlaca());
                                p4.setVisible(true);
                                pl4.setVisible(true);

                            } else {
                                if (i == 4) {
                                    v5.setVisible(true);
                                    pl5.setText(TadLista.veh.get(i).getPlaca());
                                    p5.setVisible(true);
                                    pl5.setVisible(true);
                                } else {
                                    if (i == 5) {
                                        v6.setVisible(true);
                                        pl6.setText(TadLista.veh.get(i).getPlaca());
                                        p6.setVisible(true);
                                        pl6.setVisible(true);

                                    } else {
                                        if (i == 6) {
                                            v7.setVisible(true);
                                            pl7.setText(TadLista.veh.get(i).getPlaca());
                                            p7.setVisible(true);
                                            pl7.setVisible(true);
                                        } else {
                                            if (i == 7) {
                                                v8.setVisible(true);
                                                pl8.setText(TadLista.veh.get(i).getPlaca());
                                                p8.setVisible(true);
                                                pl8.setVisible(true);

                                            } else {
                                                if (i == 8) {
                                                    v9.setVisible(true);
                                                    pl9.setText(TadLista.veh.get(i).getPlaca());
                                                    p9.setVisible(true);
                                                    pl9.setVisible(true);
                                                } else {
                                                    if (i == 9) {
                                                        v10.setVisible(true);
                                                        pl10.setText(TadLista.veh.get(i).getPlaca());
                                                        p10.setVisible(true);
                                                        pl10.setVisible(true);

                                                    } else {
                                                        if (i == 10) {
                                                            v11.setVisible(true);
                                                            pl11.setText(TadLista.veh.get(i).getPlaca());
                                                            p11.setVisible(true);
                                                            pl11.setVisible(true);
                                                        } else {
                                                            if (i == 11) {
                                                                v12.setVisible(true);
                                                                pl12.setText(TadLista.veh.get(i).getPlaca());
                                                                p12.setVisible(true);
                                                                pl12.setVisible(true);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
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

        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        puesto1 = new javax.swing.JLabel();
        puesto2 = new javax.swing.JLabel();
        puesto3 = new javax.swing.JLabel();
        puesto4 = new javax.swing.JLabel();
        puesto5 = new javax.swing.JLabel();
        puesto6 = new javax.swing.JLabel();
        pl1 = new javax.swing.JLabel();
        pl3 = new javax.swing.JLabel();
        pl2 = new javax.swing.JLabel();
        pl4 = new javax.swing.JLabel();
        pl5 = new javax.swing.JLabel();
        pl6 = new javax.swing.JLabel();
        pl7 = new javax.swing.JLabel();
        pl9 = new javax.swing.JLabel();
        pl8 = new javax.swing.JLabel();
        pl10 = new javax.swing.JLabel();
        pl11 = new javax.swing.JLabel();
        pl12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        v5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        v3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        v4 = new javax.swing.JLabel();
        v6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        v12 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        v8 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        v9 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        v10 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        v11 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        v7 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        p12 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        p11 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/parqueado.jpg"))); // NOI18N

        jLabel16.setBackground(new java.awt.Color(153, 153, 153));
        jLabel16.setOpaque(true);

        jLabel7.setText("1");

        setTitle("Parqueadero");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Ver Detalles");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, -1));

        jButton2.setText("Salir");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 500, -1, -1));

        puesto1.setText("Estacionar");
        jPanel2.add(puesto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        puesto2.setText("Estacionar");
        jPanel2.add(puesto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        puesto3.setText("Estacionar");
        jPanel2.add(puesto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        puesto4.setText("Estacionar");
        jPanel2.add(puesto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        puesto5.setText("Estacionar");
        jPanel2.add(puesto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        puesto6.setText("Estacionar");
        jPanel2.add(puesto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        pl1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl1.setText("C3E-1234");
        jPanel2.add(pl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        pl3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl3.setText("C3E-1234");
        jPanel2.add(pl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        pl2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl2.setText("C3E-1234");
        jPanel2.add(pl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        pl4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl4.setText("C3E-1234");
        jPanel2.add(pl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        pl5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl5.setText("C3E-1234");
        jPanel2.add(pl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, -1));

        pl6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl6.setText("C3E-1234");
        jPanel2.add(pl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, -1, -1));

        pl7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl7.setText("C3E-1234");
        jPanel2.add(pl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        pl9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl9.setText("C3E-1234");
        jPanel2.add(pl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        pl8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl8.setText("C3E-1234");
        jPanel2.add(pl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        pl10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl10.setText("C3E-1234");
        jPanel2.add(pl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        pl11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl11.setText("C3E-1234");
        jPanel2.add(pl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, -1, -1));

        pl12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pl12.setText("C3E-1234");
        jPanel2.add(pl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, -1, -1));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 10));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1060, 10));

        v5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, 140));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 10, 180));

        v2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 140));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 10, 180));

        v3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, 140));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 10, 190));

        v4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 140));

        v6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, 140));

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 10, 180));

        v1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 110));

        jLabel4.setText("1");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel5.setText("2");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 40, -1));

        jLabel9.setText("3");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 70, -1));

        jLabel11.setText("4");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 60, -1));

        jLabel13.setText("6");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 140, 20, -1));

        jLabel18.setText("5");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 70, -1));

        p6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, -1, -1));

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, -1));

        jLabel36.setBackground(new java.awt.Color(153, 153, 153));
        jLabel36.setOpaque(true);
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 10, 180));

        jLabel37.setBackground(new java.awt.Color(153, 153, 153));
        jLabel37.setOpaque(true);
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 1060, 10));

        v12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, -1, 140));

        jLabel38.setBackground(new java.awt.Color(153, 153, 153));
        jLabel38.setOpaque(true);
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 10, 200));

        v8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, 140));

        jLabel39.setBackground(new java.awt.Color(153, 153, 153));
        jLabel39.setOpaque(true);
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 10, 190));

        v9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, 140));

        jLabel40.setBackground(new java.awt.Color(153, 153, 153));
        jLabel40.setOpaque(true);
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 10, 190));

        v10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, 140));

        jLabel41.setBackground(new java.awt.Color(153, 153, 153));
        jLabel41.setOpaque(true);
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 280, 10, 190));

        v11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, 140));

        jLabel42.setBackground(new java.awt.Color(153, 153, 153));
        jLabel42.setOpaque(true);
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 10, 190));

        v7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel2.add(v7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 110));

        jLabel43.setText("7");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 30, -1));

        jLabel44.setText("8");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 40, -1));

        jLabel45.setText("9");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 70, -1));

        jLabel46.setText("10");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 70, 20));

        jLabel47.setText("12");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 420, 20, -1));

        jLabel48.setText("11");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, 30, -1));

        p12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, -1, -1));

        p7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        p8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        p9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        p10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, -1));

        p11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa.png"))); // NOI18N
        jPanel2.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, -1));

        jLabel55.setBackground(new java.awt.Color(153, 153, 153));
        jLabel55.setOpaque(true);
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 10, 190));

        jLabel19.setBackground(new java.awt.Color(153, 153, 153));
        jLabel19.setOpaque(true);
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 10, 180));

        jLabel20.setBackground(new java.awt.Color(153, 153, 153));
        jLabel20.setOpaque(true);
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 180));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 10, 180));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1060, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1080, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(parqueaderoveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parqueaderoveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parqueaderoveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parqueaderoveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parqueaderoveh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p10;
    private javax.swing.JLabel p11;
    private javax.swing.JLabel p12;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    private javax.swing.JLabel pl1;
    private javax.swing.JLabel pl10;
    private javax.swing.JLabel pl11;
    private javax.swing.JLabel pl12;
    private javax.swing.JLabel pl2;
    private javax.swing.JLabel pl3;
    private javax.swing.JLabel pl4;
    private javax.swing.JLabel pl5;
    private javax.swing.JLabel pl6;
    private javax.swing.JLabel pl7;
    private javax.swing.JLabel pl8;
    private javax.swing.JLabel pl9;
    private javax.swing.JLabel puesto1;
    private javax.swing.JLabel puesto2;
    private javax.swing.JLabel puesto3;
    private javax.swing.JLabel puesto4;
    private javax.swing.JLabel puesto5;
    private javax.swing.JLabel puesto6;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v10;
    private javax.swing.JLabel v11;
    private javax.swing.JLabel v12;
    private javax.swing.JLabel v2;
    private javax.swing.JLabel v3;
    private javax.swing.JLabel v4;
    private javax.swing.JLabel v5;
    private javax.swing.JLabel v6;
    private javax.swing.JLabel v7;
    private javax.swing.JLabel v8;
    private javax.swing.JLabel v9;
    // End of variables declaration//GEN-END:variables
}
