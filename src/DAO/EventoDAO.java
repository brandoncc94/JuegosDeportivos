
package DAO;

import Clases.Evento;
import java.util.List;

public interface EventoDAO {
    
    public int insertarEvento(Evento pEvento);
    
    public int eliminarEvento(int pId);
    
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