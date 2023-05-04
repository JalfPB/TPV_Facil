package Principal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Venta extends javax.swing.JFrame implements ActionListener{
    
    ArrayList lista = new ArrayList();

    /**
     * Creates new form Venta
     */
    public Venta() {
        initComponents();
        prueba();
        crearTicket();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Pedido");

        jButton1.setText("Aceptar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }
   private JPanel panelBotones;
   
   /**
    *Metodo para comprobar que los botones se generan bien 
    */
   
   public void prueba(){
   panelBotones = new JPanel(new GridLayout(0, 3));
   panelBotones.add(new JButton("Botón 1"));
   panelBotones.add(new JButton("Botón 2"));
   panelScroll.setViewportView(panelBotones);
   JButton boton = (JButton)panelBotones.getComponent(0);
   boton.addActionListener(this);
   anadir(boton);
   }
   
   //IMPLEMENTAR CUANDO SE HAGA LA CONEXION CON LA BASE DE DATOS
   
   private void recorrerItems() {
	   
   }
   
   //Metodo necesario para la implementacion
   
   public void actionPerformed(ActionEvent e) {
    
   }
   //CUIDADO CON EL FINAL DE BOTON!!!!
   private void anadir(final JButton boton) {
	   
	   boton.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "Saludos, funciona!");
               //CAMBIAR LUEGO POR EL OBJETO DE LA BBDD
               jTextArea1.append(boton.getText()+ " Funciona");
           }

       });
	   
   }
   
   private void crearTicket() {
	   
	   jButton1.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
               anadirTicketFich();
           }

       });
	   
   }
   
   private void anadirTicketFich() {
	   
	   String rutafich="Ticket_",dia,mes,annio;
	   Calendar c = new GregorianCalendar();
	   dia = Integer.toString(c.get(Calendar.DATE));
	   mes = Integer.toString(c.get(Calendar.MONTH));
	   annio = Integer.toString(c.get(Calendar.YEAR));
	   
	   rutafich=rutafich+dia+"-"+mes+"-"+annio+".txt";
	   
	   try {
	   
		   File fichero = new File (rutafich);
		   fichero.createNewFile();
		   
		   FileWriter fw = new FileWriter(rutafich);
	       PrintWriter pw = new PrintWriter(fw);
	       
	       pw.println(jTextArea1.getText());
	       pw.close();
	       fw.close();
	       JOptionPane.showMessageDialog(null, "Ticket Guardado");
	       jTextArea1.setText("");
	       
	   }catch(Exception e) {
		   
		   JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar el ticket");
		   System.out.println(e.getMessage());
	   }
	   
	   
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane panelScroll;
    // End of variables declaration//GEN-END:variables
}
