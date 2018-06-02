/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruno;


import java.util.Scanner;

/**
 *
 * @author Pavilion g4
 */
public class TallerUno {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase");
        frase=teclado.nextLine();
        System.out.println(TallerUno.contCaracteres(frase));
        System.out.println(TallerUno.contEspacios(frase));
        System.out.println(TallerUno.contPalabras(frase));

    }

    /**
     * Nombre del Metodo: contCaracteres <br>
     * Descripcion del Metodo: Metodo que recibe una frase y devuelve el conteo de los caracteres de la frase <br>
     * @param frase ingresar una frase.
     * @return contadorEspacios - retorna el numero de caracteres en la frase
     */
    public static int contCaracteres(String frase){
        
        int tamaño;
        tamaño=frase.length();
        return tamaño;
    }

    /**
     * Nombre del Metodo: contEspacios <br>
     * Descripcion del Metodo: Metodo que recibe una frase y devuelve el conteo de los espacios en blanco <br>
     * @param frase ingresar una frase.
     * @return contadorEspacios - retorna el numero de espacios en blanco en la frase
     */
    public static int contEspacios(String frase){

        int contadorEspacios=0;
        char[] arrayChar = frase.toCharArray();
        for(int i=0; i<arrayChar.length; i++ ){
            if (arrayChar[i] == ' '){
                contadorEspacios ++;
            }
        }
        return contadorEspacios;
    }

    /**
     * Nombre del Metodo: contPalabras <br>
     * Descripcion del Metodo: Metodo que recibe una frase y devuelve el numero palabras que hay en ella <br>
     * @param frase ingresar una frase.
     * @return contadorPalabras - retorna el numero de palabras que hay en la frase
     */
    public static int contPalabras(String frase){

        int contadorPalabras=1;// @return
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