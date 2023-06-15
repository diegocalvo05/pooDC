/*

NOMBRES Y CARNETS:

- Diego Calvo Solis 00103322
- Diego Fernando Hernández Torres 00007222
- Jaime Adonay Jiménez Clímaco 00081622

*/
package app;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionDB {
    
    public ConexionDB(){}
    
    public static Connection getConnection(){
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=CompetenciaTirosAlAro;"
                + "user=sa;"
                + "password=12345678;"
                + "loginTimeout=30;"
                + "integratedSecurity=false; trustServerCertificate=true;";
        
        try {
            Connection con = DriverManager.getConnection(url);
            
            return con;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error en conexion a BD");
            return null;
        }
    } 
}
