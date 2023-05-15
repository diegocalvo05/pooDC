
package com.mycompany.ejercicio1;

public class Numero {
    public int n;
    
    public Numero(int n){
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int invertir(int n){
        int invertido = 0;
        
        while(n != 0){
            invertido = invertido*10 + n%10;
            n /= 10;
        }
        
        return invertido;
    }
    
    public boolean palindromo(){
        int x = invertir(n);
        
        if(n == x)
            return true;
        else
            return false;
    }
}
