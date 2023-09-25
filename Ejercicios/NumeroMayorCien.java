package Ejercicios;

import javax.swing.*;

public class NumeroMayorCien {
    public static void comprobarNumero(int num){
        if (num>=100 || num<=-100){
            JOptionPane.showMessageDialog(null,"El número es mayor que 100 o menor que -100");
        }else{
            JOptionPane.showMessageDialog(null,"El número esta entre 99 y -99 ");
        }
    }
}
