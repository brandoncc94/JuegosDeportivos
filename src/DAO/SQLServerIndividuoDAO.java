
package DAO;

import Factory.SQLServerDAOFactory;
import Clases.Individuo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLServerIndividuoDAO implements IndividuoDAO {
    
    public SQLServerIndividuoDAO(){ }
   
    // Implement search persons here using the supplied criteria.
    // Alternatively, implement to return a Collection of Transfer Objects.
    @Override
    // Implementación de la creación de un nuevo evento.
    public int insertarIndividuo(Individuo pIndividuo){
        
        Connection conn = null;
        PreparedStatement stmt;
        int rowCount = 0;
        
        try{  
            insertarCompetidor(pIndividuo);
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("INSERT INTO Individuo(idIndividuo,"
                    +" nombre, apellidoP, apellidoM, fechaNacimiento, "
                    + "ocupacion, ciudad) VALUES(?,?,?,?,?,?,?)");
            stmt.setInt(1, pIndividuo.getIdIndividuo());
            stmt.setString(2, pIndividuo.getNombre());
            stmt.setString(3, pIndividuo.getApellidoP());
            stmt.setString(4, pIndividuo.getApellidoM());
            stmt.setDate(5, new java.sql.Date(pIndividuo.getFechaNac().getTime()));
            stmt.setString(6, pIndividuo.getOcupacion());
            stmt.setString(7, pIndividuo.getCiudad());
            
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
    
    // Implementación de la actualización de un nuevo evento.
    @Override
    public int insertarCompetidor(Individuo pIndividuo){
        
        Connection conn = null;
        PreparedStatement stmt;
        int rowCount = 0;
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("INSERT INTO Competidor(tipo,"
                    +" genero, ISO, entrenadorId, alojamientoId "
                    + ") VALUES(?,?,?,?,?)");
            stmt.setString(1, String.valueOf(pIndividuo.getTipo()));
            stmt.setString(2, String.valueOf(pIndividuo.getGenero()));
            stmt.setString(3, String.valueOf(pIndividuo.getPais()));
            stmt.setInt(4, pIndividuo.getEntrenador());
            stmt.setInt(5, pIndividuo.getAlojamiento());
            
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
}

