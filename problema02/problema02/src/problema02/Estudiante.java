/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author Joe
 */
public class Estudiante {
     private String nombre;
    private String apellido;
    private double cal1;
    private double cal2;
    private double cal3;
    private double promedio;
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerCal1(double x) {
        cal1 = x;
    }

    public void establecerCal2(double x) {
        cal2 = x;
    }

    public void establecerCal3(double x) {
        cal3 = x;
    }
    
    public void establecerPromedio(){
        promedio = (cal1 + cal2+ cal3)/3;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCal1() {
        return cal1;
    }

    public double obtenerCal2() {
        return cal2;
    }

    public double obtenerCal3() {
        return cal3;
    }

    @Override
    public String toString() {
        
        String cadena = String.format("%s %s\n"
                + "\tCalificaciones:\n"
                + "\t%.2f\n"
                + "\t%.2f\n"
                + "\t%.2f\n"
                + "\tPromedio: %.2f\n",
                nombre, apellido, cal1, cal2, cal3, promedio);
        
        return cadena;
    }
  
    
}
