/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_proc;

/**
 *
 * @author yorvi
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class Empleado {
    
    
    Connection con;
    
    public Empleado(){
        
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados?autoReconnect=true&SSL=false", "root", "");
            
        } catch (Exception e){
            System.err.println("No se pudo establecer la conexion");
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
}
