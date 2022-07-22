/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author SALA I
 */
public class Trabajador {

    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerNombres(String x) {
        nombres = x;
    }

    public void establecerCorreo(String x) {
        correo = x;
    }

    public void establecerSueldo(double x) {
        sueldo = x;
    }

    public void establecerMesSueldo(String x) {
        mesSueldo = x;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMesSueldo() {
        return mesSueldo;
    }
    public String toString(){
    String cadena = String.format("Cedula: %s\n"
            + "Nombres: %s\n"
            + "correo: %s\n"
            + "sueldo: %.2f"
            + "Mes: %s", nombres, correo, sueldo, mesSueldo);
    return cadena;
    }
}
