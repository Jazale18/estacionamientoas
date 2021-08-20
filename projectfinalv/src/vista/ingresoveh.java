package vista;

import controlador.TadLista;
import controlador.tadCola.TadCola;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import modelo.vehiculo;
import modelo.vehiculoEspera;

public class ingresoveh extends javax.swing.JFrame implements Runnable {

    TadLista lista = new TadLista();
    public static TadCola<vehiculoEspera> cola = new TadCola<>();
    vehiculo veh;
    String p, f, h;
    String dia, mes, annio;
    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        hr = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso de vehiculo");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("Parking Cr"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 130, 50));

        jLabel1.setText("Placa:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel2.setText("Fecha de ingreso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel3.setText("Hora de Ingreso:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        jPanel1.add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 230, -1));

        fecha.setEditable(false);
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 230, -1));

        hr.setEditable(false);
        jPanel1.add(hr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 230, -1));

        jButton2.setText("Cancelar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 130, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel7.setText("Ingreso de vehiculo - Parking Cr");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (placa.getText().length() == 0 && fecha.getText().length() == 0 && hr.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Llenar los datos correctamente");
        } else {
            if (lista.size12() == true) {
                p = placa.getText();
                f = fecha.getText();
                h = hr.getText();
                veh = new vehiculo();
                veh.setFechaI(f);
                veh.setPlaca(p);
                veh.setHorasI(h);
                lista.push(veh);
                limpiar();
            } else {
                if (lista.llenparq() > 0) {
                    JOptionPane.showMessageDialog(null, "Usted debe escoger el lugar a estacionarse", "Lugares desocupados", JOptionPane.OK_CANCEL_OPTION);
                    parqueaderoveh s=new parqueaderoveh();
                    s.setVisible(true);
                } else {
                    int input = JOptionPane.showConfirmDialog(null, "Ocupado, ¿Desea ir a lista de espera?");

                    // 0=yes, 1=no, 2=cancel
                    System.out.println(input);
                    if (input == 0) {
                        //Aqui va la cola

                        cola.encolar(new vehiculoEspera(placa.getText(), fecha.getText(), hr.getText()));
                        cola.imprimirCola();
                        JOptionPane.showMessageDialog(null, "Usted se encuentra en lista de espera", "Lista de Espera", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                    }

                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ingresoveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresoveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresoveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresoveh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new ingresoveh();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField hr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField placa;
    // End of variables declaration//GEN-END:variables
public void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public void limpiar() {
        placa.setText("");
    }

    public ingresoveh() {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        setLocationRelativeTo(null);//para centrar la ventana
        setVisible(true);
        Calendar c = Calendar.getInstance();
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        annio = Integer.toString(c.get(Calendar.YEAR));

        fecha.setText(dia + "/" + mes + "/" + annio);
        

    }

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            hr.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
