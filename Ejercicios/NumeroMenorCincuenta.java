package Ejercicios;

import javax.swing.*;

public class NumeroMenorCincuenta {
    public static void verificarNumero(int numero){
        if (numero<50 || numero > 100){
            JOptionPane.showMessageDialog(null,"El número es menor a 50 o mayor a 100");
        }else {
            JOptionPane.showMessageDialog(null,"El número esta entre 50 y 100");
        }
    }
}
