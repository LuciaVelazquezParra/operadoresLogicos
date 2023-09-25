package Ejercicios;

import javax.swing.*;

public class NumeroMenorVeinte {
    public static void verificarNumero(int num){
        if (num>=10 && num<=20)
        {
            JOptionPane.showMessageDialog(null,"El número: "+num+" es mayor que 10 y menor que 20");

        }else{
            JOptionPane.showMessageDialog(null,"El número: "+num+" no cumple con los criterios");

        }

    }
}
