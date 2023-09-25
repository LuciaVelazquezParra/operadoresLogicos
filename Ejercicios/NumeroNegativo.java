package Ejercicios;

import javax.swing.*;

public class NumeroNegativo {
    public static void comprobarNumero(int numero){
        if (numero<0 || numero==0){
            JOptionPane.showMessageDialog(null,"El número es negativo o igual a cero");
        }else {
            JOptionPane.showMessageDialog(null,"El número no es negativo o es diferente a cero");
        }
    }
}
