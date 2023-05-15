
package VentanasCalculoSalario;


public class Resultados {
    private static double salarioTotal;
    private static double descuentoISSS;
    private static double descuentoRenta;
    private static double descuentoAFP;
    private static double salarioLiquido;
    
    public Resultados(){
        
    }
    
    public Resultados(double salarioTotal, double descuentoISSS, double descuentoRenta, double descuentoAFP, double salarioLiquido){
        this.salarioTotal = salarioTotal;
        this.descuentoISSS = descuentoISSS;
        this.descuentoRenta = descuentoRenta;
        this.descuentoAFP = descuentoAFP;
        this.salarioLiquido = salarioLiquido;
    }

    public static double getSalarioTotal() {
        return salarioTotal;
    }

    public static void setSalarioTotal(double salarioTotal) {
        Resultados.salarioTotal = salarioTotal;
    }

    public static double getDescuentoISSS() {
        return descuentoISSS;
    }

    public static void setDescuentoISSS(double descuentoISSS) {
        Resultados.descuentoISSS = descuentoISSS;
    }

    public static double getDescuentoRenta() {
        return descuentoRenta;
    }

    public static void setDescuentoRenta(double descuentoRenta) {
        Resultados.descuentoRenta = descuentoRenta;
    }

    public static double getDescuentoAFP() {
        return descuentoAFP;
    }

    public static void setDescuentoAFP(double descuentoAFP) {
        Resultados.descuentoAFP = descuentoAFP;
    }

    public static double getSalarioLiquido() {
        return salarioLiquido;
    }

    public static void setSalarioLiquido(double salarioLiquido) {
        Resultados.salarioLiquido = salarioLiquido;
    }
    
    public static void calcSalarioTotal(double horasNormales, double horasExtras){
        
        double salario1 = 3.75 * horasNormales;
        double salario2 = (3.75 * 2) * horasExtras;
        
        salarioTotal = salario1 + salario2;
    } 
    
    public static void descISSS(){
       
        descuentoISSS = salarioTotal * 0.03;
    }
    
    public static void descRenta(){

        descuentoRenta = salarioTotal * 0.1;
    }
    
    public static void descAFP(){

        descuentoAFP = salarioTotal * 0.0725;
    }
    
    public static void calculoSalario(double horasNormales, double horasExtras){
        calcSalarioTotal(horasNormales, horasExtras);
        descISSS();
        descRenta();
        descAFP();
        
        salarioLiquido = salarioTotal - descuentoISSS - descuentoRenta - descuentoAFP;
    }
    
    
}
