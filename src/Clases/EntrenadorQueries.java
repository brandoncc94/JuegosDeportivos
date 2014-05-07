
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntrenadorQueries {
    
    public EntrenadorQueries(){};
    
    public int insertarEntrenador(Entrenador pEntrenador){
        
        Connection conn = null;
        PreparedStatement stmt;
        int rowCount = 0;
        
        try{  
            conn = SQLServerConnector.createConnection();
            stmt = conn.prepareStatement("INSERT INTO Entrenador(idEntrenador, nombre,"
                    +" apellidoP, apellidoM) VALUES(?,?,?,?)");
            stmt.setInt(1, pEntrenador.getIdEntrendor());
            stmt.setString(2, pEntrenador.getNombre());
            stmt.setString(3, pEntrenador.getApellidoP());
            stmt.setString(4, pEntrenador.getApellidoM());
            
            rowCount = stmt.executeUpdate();
        } 
        catch(SQLException e){
            rowCount = -1;
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
        finally{
            if(conn != null){
                try{
                    conn.close();
                }
                catch(SQLException e){
                    System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
                }
            }
        }
        
        return rowCount;
    }

     public List seleccionarEntrenadores() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        List<Integer> entrenadores = new ArrayList<>();
        
        try{  
            conn = SQLServerConnector.createConnection();
            stmt = conn.prepareStatement("SELECT idEntrenador FROM Entrenador");
            rs = stmt.executeQuery();
            
            entrenadores = new ArrayList();
            
            while(rs.next()){
                entrenadores.add(rs.getInt("idEntrenador"));
            }
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
        finally{
            if(conn != null){
                try{
                    conn.close();
                }
                catch(SQLException e){
                    System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
                }
            }
        }
        
        return entrenadores;
    }
}
