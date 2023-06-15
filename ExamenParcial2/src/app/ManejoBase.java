/*

NOMBRES Y CARNETS:

- Diego Calvo Solis 00103322
- Diego Fernando Hernández Torres 00007222
- Jaime Adonay Jiménez Clímaco 00081622

*/
package app;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class ManejoBase extends ConexionDB{
    
    public ManejoBase(){}
    
    public void AgregarReg(String nombre, String apellido, int tirosL, int tirosE){
        
        try {
            Connection con = new ConexionDB().getConnection(); //conectando a base
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO Participantes (nombre, apellido, tiros_lanzados, tiros_encestados) VALUES (?, ?, ?, ?)");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, tirosL);
            ps.setInt(4, tirosE);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en AgregarReg " + e.getMessage());
        }
    }
    
    public void EliminarReg(String nombre){
        PreparedStatement st;
        ResultSet rs;
        
        try {
            Connection con = new ConexionDB().getConnection(); //conectando a base
            
            st = con.prepareStatement("SELECT nombre FROM Participantes WHERE nombre = '" + nombre + "';");
            rs = st.executeQuery();
            
            if(rs.next()){
                PreparedStatement ps = con.prepareStatement("DELETE FROM Participantes WHERE nombre = '" + nombre + "';");

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
            else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado, no se eliminó ningún registro");
                return;
            }
     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en EliminarReg " + e.getMessage());
        }
    }
    
    public void ModificarReg(String nombre, String apellido, int tirosL, int tirosE){

        PreparedStatement st;
        ResultSet rs;
        
        try {
            Connection con = new ConexionDB().getConnection(); //conectando a base
            
            st = con.prepareStatement("SELECT nombre FROM Participantes WHERE nombre = '" + nombre + "';");
            rs = st.executeQuery();
            
            if(rs.next()){
                PreparedStatement ps = con.prepareStatement("UPDATE Participantes SET apellido=?, tiros_lanzados = ?, tiros_encestados = ? WHERE nombre = '" + nombre + "';");
                ps.setString(1, apellido);
                ps.setInt(2, tirosL);
                ps.setInt(3, tirosE);

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Registro Modificado");
            }
            else{
                int op = JOptionPane.YES_NO_OPTION;
                int opc = JOptionPane.showConfirmDialog(null, "Registro no encontrado, no se puede realizar la modificacion. ¿Desea agregar este registro a la base de datos?", "Opcion", op);
  
                if(opc == 0)  
                   AgregarReg(nombre, apellido, tirosL, tirosE); 
                else if(opc == 1)
                    return;
            }
     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en ModificarReg " + e.getMessage());
        }
    }
    
    public void ConsultarReg(javax.swing.JTable tabla){
        
        DefaultTableModel tableModel = (DefaultTableModel)tabla.getModel();
        tableModel.setRowCount(0);  
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columns;
        
        try {
            Connection con = ConexionDB.getConnection();
            ps = con.prepareStatement("SELECT * FROM Participantes");
            
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();          
            columns = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columns];
                
                for(int i = 0; i < columns; i++)
                    fila[i] = rs.getObject(i + 1);
                
                tableModel.addRow(fila);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en consulta: " + e.getMessage());
        }

    }
    
    public void ConsultarReg(javax.swing.JTable tabla, String nombre){
        
        DefaultTableModel tableModel = (DefaultTableModel)tabla.getModel();
        tableModel.setRowCount(0);  
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columns;
        
        PreparedStatement st;
        ResultSet ss;
        
        
        try {
            Connection con = ConexionDB.getConnection();
            
            st = con.prepareStatement("SELECT nombre FROM Participantes WHERE nombre = '" + nombre + "';");
            ss = st.executeQuery();
            
            if(ss.next()){
                ps = con.prepareStatement("SELECT * FROM Participantes WHERE nombre = '" + nombre + "';");

                rs = ps.executeQuery();
                rsmd = rs.getMetaData();          
                columns = rsmd.getColumnCount();

                while(rs.next()){
                    Object[] fila = new Object[columns];

                    for(int i = 0; i < columns; i++)
                        fila[i] = rs.getObject(i + 1);

                    tableModel.addRow(fila);

                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en consulta: " + e.getMessage());
        }

    }
}
