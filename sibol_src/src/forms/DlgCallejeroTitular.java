/*
 * DlgCallejeroTitular.java
 *
 * Created on 4 de agosto de 2006, 21:30
 */

package forms;

import funciones.AutoComplCmbBxRestrictivo;
import funciones.BaseDatos;
import funciones.ParCombo;
import funciones.Sesion;
import funciones.beans.ModeloTablaNoEditable;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.table.TableColumn;
import main.Mensaje;

/**
 *
 * @author  Enrique
 */
public class DlgCallejeroTitular extends javax.swing.JDialog {
    
    BaseDatos bd = null;
    ParCombo pcProv = null;
    ParCombo pcMun = null;
    ParCombo pcLoc = null;
    FrmGestionPnl frmGestion = null;
    
    public DlgCallejeroTitular(javax.swing.JFrame frame, boolean modal) {
        super(frame, modal);
        initComponents();
        bd = Sesion.getInstance().getBaseDatos();
        frmGestion = (FrmGestionPnl)Sesion.getInstance().getValorHt("objFrmGestionPnl");
        agregarDatosCombox();
        pcProv = (ParCombo)Sesion.getInstance().getValorHt("provinciaTitular");
        pcMun = (ParCombo)Sesion.getInstance().getValorHt("municipioTitular");
        pcLoc = (ParCombo)Sesion.getInstance().getValorHt("localidadTitular");
        
        this.jLblProvincia.setText(pcProv.getDescription());
        this.jLblMunicipio.setText(pcMun.getDescription());
        this.jLblLocalidad.setText(pcLoc.getDescription());
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jTxtFldDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBttnBuscar = new javax.swing.JButton();
        jCmbBxTipoCalle = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLblProvincia = new javax.swing.JLabel();
        jLblMunicipio = new javax.swing.JLabel();
        jLblLocalidad = new javax.swing.JLabel();
        jLblProvincia1 = new javax.swing.JLabel();
        jLblMunicipio1 = new javax.swing.JLabel();
        jLblLocalidad1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblDirecciones = new javax.swing.JTable();
        jBttnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("B\u00fasqueda de calles");
        setIconImage((new ImageIcon(getClass().getResource("/resources/icons/sibol.gif"))).getImage());
        setResizable(false);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Tipo de calle");

        jLabel2.setText("Direcci\u00f3n");

        jBttnBuscar.setText("Buscar");
        jBttnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnBuscarActionPerformed(evt);
            }
        });

        jCmbBxTipoCalle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("INTRODUZCA B\u00daSQUEDA");

        jLblProvincia1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLblProvincia1.setText("Provincia:");

        jLblMunicipio1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLblMunicipio1.setText("Municipio:");

        jLblLocalidad1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLblLocalidad1.setText("Localidad:");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jCmbBxTipoCalle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jTxtFldDireccion, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jBttnBuscar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jLabel2)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLblProvincia1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLblProvincia)
                        .add(43, 43, 43)
                        .add(jLblMunicipio1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLblMunicipio)
                        .add(32, 32, 32)
                        .add(jLblLocalidad1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLblLocalidad)))
                .addContainerGap())
            .add(jPanel1Layout.createSequentialGroup()
                .add(192, 192, 192)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .add(12, 12, 12)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLblProvincia1)
                    .add(jLblProvincia)
                    .add(jLblLocalidad1)
                    .add(jLblLocalidad)
                    .add(jLblMunicipio1)
                    .add(jLblMunicipio))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jCmbBxTipoCalle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTxtFldDireccion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jBttnBuscar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTblDirecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de calle", "Direcci�n"
            }
        ));
        TableColumn column = null;
        column = jTblDirecciones.getColumnModel().getColumn(0);
        column.setPreferredWidth(100);
        column = jTblDirecciones.getColumnModel().getColumn(1);
        column.setPreferredWidth(350);
        jScrollPane1.setViewportView(jTblDirecciones);

        jBttnAceptar.setText("ACEPTAR");
        jBttnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnAceptarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .add(jBttnAceptar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 107, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jBttnAceptar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBttnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnAceptarActionPerformed
        
        try{
            String tipoCalle = jTblDirecciones.getValueAt(jTblDirecciones.getSelectedRow(),0).toString();
            String direccion = jTblDirecciones.getValueAt(jTblDirecciones.getSelectedRow(),1).toString();
            frmGestion.jTxtFldDomicilioTitular.setText(tipoCalle+" - "+direccion);
            this.setVisible(false);
            this.dispose();
        }
        catch(ArrayIndexOutOfBoundsException e){
           Mensaje.aviso("Seleccione alguna direcci�n tras haber introducido alg�n criterio de b�squeda");
       }
    }//GEN-LAST:event_jBttnAceptarActionPerformed

    private void jBttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnBuscarActionPerformed
        
        ResultSet rs = null;
        String consulta = "";
        String tipoCalle = this.jCmbBxTipoCalle.getSelectedItem().toString();
        String direccion = this.jTxtFldDireccion.getText().toUpperCase();
        
        if(tipoCalle.equals("") && direccion.equals(""))
            consulta = "SELECT * FROM CALLEJERO WHERE CLPRID="+pcProv.getKeyInt()+" AND CLMUID="+pcMun.getKeyInt()+" AND CLLCID="+pcLoc.getKeyInt()+" ORDER BY CLNOM";
        else if(tipoCalle.equals(""))
            consulta = consulta="SELECT * FROM CALLEJERO WHERE CLPRID="+pcProv.getKeyInt()+" AND CLMUID="+pcMun.getKeyInt()+" AND CLLCID="+pcLoc.getKeyInt()+" AND UPPER(CLNOM) LIKE '"+direccion.toUpperCase()+"%'"+" ORDER BY CLNOM";
        else if(direccion.equals(""))
            consulta = consulta="SELECT * FROM CALLEJERO WHERE CLPRID="+pcProv.getKeyInt()+" AND CLMUID="+pcMun.getKeyInt()+" AND CLLCID="+pcLoc.getKeyInt()+" AND CLTIPO = '"+tipoCalle+"'"+" ORDER BY CLNOM";
        else
            consulta = consulta="SELECT * FROM CALLEJERO WHERE CLPRID="+pcProv.getKeyInt()+" AND CLMUID="+pcMun.getKeyInt()+" AND CLLCID="+pcLoc.getKeyInt()+" AND UPPER(CLNOM) LIKE '"+direccion.toUpperCase()+"%' AND CLTIPO='"+tipoCalle+"'"+" ORDER BY CLNOM";
        
        try{
            ModeloTablaNoEditable modelo = null;
            rs = bd.ejecSelect(consulta);
            Object [] col = new Object[2];
            if(rs.next())
            {
                modelo = new ModeloTablaNoEditable();
                this.jTblDirecciones.setModel(modelo);

                modelo.addColumn("Tipo de calle");
                modelo.addColumn("Direcci�n");
                rs = bd.ejecSelect(consulta);
                while (rs.next())
                {
                    // Se crea un array que ser� una de las filas de la tabla. 
                     // Hay 2 columnas en la tabla

                    col[0] = rs.getObject("CLTIPO");
                    col[1] = rs.getObject("CLNOM");
                    modelo.addRow(col);
                }
                
                jTblDirecciones.getColumnModel().getColumn(0).setPreferredWidth(100);
                jTblDirecciones.getColumnModel().getColumn(1).setPreferredWidth(350);
            }
            else
            {
                jTblDirecciones.setModel(new ModeloTablaNoEditable(
                new Object [][] {},new String [] {
                        "Tipo de calle", "Direcci�n"
                    }
                ));
                jTblDirecciones.getColumnModel().getColumn(0).setPreferredWidth(100);
                jTblDirecciones.getColumnModel().getColumn(1).setPreferredWidth(350);
                Mensaje.aviso("No existe ning�n registro con el criterio de b�squeda elegido");
            }
        }
        catch(Exception e){
            Mensaje.error("DlgDireccionTitular.java:  "+e.getMessage(),e);
        }
    }//GEN-LAST:event_jBttnBuscarActionPerformed
    

    private void agregarDatosCombox() {
        ResultSet rs = null;
        
        try{  
            rs = bd.ejecSelect("SELECT DISTINCT CLTIPO FROM CALLEJERO ORDER BY CLTIPO");
            while(rs.next()){
                this.jCmbBxTipoCalle.addItem(rs.getString("CLTIPO"));
            }
        }
        catch(Exception e){
            Mensaje.error("DlgDireccionTitular.java \n "+e.getMessage(),e);
        }
        
        //Los comboboxes son autocompletables
        new AutoComplCmbBxRestrictivo(this.jCmbBxTipoCalle);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnAceptar;
    private javax.swing.JButton jBttnBuscar;
    private javax.swing.JComboBox jCmbBxTipoCalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblLocalidad;
    private javax.swing.JLabel jLblLocalidad1;
    private javax.swing.JLabel jLblMunicipio;
    private javax.swing.JLabel jLblMunicipio1;
    private javax.swing.JLabel jLblProvincia;
    private javax.swing.JLabel jLblProvincia1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblDirecciones;
    private javax.swing.JTextField jTxtFldDireccion;
    // End of variables declaration//GEN-END:variables
    
}
