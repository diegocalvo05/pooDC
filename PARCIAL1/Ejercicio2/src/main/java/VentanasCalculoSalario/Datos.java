
package VentanasCalculoSalario;


public class Datos {
    private static double horasNormales;
    private static double horasExtras;

    public Datos(){
        
    }
    
    public Datos(double horasNormales, double horasExtras) {
        this.horasNormales = horasNormales;
        this.horasExtras = horasExtras;
    }

    public static double getHorasNormales() {
        return horasNormales;
    }

    public static void setHorasNormales(double horasNormales) {
        Datos.horasNormales = horasNormales;
    }

    public static double getHorasExtras() {
        return horasExtras;
    }

    public static void setHorasExtras(double horasExtras) {
        Datos.horasExtras = horasExtras;
    }
   
}
