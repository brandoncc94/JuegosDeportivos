
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaisQueries {

    public PaisQueries() {}
    
     // Buscar todos los alojamientos disponibles
    public List seleccionarPaises() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        //List<char> paises = new ArrayList<>();
        ArrayList<String> paises = new ArrayList<>();
        
        try{  
            conn = SQLServerConnector.createConnection();
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
