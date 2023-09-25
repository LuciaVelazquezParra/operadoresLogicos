package Ejercicios;

import javax.swing.*;
import java.util.Locale;

public class OperacionesCadena {
    public static boolean busquedaLetra(String cadena, char letra){
        boolean resultado=false;
        for (int i = 0; i <cadena.length() ; i++) {
            if (cadena.charAt(i)==letra){
                resultado=true;
                break;
            }else{
                resultado=false;
            }
        }
        return resultado;
    }

    public static boolean busquedaPalabra(String cadena, String palabra){
        boolean resultado=cadena.contains(palabra);
        return resultado;
    }
    public static void verificarCadena(String c){
        String cadena=c.toLowerCase();
        if (busquedaLetra(cadena,'a') && busquedaLetra(cadena,'b')){
            JOptionPane.showMessageDialog(null,"La cadena contiene la letra \"a\" y la letra \"b\" ");

        }else{
            JOptionPane.showMessageDialog(null,"La cadena no tiene ambas letras \"a\" y \"b\"");
        }
    }
    public static void contienePalabraJava(String cadena){
       String auxCadena=cadena.toLowerCase();
        if (busquedaPalabra(auxCadena,"java") && !busquedaPalabra(auxCadena,"python")){
            JOptionPane.showMessageDialog(null,"El texto contiene la palabra \"Java\" y no contiene la palabra \"Python\"");
        }else{
            JOptionPane.showMessageDialog(null, "La cadena no cumple con los criterios");
        }
    }
}
