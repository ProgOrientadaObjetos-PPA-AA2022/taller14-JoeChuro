/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        boolean bandera = true;
        do {
            Trabajador t = new Trabajador();
            Enlace c = new Enlace();
            System.out.println("Ingrese la cedula: ");
            String ced = sc.nextLine();
            t.establecerCedula(ced);

            System.out.println("Ingrese el nombre: ");
            String nom = sc.nextLine();
            t.establecerNombres(nom);

            System.out.println("Ingrese el correo: ");
            String cor = sc.nextLine();
            t.establecerCorreo(cor);

            System.out.println("Ingrese el sueldo: ");
            double sue = sc.nextDouble();
            sc.nextLine();
            t.establecerSueldo(sue);

            System.out.println("Ingrese el Mes del Sueldo: ");
            String mes = sc.nextLine();
            t.establecerMesSueldo(mes);
            
            c.insertarTrabajador(t);

            System.out.println("PARA SALIR PULSE 1 DE LO CONTRARIO"
                    + " PULSE CUALQUIER OTRA TECLA");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                bandera = false;
            }
        } while (bandera);
    }

}
