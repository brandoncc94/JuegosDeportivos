
package DAO;

import Clases.Alojamiento;
import Factory.SQLServerDAOFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLServerAlojamientoDAO implements AlojamientoDAO {
    
    public SQLServerAlojamientoDAO(){ }
   
    // Implement search persons here using the supplied criteria.
    // Alternatively, implement to return a Collection of Transfer Objects.
    @Override
    // Implementación de la creación de un nuevo evento.
    
    public int insertarAlojamiento(Alojamiento pAlojamiento){
        
        Connection conn = null;
        PreparedStatement stmt;
        int rowCount = 0;
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("INSERT INTO Alojamiento(nombre,"
                    +" direccion, descripcion) VALUES(?,?,?)");
            stmt.setString(1, pAlojamiento.getNombre());
            stmt.setString(2, pAlojamiento.getDirecion());
            stmt.setString(3, pAlojamiento.getDescripcion());
            
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
    public List seleccionarAlojamientos() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        List<Integer> alojamientos = new ArrayList<>();
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT idAlojamiento FROM Alojamiento");
            rs = stmt.executeQuery();
            
            alojamientos = new ArrayList();
            
            while(rs.next()){
                alojamientos.add(rs.getInt("idAlojamiento"));
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
        
        return alojamientos;
    }
}

