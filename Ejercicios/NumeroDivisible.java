package Ejercicios;

import javax.swing.*;

public class NumeroDivisible {
    public static void validarNumDivisible(int numero){
        if ((numero % 2==0) && numero % 3 == 0 ){
            JOptionPane.showMessageDialog(null,"El número: "+numero+" es divisible entre 2 y 3");
        }else{
            JOptionPane.showMessageDialog(null,"El numero:"+numero+" no es divisible entre 2 y 3");
        }

    }
}
