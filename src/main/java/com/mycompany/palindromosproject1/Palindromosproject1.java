/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromosproject1;

/**
 *
 * @author Lenovo
 */
public class Palindromosproject1 {
   
    
    public boolean esPalindromo(String palabra){
        return auxiliar(palabra,0, palabra.length()-1);          
    }
    private boolean auxiliar(String palabra,int IndiceIzq, int IndiceDer){
        if(IndiceIzq >= IndiceDer){
            return true;
        }
        if (palabra.charAt(IndiceIzq)!= palabra.charAt(IndiceDer)){
            return false;
        }
        return auxiliar(palabra,IndiceIzq+1, IndiceDer-1);
    }
    public boolean Palindromosproject1(String Palabra){
        return auxiliar (Palabra,0, Palabra.length()-1);
    }
    public static void main(String[] args){
       Palindromosproject1 prueba = new Palindromosproject1();
        
        String palabra="radar";
        
        boolean resultado = prueba.esPalindromo(palabra);
        System.out.println(resultado); 
    }
            
}
