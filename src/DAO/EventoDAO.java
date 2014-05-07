/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import SQLQueries.Evento;
import java.util.Collection;
import java.util.List;
import javax.sql.RowSet;

/**
 *
 * @author AAC
 */
public interface EventoDAO {
    
    // Basic CRUD operations
    
    // Create new person
    public int insertarEvento(Evento pEvento);
    
    // Remove a person
    public int eliminarEvento(int pId);
    
    // Update a person
    public int actualizarEvento(Evento pEvento, int pId);
    
    public List seleccionarInstalaciones();
    
    public List seleccionarClasificaciones();
    
    public List seleccionarMetricas();
    
    public List seleccionarIds();
    
    public void seleccionarDetallesEvento(int pId, javax.swing.JTextField pTxtNombre,
            javax.swing.JComboBox pCmbTipo, javax.swing.JComboBox pCmbGenero, 
            com.toedter.calendar.JDateChooser pCalendarFechaInicio, 
            com.toedter.calendar.JDateChooser pCalendarFechaFin,
            javax.swing.JTextField pTxtRangoInicial, javax.swing.JTextField pTxtRangoFinal,
            javax.swing.JTextField pTxtLimiteSerie, javax.swing.JComboBox pCmbMetrica,
            javax.swing.JComboBox pCmbInstalacion, javax.swing.JComboBox pCmbClasificacion);
}