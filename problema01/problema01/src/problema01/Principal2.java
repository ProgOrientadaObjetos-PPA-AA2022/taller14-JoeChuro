/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author SALA I
 */
public class Principal2 {

    public static void main(String[] args) {
        // obtenerDatatrabajador
        Enlace c = new Enlace();
        for (int i = 0; i < c.obtenerDatatrabajador().size(); i++) {
            System.out.printf("%s", c.obtenerDatatrabajador().get(i));
        }
    }
}
