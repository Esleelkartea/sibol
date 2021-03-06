/*
 * InputCGP.java
 *
 * Created on 1 de junio de 2006, 17:05
 */

package graph.input;

import funciones.LimitadorCaracteres;
import graph.beans.CGPBean;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javax.swing.CellEditor;
import main.Mensaje;

/**
 *
 * @author  sanjose
 */
public class InputCGP extends javax.swing.JPanel {
    private static CellEditor cellEditor;
    private static ResourceBundle bundle = ResourceBundle.getBundle("resources/config/config");
    private CGPBean datosCGP;
    private String mensaje = null;
    
    /** Creates new form InputCGP */
    public InputCGP(CellEditor cellEditor) {
        this.cellEditor = cellEditor;
        initComponents();
        establecerRestricciones();
    }
    
    public void installValue(CGPBean valor) {
        datosCGP = valor;
        
        if(datosCGP != null) {
            jTxtReferencia.setText(String.valueOf(datosCGP.getReferencia()));
            jComboBoxTension.setSelectedItem(String.valueOf(datosCGP.getTension()));
            jComboBoxIntensidadBase.setSelectedItem(DecimalFormat.getInstance().format(datosCGP.getIntensidadBase()));
            jComboBoxIntensidadBaseItemStateChanged(null);
            jComboBoxIntensidadCartucho.setSelectedItem(DecimalFormat.getInstance().format(datosCGP.getIntensidadCartucho()));
        }
    }
    
    public CGPBean getValue() {
        return datosCGP;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabelTension = new javax.swing.JLabel();
        jLabelTensionUnidad = new javax.swing.JLabel();
        jLabelIntensidadBase = new javax.swing.JLabel();
        jLabelIntensidadBaseUnidad = new javax.swing.JLabel();
        jLabelIntensidadCartucho = new javax.swing.JLabel();
        jLabelIntensidadCartuchoUnidad = new javax.swing.JLabel();
        jBtnAceptar = new javax.swing.JButton();
        jLabelReferencia = new javax.swing.JLabel();
        jTxtReferencia = new javax.swing.JTextField();
        jComboBoxTension = new javax.swing.JComboBox();
        jComboBoxIntensidadBase = new javax.swing.JComboBox();
        jComboBoxIntensidadCartucho = new javax.swing.JComboBox();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabelTension.setText("Tensi\u00f3n");

        jLabelTensionUnidad.setText("V");

        jLabelIntensidadBase.setText("Intensidad Base");

        jLabelIntensidadBaseUnidad.setText("A");

        jLabelIntensidadCartucho.setText("Intensidad cartucho");

        jLabelIntensidadCartuchoUnidad.setText("A");

        jBtnAceptar.setText("Aceptar");
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });

        jLabelReferencia.setText("Referencia");

        jTxtReferencia.setColumns(30);

        jComboBoxTension.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "230", "400", "400/230" }));

        jComboBoxIntensidadBase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "100", "160", "250", "400" }));
        jComboBoxIntensidadBase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxIntensidadBaseItemStateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jBtnAceptar)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabelReferencia)
                            .add(jLabelTension)
                            .add(jLabelIntensidadBase)
                            .add(jLabelIntensidadCartucho))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jComboBoxIntensidadCartucho, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jComboBoxIntensidadBase, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jComboBoxTension, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jTxtReferencia, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelIntensidadCartuchoUnidad)
                    .add(jLabelIntensidadBaseUnidad)
                    .add(jLabelTensionUnidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelReferencia)
                    .add(jTxtReferencia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelTension)
                    .add(jComboBoxTension, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelTensionUnidad))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelIntensidadBase)
                    .add(jComboBoxIntensidadBase, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelIntensidadBaseUnidad))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelIntensidadCartucho)
                    .add(jComboBoxIntensidadCartucho, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelIntensidadCartuchoUnidad))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jBtnAceptar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
// TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void jComboBoxIntensidadBaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxIntensidadBaseItemStateChanged
        String intensidadBase = (String)jComboBoxIntensidadBase.getSelectedItem();
        if("100".equals(intensidadBase)){
            jComboBoxIntensidadCartucho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "2", "4", "6", "10", "16", "20", "25", "32", "40", "50", "63", "80", "100" }));
        } else if("160".equals(intensidadBase)){
            jComboBoxIntensidadCartucho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "63", "80", "100", "125", "160" }));
        } else if("250".equals(intensidadBase)){
            jComboBoxIntensidadCartucho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "160", "200", "250" }));
        } else if("400".equals(intensidadBase)){
            jComboBoxIntensidadCartucho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "250", "315", "400" }));
        } else {
            jComboBoxIntensidadCartucho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        }
    }//GEN-LAST:event_jComboBoxIntensidadBaseItemStateChanged
    
    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed
        if(valida()){
            String referencia = jTxtReferencia.getText();
            String tension = String.valueOf(jComboBoxTension.getSelectedItem());
            double intensidadBase = 0;
            double intensidadCartucho = 0;
            try {
                intensidadBase = Double.parseDouble(String.valueOf(jComboBoxIntensidadBase.getSelectedItem()).replace(",","."));
                intensidadCartucho = Double.parseDouble(String.valueOf(jComboBoxIntensidadCartucho.getSelectedItem()).replace(",","."));
            } catch(NumberFormatException e) {}
            datosCGP.setReferencia(referencia);
            datosCGP.setTension(tension);
            datosCGP.setIntensidadBase(intensidadBase);
            datosCGP.setIntensidadCartucho(intensidadCartucho);
            datosCGP.setEditado(true);
            cellEditor.stopCellEditing();
        }
    }//GEN-LAST:event_jBtnAceptarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JComboBox jComboBoxIntensidadBase;
    private javax.swing.JComboBox jComboBoxIntensidadCartucho;
    private javax.swing.JComboBox jComboBoxTension;
    private javax.swing.JLabel jLabelIntensidadBase;
    private javax.swing.JLabel jLabelIntensidadBaseUnidad;
    private javax.swing.JLabel jLabelIntensidadCartucho;
    private javax.swing.JLabel jLabelIntensidadCartuchoUnidad;
    private javax.swing.JLabel jLabelReferencia;
    private javax.swing.JLabel jLabelTension;
    private javax.swing.JLabel jLabelTensionUnidad;
    private javax.swing.JTextField jTxtReferencia;
    // End of variables declaration//GEN-END:variables
    
    private void establecerRestricciones() {
        jTxtReferencia.setDocument(new LimitadorCaracteres(jTxtReferencia, 25, false, false));
    }
        
    private boolean valida(){
        boolean resultado = true;
        this.mensaje=null;
        resultado = resultado && validaReferencia();
        //resultado = resultado && validaTension();
        //resultado = resultado && validaIntensidadBase();
        //resultado = resultado && validaIntensidadCartucho();
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
    
    private boolean validaTension(){
        boolean resultado = true;
        String tension = (String)jComboBoxTension.getSelectedItem();
        if(tension==null || "".equals(tension)){
            // Mensaje campo obligatorio
            if(mensaje==null)mensaje="";
            mensaje+= bundle.getString("EL_CAMPO");
            mensaje+= " "+jLabelTension.getText()+" ";
            mensaje+= bundle.getString("ES_OBLIGATORIO");
            mensaje+= "\n";
            resultado = false;
        }
        return resultado;
    }
    
    private boolean validaIntensidadBase(){
        boolean resultado = true;
        String intensidadBase = (String)jComboBoxIntensidadBase.getSelectedItem();
        if(intensidadBase==null || "".equals(intensidadBase)){
            // Mensaje campo obligatorio
            if(mensaje==null)mensaje="";
            mensaje+= bundle.getString("EL_CAMPO");
            mensaje+= " "+jLabelIntensidadBase.getText()+" ";
            mensaje+= bundle.getString("ES_OBLIGATORIO");
            mensaje+= "\n";
            resultado = false;
        }
        return resultado;
    }
    
    private boolean validaIntensidadCartucho(){
        boolean resultado = true;
        String intensidadCartucho = (String)jComboBoxIntensidadCartucho.getSelectedItem();
        if(intensidadCartucho==null || "".equals(intensidadCartucho)){
            // Mensaje campo obligatorio
            if(mensaje==null)mensaje="";
            mensaje+= bundle.getString("EL_CAMPO");
            mensaje+= " "+jLabelIntensidadCartucho.getText()+" ";
            mensaje+= bundle.getString("ES_OBLIGATORIO");
            mensaje+= "\n";
            resultado = false;
        }
        return resultado;
    }
    
}
