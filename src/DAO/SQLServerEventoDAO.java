
package DAO;

import Factory.SQLServerDAOFactory;
import SQLQueries.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLServerEventoDAO implements EventoDAO {
    
    public SQLServerEventoDAO(){ }
   
    // Implement search persons here using the supplied criteria.
    // Alternatively, implement to return a Collection of Transfer Objects.
    @Override
    // Implementación de la creación de un nuevo evento.
    public int insertarEvento(Evento pEvento) {
        
        Connection conn = null;
        PreparedStatement stmt;
        int rowCount = 0;
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("INSERT INTO Evento(nombre, tipoCompetidor,"
                    +" genero, fechaInicio, fechaFin, rangoInicial, rangoFinal,"
                    + " limiteSerie, metricaId, instalacionId, clasificacionId) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, pEvento.getNombre());
            stmt.setString(2, String.valueOf(pEvento.getTipo()));
            stmt.setString(3, String.valueOf(pEvento.getGenero()));
            stmt.setDate(4, new java.sql.Date(pEvento.getFechaInicio().getTime()));
            stmt.setDate(5, new java.sql.Date(pEvento.getFechaFin().getTime()));
            stmt.setInt(6, pEvento.getRangoInicial());
            stmt.setInt(7, pEvento.getRangoFinal());
            stmt.setInt(8, pEvento.getLimiteSerie());
            stmt.setInt(9, pEvento.getMetrica());
            stmt.setInt(10, pEvento.getInstalacionId());
            stmt.setInt(11, pEvento.getClasificacionId());
            
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
    public int actualizarEvento(Evento pEvento, int pId) {
        
        Connection conn = null;
        PreparedStatement stmt;
        int rowCount = 0;
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("UPDATE Evento "
                    + "SET nombre = ?,"
                    + "tipoCompetidor = ?,"
                    + "genero = ?,"
                    + "fechaInicio = ?,"
                    + "fechaFin = ?,"
                    + "rangoInicial = ?,"
                    + "rangoFinal = ?,"
                    + "limiteSerie = ?,"
                    + "metricaId = ?,"
                    + "instalacionId = ?,"
                    + "clasificacionId = ? "
                    + "WHERE idEvento = " + pId);
            
                    stmt.setString(1, pEvento.getNombre());
                    stmt.setString(2, String.valueOf(pEvento.getTipo()));
                    stmt.setString(3, String.valueOf(pEvento.getGenero()));
                    stmt.setDate(4, new java.sql.Date(pEvento.getFechaInicio().getTime()));
                    stmt.setDate(5, new java.sql.Date(pEvento.getFechaFin().getTime()));
                    stmt.setInt(6, pEvento.getRangoInicial());
                    stmt.setInt(7, pEvento.getRangoFinal());
                    stmt.setInt(8, pEvento.getLimiteSerie());
                    stmt.setInt(9, pEvento.getMetrica());
                    stmt.setInt(10, pEvento.getInstalacionId());
                    stmt.setInt(11, pEvento.getClasificacionId());
                      
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
    
    
    // Implementación de la eliminación de un nuevo evento.
    @Override
    public int eliminarEvento(int pId) {
        
        Connection conn = null;
        PreparedStatement stmt;
        int rowCount = 0;
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("DELETE "
                    + "FROM evento "
                    + "WHERE idEvento = " + pId);
                      
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
    
    
    // Buscar todas las instalaciones disponibles
    @Override
    public List seleccionarInstalaciones() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        List<Integer> instalaciones = new ArrayList<>();
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT idInstalacion FROM Instalacion");
            rs = stmt.executeQuery();
            
            instalaciones = new ArrayList();
            
            while(rs.next()){
                instalaciones.add(rs.getInt("idInstalacion"));
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
        
        return instalaciones;
    }
    
    // Buscar todas las instalaciones disponibles
    @Override
    public List seleccionarClasificaciones() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        List<Integer> clasificaciones = new ArrayList<>();
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT idClasificacion FROM Clasificacion");
            rs = stmt.executeQuery();
            
            clasificaciones = new ArrayList();
            
            while(rs.next()){
                clasificaciones.add(rs.getInt("idClasificacion"));
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
        
        return clasificaciones;
    }
    
    // Buscar todas las métricas disponibles
    @Override
    public List seleccionarMetricas() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        List<Integer> metricas = new ArrayList<>();
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT idMetrica FROM Metrica");
            rs = stmt.executeQuery();
            
            metricas = new ArrayList();
            
            while(rs.next()){
                metricas.add(rs.getInt("idMetrica"));
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
        
        return metricas;
    }
    
    // Buscar todos los Id's disponibles
    @Override
    public List seleccionarIds() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        List<Integer> ids = new ArrayList<>();
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT idEvento FROM Evento");
            rs = stmt.executeQuery();
            
            ids = new ArrayList();
            
            while(rs.next()){
                ids.add(rs.getInt("idEvento"));
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
        
        return ids;
    }
    
    
    // Buscar todas los detalles del Evento 
    @Override
    public void seleccionarDetallesEvento(int pId, javax.swing.JTextField pTxtNombre,
            javax.swing.JComboBox pCmbTipo, javax.swing.JComboBox pCmbGenero, 
            com.toedter.calendar.JDateChooser pCalendarFechaInicio, 
            com.toedter.calendar.JDateChooser pCalendarFechaFin,
            javax.swing.JTextField pTxtRangoInicial, javax.swing.JTextField pTxtRangoFinal,
            javax.swing.JTextField pTxtLimiteSerie, javax.swing.JComboBox pCmbMetrica,
            javax.swing.JComboBox pCmbInstalacion, javax.swing.JComboBox pCmbClasificacion) {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        
        try{  
            conn = SQLServerDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT nombre, tipoCompetidor,"
                    + "genero, fechaInicio, fechaFin, rangoInicial, rangoFinal,"
                    + " limiteSerie, metricaId, instalacionId, clasificacionId"
                    + " FROM Evento WHERE idEvento = "+ pId);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                pTxtNombre.setText(rs.getString("nombre"));
                pTxtRangoInicial.setText(rs.getString("rangoInicial"));
                pTxtRangoFinal.setText(rs.getString("rangoFinal"));
                pTxtLimiteSerie.setText(rs.getString("limiteSerie"));
                pCmbTipo.setSelectedItem(rs.getString("tipoCompetidor"));
                pCmbGenero.setSelectedItem(rs.getString("genero"));
                pCalendarFechaInicio.setDate(rs.getDate("fechaInicio"));
                pCalendarFechaFin.setDate(rs.getDate("fechaFin"));
                pCmbMetrica.setSelectedItem(rs.getInt("metricaId"));
                pCmbInstalacion.setSelectedItem(rs.getInt("instalacionId"));
                pCmbClasificacion.setSelectedItem(rs.getInt("clasificacionId"));
            }
            
            pTxtNombre.setEnabled(true);
            pTxtRangoInicial.setEnabled(true);
            pTxtRangoFinal.setEnabled(true);
            pTxtLimiteSerie.setEnabled(true);
            pCmbTipo.setEnabled(true);
            pCmbGenero.setEnabled(true);
            pCalendarFechaInicio.setEnabled(true);
            pCalendarFechaFin.setEnabled(true);
            pCmbMetrica.setEnabled(true);
            pCmbInstalacion.setEnabled(true);
            pCmbClasificacion.setEnabled(true);            
            
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
    }
}
