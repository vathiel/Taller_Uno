/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_uno;

import java.util.Scanner;

/**
 *
 * @author Pavilion g4
 */
public class Taller_Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase");
        frase=teclado.nextLine();
        System.out.println(Taller_Uno.contCaracteres(frase));
        System.out.println(Taller_Uno.contEspacios(frase));
        System.out.println(Taller_Uno.contPalabras(frase));

    }
    
    public static int contCaracteres(String frase){
        /*
        *nombre: contCaracteres
        *Descripcion: Metodo que recibe una frase y devuelve el numero de caracteres que posee
        *parametros de entrada: 
        *frase: una frase cualquiera <String>
        *parametros de retorno:
        *tamaño: numero de caracteres que tiene la frase <int>
        */
        int tamaño;
        tamaño=frase.length();
        return tamaño;
    }
    
    public static int contEspacios(String frase){
         /*
        *nombre: contEspacios
        *Descripcion: Metodo que recibe una frase y devuelve el numero de espacios en blanco que tiene
        *parametros de entrada: 
        *frase: una frase cualquiera <String>
        *parametros de retorno:
        *contadorEspacios: numero de espacios en blanco que hay en la frase <int>
        */
        int contadorEspacios=0;
        char[] arrayChar = frase.toCharArray();
        for(int i=0; i<arrayChar.length; i++ ){
            if (arrayChar[i] == ' '){
                contadorEspacios ++;
            }
        }
        return contadorEspacios;
    }
    
    public static int contPalabras(String frase){
         /*
        *nombre: contPalabras
        *Descripcion: Metodo que recibe una frase y devuelve el numero palabras que hay en ella
        *parametros de entrada: 
        *frase: una frase cualquiera <String>
        *parametros de retorno:
        *ContadorPalabras: numero de palabras en blanco que hay en la frase <int>
        */
        int contadorPalabras=1;
        if(frase.isEmpty()){return 0;}
        else {
        char[] arrayChar = frase.toCharArray();
        for(int i=0; i<arrayChar.length; i++ ){
            if (arrayChar[i] == ' '){
                contadorPalabras ++;
            }
        }
                }
        return contadorPalabras;
    }
}