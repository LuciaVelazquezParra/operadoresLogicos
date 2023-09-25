package Ejercicios;

import javax.swing.*;

public class NotaAprobada {
    public static void validarNota(Float nota){
        if (nota >=60 && nota<=100)
        {
            JOptionPane.showMessageDialog(null,"Ha sido aprobado");
        }
        else{
            JOptionPane.showMessageDialog(null,"No ha aprobado");}

    }
}
