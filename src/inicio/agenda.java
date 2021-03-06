/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.F1;

/**
 *
 * @author Josue
 */
public class agenda extends javax.swing.JPanel {

    /**
     * Creates new form agenda
     */
    
    F1 con = new F1();
    DefaultTableModel tablaDoctores = new DefaultTableModel();
    DefaultTableModel tablaPacientes = new DefaultTableModel();
    
    
    int contador;
    
    public agenda() {
        initComponents();
        mostrarDoctores();
        mostrarPacientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFDiagnostico = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDoctores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTPacientes = new javax.swing.JTable();
        jDCFechaCita = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("FECHA DE CITA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Castellar", 0, 36)); // NOI18N
        jLabel9.setText("AGENDA");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 38, -1, -1));

        jLabel2.setText("HORA DE CITA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jLabel3.setText("SELECCIONE UN DOCTOR:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel4.setText("SELECCIONE UN PACIENTE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel5.setText("DIAGNOSTICO");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/evento.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 310, 250));
        add(jTFDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 160, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/cancelar.png"))); // NOI18N
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/Accept_37154 (1).png"))); // NOI18N
        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jTDoctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTDoctores);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 340, 110));

        jTPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTPacientes);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 340, 110));
        add(jDCFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 160, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "8:00 a 8:30", "9:00 a 9:30", "10:00 a 10:30", "11:00 a 11:30", "12:00 a 13:00", "14:30 a 15:00", "15:30 a 16:00", "16:30 a 17:00", "17:30 a 18:00" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        validarCita();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Cita cancelada");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    public void mostrarDoctores(){
    
        
        String query = "SELECT * FROM empleados WHERE rol='DOCTOR'";
        ResultSet resultado = con.ejecutarQuery2(query);
        
        
        
        jTDoctores.setModel(tablaDoctores);
          
        tablaDoctores.setColumnIdentifiers(new Object[] {"CODIGO","NOMBRE","APELLIDO"});
        
        
        try{
        
            while (resultado.next()){
                
                                       
                tablaDoctores.addRow(new Object[] {resultado.getInt("idEmpleado"),resultado.getString("nombreEmpleado"),resultado.getString("apellidoEmpleado")});
                
           }
        
        }catch(SQLException ex){
            
            
            System.out.println(ex.toString());
        }

        
    }
    
    
    public void mostrarPacientes(){
        
        jTPacientes.setModel(tablaPacientes);
          
        tablaPacientes.setColumnIdentifiers(new Object[] {"CODIGO","NOMBRE","APELLIDO"});
        
        String query = "SELECT * FROM paciente";
        ResultSet resultado = con.ejecutarQuery2(query);
        
        
         try{
        
            while (resultado.next()){
                
                                       
                tablaPacientes.addRow(new Object[] {resultado.getInt("idpaciente"),resultado.getString("nombrePaciente"),resultado.getString("apellidoPaciente")});
                
           }
        
        }catch(SQLException ex){
            
            
            System.out.println(ex.toString());
        }
    
    }
    
    
    public void guardarCita(){
        
           DefaultTableModel modeloDoc = (DefaultTableModel) jTDoctores.getModel();
           DefaultTableModel modeloPaciente = (DefaultTableModel) jTPacientes.getModel();
           
           
    
           String fecha = ((JTextField) jDCFechaCita.getDateEditor().getUiComponent()).getText();
  
           String diagnostico = jTFDiagnostico.getText();
           
           String idDoctor = Integer.toString((Integer)modeloDoc.getValueAt(jTDoctores.getSelectedRow(), 0) );
           int idDoc = Integer.parseInt(idDoctor);
           String idPaciente = Integer.toString((Integer)modeloPaciente.getValueAt(jTPacientes.getSelectedRow(), 0) );
           int idPac = Integer.parseInt(idPaciente);
                    
           String hora = (String) jComboBox1.getSelectedItem();
           
           
           
           String query = "INSERT INTO citas(horaCita,diaCita,diagnostico,empleados_idEmpleado,paciente_idpaciente)"
                   + "VALUES ('"+hora+"','"+fecha+"','"+diagnostico+"','"+idDoc+"','"+idPac+"')";
           
           
           con.ejecutarQuery(query);
           
           
           
    
    
    }
    
    
    public void validarCita(){
    
    
           ResultSet resultado;
           DefaultTableModel modeloDoc = (DefaultTableModel) jTDoctores.getModel();
           DefaultTableModel modeloPaciente = (DefaultTableModel) jTPacientes.getModel();
           
           
    
           String fecha = ((JTextField) jDCFechaCita.getDateEditor().getUiComponent()).getText();
  
           String diagnostico = jTFDiagnostico.getText();
           
           String idDoctor = Integer.toString((Integer)modeloDoc.getValueAt(jTDoctores.getSelectedRow(), 0) );
           int idDoc = Integer.parseInt(idDoctor);
           String idPaciente = Integer.toString((Integer)modeloPaciente.getValueAt(jTPacientes.getSelectedRow(), 0) );
           int idPac = Integer.parseInt(idPaciente);
                    
           String hora = (String) jComboBox1.getSelectedItem();
           
           
           
           
           String query = "SELECT * FROM citas WHERE horaCita = '"+hora+"' AND diaCita='"+fecha+"' AND empleados_idEmpleado = '"+idDoc+"'";
             
           
           
           resultado = con.ejecutarQuery2(query);
           
           try{
                 
               
                if(resultado.next()){
                    
                    JOptionPane.showMessageDialog(null, "Error, esta cita ya esta en uso");
                    
               
                }else{
                    
                     String query2 = "SELECT * FROM citas WHERE horaCita = '"+hora+"' AND diaCita='"+fecha+"' AND paciente_idpaciente = '"+idPac+"'";
                     
                     resultado = con.ejecutarQuery2(query2);
                     
                    if(resultado.next()){
                    
                        JOptionPane.showMessageDialog(null, "Error, esta cita ya esta en uso");
                    }else{
                    
                        guardarCita();
                    }
                    
                    
                }
           
           }catch(SQLException ex){
               
               System.out.println(ex.toString());
           
           }
           
           
        
    
    
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDCFechaCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTDoctores;
    private javax.swing.JTextField jTFDiagnostico;
    private javax.swing.JTable jTPacientes;
    // End of variables declaration//GEN-END:variables
}
