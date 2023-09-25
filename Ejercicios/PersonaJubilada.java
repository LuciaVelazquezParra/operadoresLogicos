package Ejercicios;

import javax.swing.*;

public class PersonaJubilada {
    public static void esJubilada(int edad, int option){
        int no=1;
        if (edad>18 && option==no){
            JOptionPane.showMessageDialog(null,"Es adulta y no es jubilada");
        }else{
            JOptionPane.showMessageDialog(null,"No cumple con los criterios de ser adulta o no jubilada.");
        }
    }
}
