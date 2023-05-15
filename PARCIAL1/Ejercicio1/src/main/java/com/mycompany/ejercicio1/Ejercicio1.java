
package com.mycompany.ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero: "));
        
        Numero num = new Numero(n);
        
        if(num.palindromo())
            JOptionPane.showMessageDialog(null, n + " Es palindromo");
        else
            JOptionPane.showMessageDialog(null, n + " No es palindromo");
            
    }
}
