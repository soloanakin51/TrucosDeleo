/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Truco21cartas.Carta;
import Truco21cartas.ExTRuco;
import Truco21cartas.Mazo;
import Truco21cartas.NumeroColumna;
import Truco21cartas.Palo;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author agustin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    Image icon;
    public Main() {
        initComponents();
        w=this;
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("b/logo.png"));
        setIconImage(icon);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Magic 21 Trick");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Primera");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Segunda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Tercera");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Observe una carta de estas 21.");

        jLabel2.setText("Seleccione el boton correspondiente");

        jLabel3.setText("a la columna donde se este su carta.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(14, 14, 14)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addContainerGap(536, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        jButton1.setText("Reiniciar");
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        ArrayList<ArrayList<Carta>> a = new ArrayList<ArrayList<Carta>>();
        e.vaciar();
        a=e.truco();
        refrescar(a);
        etapa=1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<ArrayList<Carta>> a = new ArrayList<ArrayList<Carta>>();
        Carta f=new Carta(Palo.JOKER);
        switch(etapa){
        case 1:
            a=e.truco2(NumeroColumna.PRIMERA);
            refrescar(a);
            etapa=2;
            break;
        case 2:
            a=e.truco3(NumeroColumna.PRIMERA);
            refrescar(a);
            etapa=3;
            break;
        case 3:
            f=e.trucofinal(NumeroColumna.PRIMERA);
            new FinalTruco(f);
            setVisible(false);
            break;
        default:
            break;
    
    }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ArrayList<ArrayList<Carta>> a = new ArrayList<ArrayList<Carta>>();
        Carta f=new Carta(Palo.JOKER);
        switch(etapa){
        case 1:
            a=e.truco2(NumeroColumna.SEGUNDA);
            refrescar(a);
            etapa=2;
            break;
        case 2:
            a=e.truco3(NumeroColumna.SEGUNDA);
            refrescar(a);
            etapa=3;
            break;
        case 3:
            f=e.trucofinal(NumeroColumna.SEGUNDA);
            new FinalTruco(f);
            setVisible(false);
            break;
        default:
            break;
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ArrayList<ArrayList<Carta>> a = new ArrayList<ArrayList<Carta>>();
        Carta f=new Carta(Palo.JOKER);
        switch(etapa){
        case 1:
            a=e.truco2(NumeroColumna.TERCERA);
            refrescar(a);
            etapa=2;
            break;
        case 2:
            a=e.truco3(NumeroColumna.TERCERA);
            refrescar(a);
            etapa=3;
            break;
        case 3:
            f=e.trucofinal(NumeroColumna.TERCERA);
            new FinalTruco(f);
            setVisible(false);
            break;
        default:
            break;
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    public void vaciar()
        {
            
        for(JLabel c: components)
            {
                //System.out.println((c.getLocation().getX())+" "+c.getName()+" "+c.getClass());
                if(c.getLocation().getX()<=160)
                {
                    w.remove(c);
                }
            }
        }
    public void volver(){
        vaciar();
        setVisible(true);
        jButton1.setText("Iniciar");
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
    }
    
    private void refrescar(ArrayList<ArrayList<Carta>> a){
        if(etapa==0)
        {
            components=new ArrayList<>();
        }
        vaciar();
        int j,k;
        ImageIcon i;
        JLabel label;
        components=new ArrayList<>();
        //System.out.println(getComponent(1).getClass());
        for(k=0;k<3;k++)
            {
            for(j=0;j<7;j++)   
                {
                    i = new ImageIcon(getClass().getResource(a.get(k).get(j).getImg()));
                    
                    components.add(new JLabel(i));
                    add(components.get(components.size()-1));
                    
                    components.get(components.size()-1).setSize(74, 98);
                    components.get(components.size()-1).setLocation(0+k*80, 0+j*100);
                }
            }
        
    }
    public static Main w;
    private int etapa=0;
    private Truco21cartas.ExTRuco e = new Truco21cartas.ExTRuco();
    private ArrayList<JLabel> components;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
