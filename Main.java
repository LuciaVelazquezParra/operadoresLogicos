import Ejercicios.*;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean bandera=true;
        try {
            while (bandera) {
                int op = Integer.parseInt(JOptionPane.showInputDialog("" +
                        "Selecciona una opción:\n" +
                        "1.Comprueba si un número es mayor que 10 y menor que 20.\n" +
                        "2.Validar si el número es divisible por 2 y por 3.\n" +
                        "3.Determina si una cadena de texto contiene la letra \"a\" y la letra \"b\".\n" +
                        "4.Comprueba si un número es positivo y no es igual a cero.\n" +
                        "5.Determina si un estudiante ha aprobado si su nota es mayor o igual a 60 y menor o igual a 100.\n" +
                        "6.Verifica si un número es menor que 50 o mayor que 100.\n" +
                        "7.Comprueba si un número es negativo o si es cero.\n" +
                        "8.Determina si una persona es adulta y no es jubilada.\n" +
                        "9.Verifica si una cadena de texto contiene la palabra \"Java\" y no contiene la palabra \"Python\"\n" +
                        "10.Comprueba si un número es mayor que 100 o si es menor que -100.\n" +
                        "11.Salir"));
                switch (op) {
                    case 1:
                        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
                        NumeroMenorVeinte.verificarNumero(num1);
                        break;
                    case 2:
                        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
                        NumeroDivisible.validarNumDivisible(num2);
                        break;
                    case 3:
                        String cadena = JOptionPane.showInputDialog("Ingresa una cadena de texto:");
                        OperacionesCadena.verificarCadena(cadena);
                        break;

                    case 4:
                        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
                        NumeroMayorCero.comprobarNumero(num3);
                        break;
                    case 5:
                        float nota = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la nota:"));
                        NotaAprobada.validarNota(nota);
                        break;
                    case 6:
                        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
                        NumeroMenorCincuenta.verificarNumero(num4);
                        break;
                    case 7:
                        int num5 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
                        NumeroNegativo.comprobarNumero(num5);
                        break;
                    case 8:
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
                        int option = JOptionPane.showConfirmDialog(null, "¿Está jubilada?",
                                "YES_NO_OPTION", JOptionPane.YES_NO_OPTION,
                                JOptionPane.INFORMATION_MESSAGE);
                        PersonaJubilada.esJubilada(edad, option);
                        break;
                    case 9:
                        String cadena2 = JOptionPane.showInputDialog("Ingresa una cadena de texto:");
                        OperacionesCadena.contienePalabraJava(cadena2);
                        break;
                    case 10:
                        int num6 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
                        NumeroMayorCien.comprobarNumero(num6);
                        break;
                    case 11:
                        bandera = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opción marcada no se encuentra dentro del menú.");
                        break;
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error:"+e,"Advertencia",JOptionPane.ERROR_MESSAGE);
        }
    }
}
