/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import DAO.EventoDAO;
import DAO.SQLServerEventoDAO;

/**
 *
 * @author AAC
 */
public class SQLServerDAOFactory extends DAOFactory {
    
    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // Ref http://technet.microsoft.com/en-us/library/ms378526.aspx
    public static final String DBURL = "jdbc:sqlserver://localhost:1433;databaseName=JuegosDeportivos;integratedSecurity=true"; // Ref http://technet.microsoft.com/en-us/library/ms378428.aspx

    // Method to create SQLServer connections
    public static Connection createConnection() {
        
        Connection conn = null;
        
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(DBURL);
            // If there is an error about PORT IP/TCP is not litening in port 1433 (SQL Server 2012), look this link http://msdn.microsoft.com/en-us/library/ms177440.aspx
        } 
        catch(ClassNotFoundException ex){
            System.out.println("Message: " + ex.getMessage());
        } 
        catch(SQLException ex) {
            System.out.println("Message: " + ex.getMessage() + "\n" + "Code: " + ex.getErrorCode());
        }
        
        return conn;
    }
    
    @Override
    public EventoDAO getEventoDAO() {
        
        // SQLServerPersonDAO implements PersonDAO
        return new SQLServerEventoDAO();
    }
}


