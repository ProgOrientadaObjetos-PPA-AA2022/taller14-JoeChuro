/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;
import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Joe
 */
public class Enlace {
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarEstudiante(Estudiante estudiante) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO estudiante (nombre,"
                    + "apellido, calificacion1, calificacion2, calificacion3)"
                    + "values ('%s', '%s', '%.2f', '%.2f', '%.2f')", 
                    estudiante.obtenerNombre(),
                    estudiante.obtenerApellido(), estudiante.obtenerCal1(),
                    estudiante.obtenerCal2(), estudiante.obtenerCal3());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<Estudiante> obtenerDataEstudiante() {  
        ArrayList<Estudiante> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante ;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Estudiante e = new Estudiante();
                e.establecerNombre(rs.getString("nombre"));
                e.establecerApellido(rs.getString("apellido"));
                e.establecerCal1(rs.getDouble("calificacion1"));
                e.establecerCal2(rs.getDouble("calificacion2"));
                e.establecerCal3(rs.getDouble("calificacion3"));
                e.establecerPromedio();
                lista.add(e);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarEstudiante");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
}
