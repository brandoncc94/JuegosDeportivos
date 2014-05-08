
package DAO;

import Clases.Alojamiento;
import Factory.SQLServerDAOFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLServerPaisDAO implements PaisDAO {
    
    public SQLServerPaisDAO(){ }

    @Override
    // Buscar todos los alojamientos disponibles
    public List seleccionarPaises() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        //List<char> paises = new ArrayList<>();
        ArrayList<String> paises = new ArrayList<>();
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT ISO FROM Pais");
            rs = stmt.executeQuery();
            
            paises = new ArrayList();
            
            while(rs.next()){
                paises.add(rs.getString("ISO"));
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
        
        return paises;
    }
}

