/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SQLConnector;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

/**
 *
 * @author AAC
 */
public class SQLServerConnector {

    public static Connection createConnection() { 
        Connection con = null; 
        try { 
            
            SQLServerDataSource ds = new SQLServerDataSource(); 
            //ds.setServerName("localhost");
            ds.setServerName("PMARENCOG\\MSSQLSERVERJMG");
            //ds.setPortNumber(1433);
            ds.setDatabaseName("JuegosDeportivos");
            ds.setIntegratedSecurity(true); 
            con = ds.getConnection(); 
        } catch(Exception e) { 
            System.out.println(e.getMessage());
        } 
        return con; 
    }
}