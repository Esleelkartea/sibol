/*
 * InputZetac.java
 *
 * Created on 1 de junio de 2006, 17:05
 */

package graph.input;

import funciones.LimitadorCaracteres;
import graph.beans.ZetacBean;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javax.swing.CellEditor;
import main.Mensaje;

public class InputZetac extends javax.swing.JPanel {
    private static CellEditor cellEditor;
    private static ResourceBundle bundle = ResourceBundle.getBundle("resources/config/config");
    private ZetacBean datosZetac;
    private String mensaje = null;
    
    /** Creates new form InputZetac */
    public InputZetac(CellEditor cellEditor) {
        this.cellEditor = cellEditor;
        initComponents();
        establecerRestricciones();
    }
    
    public void installValue(ZetacBean valor) {
        datosZetac = valor;
        
        if(datosZetac != null) {
            jTextFieldReferencia.setText(String.valueOf(datosZetac.getReferencia()));
            jComboBoxNumeroPolos.setSelectedItem(String.valueOf(datosZetac.getNumeroPolos()));
            jComboBoxIntensidad.setSelectedItem(DecimalFormat.getInstance().format(datosZetac.getIntensidad()));
        }
    }
    
    public ZetacBean getValue() {
        return datosZetac;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jBtnAceptar = new javax.swing.JButton();
        jLabelReferencia = new javax.swing.JLabel();
        jComboBoxNumeroPolos = new javax.swing.JComboBox();
        jLabelNumeroPolos = new javax.swing.JLabel();
        jLabelIntensidad = new javax.swing.JLabel();
        jComboBoxIntensidad = new javax.swing.JComboBox();
        jLabelNumeroPolosUnidad = new javax.swing.JLabel();
        jLabelCalibreUnidad = new javax.swing.JLabel();
        jTextFieldReferencia = new javax.swing.JTextField();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jBtnAceptar.setText("Aceptar");
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });

        jLabelReferencia.setText("Referencia");

        jComboBoxNumeroPolos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "3+N" }));

        jLabelNumeroPolos.setText("N\u00ba Polos");

        jLabelIntensidad.setText("Intensidad");

        jComboBoxIntensidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0,5", "1", "2", "3", "4", "6", "10", "16", "20", "25", "32", "40", "50", "63", "80", "100", "125" }));

        jLabelNumeroPolosUnidad.setText("P");

        jLabelCalibreUnidad.setText("A");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabelIntensidad)
                            .add(jLabelReferencia)
                            .add(jLabelNumeroPolos))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jComboBoxIntensidad, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jComboBoxNumeroPolos, 0, 64, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabelNumeroPolosUnidad, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .add(jLabelCalibreUnidad)))
                            .add(jTextFieldReferencia, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jBtnAceptar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelReferencia)
                    .add(jTextFieldReferencia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelNumeroPolos)
                    .add(jLabelNumeroPolosUnidad)
                    .add(jComboBoxNumeroPolos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelIntensidad)
                    .add(jLabelCalibreUnidad)
                    .add(jComboBoxIntensidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jBtnAceptar)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
// TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed
    
    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed
        if(valida()){
            String referencia = (String)jTextFieldReferencia.getText();
            String numeroPolos = (String)jComboBoxNumeroPolos.getSelectedItem();
            double intensidad = 0;
            try {
                intensidad = Double.parseDouble(((String)jComboBoxIntensidad.getSelectedItem()).replace(",","."));
            } catch(NumberFormatException e) {}
            datosZetac.setReferencia(referencia);
            datosZetac.setNumeroPolos(numeroPolos);
            datosZetac.setIntensidad(intensidad);
            datosZetac.setEditado(true);
            cellEditor.stopCellEditing();
        }
    }//GEN-LAST:event_jBtnAceptarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JComboBox jComboBoxIntensidad;
    private javax.swing.JComboBox jComboBoxNumeroPolos;
    private javax.swing.JLabel jLabelCalibreUnidad;
    private javax.swing.JLabel jLabelIntensidad;
    private javax.swing.JLabel jLabelNumeroPolos;
    private javax.swing.JLabel jLabelNumeroPolosUnidad;
    private javax.swing.JLabel jLabelReferencia;
    private javax.swing.JTextField jTextFieldReferencia;
    // End of variables declaration//GEN-END:variables
    
    private void establecerRestricciones() {
        jTextFieldReferencia.setDocument(new LimitadorCaracteres(jTextFieldReferencia, 25, false, false));
    }
        
    private boolean valida(){
        boolean resultado = true;
        this.mensaje=null;
        resultado = resultado && validaReferencia();
        resultado = resultado && validaNumeroPolos();
        resultado = resultado && validaIntensidad();
        if(!resultado){
            // Mostrar mensaje
            Mensaje.error(bundle.getString("ERRORES_EN_DATOS_INTRODUCIDOS")+this.mensaje+"\n");
        }
        return resultado;
    }
       
    private boolean validaReferencia(){
        boolean resultado = true;
        String valor = jTextFieldReferencia.getText();
        String label = jLabelReferencia.getText();
        if(valor==null || "".equals(valor)){
            // Mensaje campo obligatorio
            if(mensaje==null)mensaje="";
            mensaje+= bundle.getString("EL_CAMPO")+" "+label+" "+bundle.getString("ES_OBLIGATORIO")+"\n";
            resultado = false;
        }
        return resultado;
    }
    
    private boolean validaNumeroPolos(){
        boolean resultado = true;
        String valor = (String)jComboBoxNumeroPolos.getSelectedItem();
        String label = jLabelNumeroPolos.getText();
        if(valor==null || "".equals(valor)){
            // Mensaje campo obligatorio
            if(mensaje==null)mensaje="";
            mensaje+= bundle.getString("EL_CAMPO")+" "+label+" "+bundle.getString("ES_OBLIGATORIO")+"\n";
            resultado = false;
        }
        return resultado;
    }
    
    private boolean validaIntensidad(){
        boolean resultado = true;
        String valor = (String)jComboBoxIntensidad.getSelectedItem();
        String label = jLabelIntensidad.getText();
        if(valor==null || "".equals(valor)){
            // Mensaje campo obligatorio
            if(mensaje==null)mensaje="";
            mensaje+= bundle.getString("EL_CAMPO")+" "+label+" "+bundle.getString("ES_OBLIGATORIO")+"\n";
            resultado = false;
        }
        return resultado;
    }
    
}