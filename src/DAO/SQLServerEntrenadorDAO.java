
package DAO;

import Clases.Entrenador;
import Factory.SQLServerDAOFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLServerEntrenadorDAO implements EntrenadorDAO {
    
    public SQLServerEntrenadorDAO(){ }
   
    // Implement search persons here using the supplied criteria.
    // Alternatively, implement to return a Collection of Transfer Objects.
    @Override
    // Implementación de la creación de un nuevo evento.
    
    public int insertarEntrenador(Entrenador pEntrenador){
        
        Connection conn = null;
        PreparedStatement stmt;
        int rowCount = 0;
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
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

    @Override
    // Buscar todos los alojamientos disponibles
    public List seleccionarEntrenadores() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        List<Integer> entrenadores = new ArrayList<>();
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
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

