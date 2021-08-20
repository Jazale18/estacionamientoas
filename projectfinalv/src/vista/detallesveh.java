package vista;

import controlador.TadLista;
import javax.swing.table.DefaultTableModel;

public class detallesveh extends javax.swing.JFrame {

    public static String plac = "", horai = "", fechai = "";

    public detallesveh() {
        initComponents();
        verDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblveh = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tblveh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Fecha de Ingreso", "Hora de Ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblveh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblvehMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblveh);
        if (tblveh.getColumnModel().getColumnCount() > 0) {
            tblveh.getColumnModel().getColumn(0).setResizable(false);
            tblveh.getColumnModel().getColumn(1).setResizable(false);
            tblveh.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 290));

        jButton1.setText("Volver");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        jLabel1.setText("Vehiculos parqueados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblvehMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblvehMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2) {

            plac = (tblveh.getValueAt(tblveh.getSelectedRow(), 0).toString());
            fechai = (tblveh.getValueAt(tblveh.getSelectedRow(), 1).toString());
            horai = (tblveh.getValueAt(tblveh.getSelectedRow(), 2).toString());
            System.out.println(plac + " " + fechai + " " + horai);
            retiroveh.placatxt.setText(plac);
            retiroveh.fechaitxt.setText(fechai);
            retiroveh.horaitxt.setText(horai);
            retiroveh.posic=tblveh.getSelectedRow();
            this.setVisible(false);

        }
    }//GEN-LAST:event_tblvehMouseClicked

    public void verDatos() {
        //Sección 1 
        DefaultTableModel modelo = (DefaultTableModel) tblveh.getModel();

        //Sección 2
        Object[] datos = new Object[3];

        //Sección 3
        for (int i = 0; i < TadLista.veh.size(); i++) {
            datos[0] = TadLista.veh.get(i).getPlaca();
            datos[1] = TadLista.veh.get(i).getFechaI();
            datos[2] = TadLista.veh.get(i).getHorasI();
            modelo.addRow(datos);

        }

        //Sección 4
        tblveh.setModel(modelo);

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
            java.util.logging.Logger.getLogger(detallesveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detallesveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detallesveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detallesveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detallesveh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblveh;
    // End of variables declaration//GEN-END:variables
}
