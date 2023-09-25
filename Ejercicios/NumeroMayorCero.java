package Ejercicios;

import javax.swing.*;

public class NumeroMayorCero
{
    public static void comprobarNumero(int num){
        if (num>0 && num!=0){
            JOptionPane.showMessageDialog(null,"El número: "+num+" es positivo y no es igual a cero.");
        }else if (num==0){
            JOptionPane.showMessageDialog(null,"El número: "+num+" es igual a cero");
        }else{
            JOptionPane.showMessageDialog(null,"El número: "+num+" es negativo");
        }
    }
}
