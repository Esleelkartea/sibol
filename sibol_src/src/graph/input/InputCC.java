package graph.input;

import funciones.AutoComplCmbBxRestrictivo;
import funciones.BaseDatos;
import funciones.LimitadorCaracteres;
import funciones.ParCombo;
import funciones.Sesion;
import graph.beans.CCBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.swing.CellEditor;
import main.Mensaje;

/**
 *
 * @author  sanjose
 */
public class InputCC extends javax.swing.JPanel {
    private static CellEditor cellEditor;
    private static ResourceBundle bundle = ResourceBundle.getBundle("resources/config/config");
    private CCBean datosCC;
    private String mensaje = null;
    private BaseDatos bd;
    
    /** Creates new form InputCC */
    public InputCC(CellEditor cellEditor) {
        this.cellEditor = cellEditor;
        bd = Sesion.getInstance().getBaseDatos();
        initComponents();
        establecerRestricciones();
        agregarDatosCombox();
    }
    
    public void installValue(CCBean valor) {
        datosCC = valor;
        
        if(datosCC != null) {
            jTxtReferencia.setText(String.valueOf(datosCC.getReferencia()));
            //jTxtSituacion.setText(String.valueOf(datosCC.getSituacion()));
            for (int i=0; i<jComboBoxSituacion.getItemCount(); i++) {
                if (datosCC.getSituacion().equals(((ParCombo)jComboBoxSituacion.getItemAt(i)).getKeyString())) {
                    jComboBoxSituacion.setSelectedIndex(i);
                }
            }
        }
    }
    
    public CCBean getValue() {
        return datosCC;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabelSituacion = new javax.swing.JLabel();
        jBtnAceptar = new javax.swing.JButton();
        jLabelReferencia = new javax.swing.JLabel();
        jTxtReferencia = new javax.swing.JTextField();
        jComboBoxSituacion = new javax.swing.JComboBox();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabelSituacion.setText("Situaci\u00f3n");

        jBtnAceptar.setText("Aceptar");
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });

        jLabelReferencia.setText("Referencia");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabelSituacion)
                            .add(jLabelReferencia))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jComboBoxSituacion, 0, 167, Short.MAX_VALUE)
                            .add(jTxtReferencia, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jBtnAceptar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTxtReferencia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelReferencia))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSituacion)
                    .add(jComboBoxSituacion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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
            datosCC.setReferencia(jTxtReferencia.getText());
            datosCC.setSituacion(((ParCombo)jComboBoxSituacion.getSelectedItem()).getKeyString());
            datosCC.setEditado(true);
            cellEditor.stopCellEditing();
        }
    }//GEN-LAST:event_jBtnAceptarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JComboBox jComboBoxSituacion;
    private javax.swing.JLabel jLabelReferencia;
    private javax.swing.JLabel jLabelSituacion;
    private javax.swing.JTextField jTxtReferencia;
    // End of variables declaration//GEN-END:variables
    
    private void establecerRestricciones() {
        jTxtReferencia.setDocument(new LimitadorCaracteres(jTxtReferencia, 25, false, false));
        //jTxtSituacion.setDocument(new LimitadorCaracteres(jTxtSituacion, 25, false, false));
    }
        
    private boolean valida(){
        boolean resultado = true;
        this.mensaje=null;
        resultado = resultado && validaReferencia();
        resultado = resultado && validaSituacion();
        if(!resultado){
            // Mostrar mensaje
            Mensaje.error(bundle.getString("ERRORES_EN_DATOS_INTRODUCIDOS")+this.mensaje+"\n");
        }
        return resultado;
    }
       
    private boolean validaReferencia(){
        boolean resultado = true;
        String valor = jTxtReferencia.getText();
        String label = jLabelReferencia.getText();
        if(valor==null || "".equals(valor)){
            // Mensaje campo obligatorio
            if(mensaje==null)mensaje="";
            mensaje+= bundle.getString("EL_CAMPO")+" "+label+" "+bundle.getString("ES_OBLIGATORIO")+"\n";
            resultado = false;
        }
        return resultado;
    }
    
    private boolean validaSituacion(){
        boolean resultado = true;
        String situacion = ((ParCombo)jComboBoxSituacion.getSelectedItem()).getKeyString();
        if(situacion==null || "".equals(situacion)){
            // Mensaje campo obligatorio
            if(mensaje==null)mensaje="";
            mensaje+= bundle.getString("EL_CAMPO");
            mensaje+= " "+jLabelSituacion.getText()+" ";
            mensaje+= bundle.getString("ES_OBLIGATORIO");
            mensaje+= "\n";
            resultado = false;
        }
        return resultado;
    }
    
    private void agregarDatosCombox() {
        //Ingresar los datos en los combox.
        ResultSet rs = null;

        try {
            rs = bd.ejecSelect("SELECT * FROM SITUAC_MODULO");
            while(rs.next())
                jComboBoxSituacion.addItem(new ParCombo(rs.getString(1), rs.getString(2)));
        } catch(SQLException e){
            Mensaje.error("InputGRD.java. "+e.getMessage(), e);
        }
        new AutoComplCmbBxRestrictivo(jComboBoxSituacion);
        //Por defecto seleccionamos en fachada
        for (int i=0; i<jComboBoxSituacion.getItemCount(); i++) {
            if ("F".equals(((ParCombo)jComboBoxSituacion.getItemAt(i)).getKeyString())) {
                jComboBoxSituacion.setSelectedIndex(i);
            }
        }
    }
}